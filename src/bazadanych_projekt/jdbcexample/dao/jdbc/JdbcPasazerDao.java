/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.PasazerDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Pasazer;
import bazadanych_projekt.jdbcexample.util.ConnectionFactory;

//import wipb.jdbcexample.exception.DataAccessException;
//import wipb.jdbcexample.util.ConnectionFactory;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcPasazerDao implements PasazerDao {

    @Override
    public void save(Pasazer t) {

        final String SQL = "insert into pasażer values (DEFAULT, ?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, t.getImie());
                statement.setString(2, t.getNazwisko());
                statement.setString(3, t.getNarodowosc());
                statement.setString(4, t.getPesel());
                statement.setString(5, t.getNr_paszportu());

                statement.executeUpdate();

            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String pesel) {
        final String SQL = "delete from pasażer where pesel = ?";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, pesel);
                statement.execute();
            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update_nazwisko(String pesel, String wartosc) {

        String SQL = "update pasażer set nazwisko = ? where pesel = ?";

        try (Connection conn = ConnectionFactory.getConnection()) {

            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, wartosc);
                statement.setString(2, pesel);
                statement.executeUpdate();

            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Pasazer findById(String pesel) {
        final String SQL = "select * from pasażer where pesel=?";
        Pasazer result = null;
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                statement.setString(1, pesel);
                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        result = new Pasazer();
                        result.setId_pasazera(rs.getInt("id_pasazera"));
                        result.setPesel(rs.getString("pesel"));
                        result.setImie(rs.getString("Imie"));
                        result.setNazwisko(rs.getString("Nazwisko"));
                        result.setNarodowosc(rs.getString("narodowosc"));
                        result.setNr_paszportu(rs.getString("nr_paszportu"));
                    }
                } catch (SQLException ex) {
                    throw new DataAccessException(ex);
                }
            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }

    @Override
    public List<Pasazer> findAll() {
        List<Pasazer> list = new LinkedList<>();
        final String SQL = "select * from pasażer";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL)) {

                try (ResultSet rs = statement.executeQuery()) {
                    while (rs.next()) {
                        Pasazer result = new Pasazer();
                        result.setId_pasazera(rs.getInt("id_pasazera"));
                        result.setImie(rs.getString("imie"));
                        result.setNazwisko(rs.getString("nazwisko"));
                        result.setNr_paszportu(rs.getString("nr_paszportu"));
                        result.setNarodowosc(rs.getString("narodowosc"));
                        result.setPesel(rs.getString("pesel"));
                        list.add(result);

                    }
                } catch (SQLException ex) {
                    throw new DataAccessException(ex);
                }
            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return list;
    }

    @Override
    public void update_narodowosc(String pesel, String wartosc) {
        String SQL = "update pasażer set narodowosc = ? where pesel = ?";

        try (Connection conn = ConnectionFactory.getConnection()) {

            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, wartosc);
                statement.setString(2, pesel);
                statement.executeUpdate();
            } catch (SQLException ex) {
                throw new DataAccessException(ex);
            }
        } catch (SQLException ex) {
            throw new DataAccessException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
