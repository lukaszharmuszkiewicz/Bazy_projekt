/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.SamolotDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Pilot;
import bazadanych_projekt.jdbcexample.model.Samolot;
import bazadanych_projekt.jdbcexample.model.Stewardessa;
import bazadanych_projekt.jdbcexample.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class JdbcSamolotDao implements SamolotDao {

    @Override
    public void save(Samolot p) {
        final String SQL = "insert into Samolot values (DEFAULT,?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
            
                statement.setInt(1, p.getId_linii_lotniczej());
                statement.setString(2, p.getProducent());
                statement.setString(3, p.getModel());
                statement.setInt(4, p.getIlosc_miejsc());
                statement.setDate(5,p.getRok_produkcji());
                statement.setString(6,p.getRodzaj());
                            
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
    public void delete(Integer id) {
        final String SQL = "delete from samolot where nr_samolotu=?";
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setEscapeProcessing(true);
                    statement.setInt(1, id);
                    statement.executeUpdate();

                } catch (SQLException ex) {
                    throw new DataAccessException(ex);
                }
            }
            catch (SQLException ex) {
                throw new DataAccessException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcPasazerDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void update(Integer isbn, String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Samolot findById(Integer nr) {
         final String SQL = "select * from samolot where nr_samolotu=?";
            Samolot result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setInt(1, nr);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Samolot();
                            result.setNr_samolotu(rs.getInt("nr_samolotu"));
                            result.setId_linii_lotniczej(rs.getInt("id_linii_lotniczej"));
                            result.setProducent(rs.getString("producent"));
                            result.setModel(rs.getString("model"));
                            result.setIlosc_miejsc(rs.getInt("ilosc_miejsc"));
                            result.setRok_produkcji(rs.getDate("rok_produkcji"));
                            result.setRodzaj(rs.getString("rodzaj"));
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
    public List<Samolot> findAll() {
        List<Samolot> list = new LinkedList<>();
        final String SQL = "select * from samolot";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Samolot result = new Samolot();
                            result.setNr_samolotu(rs.getInt("nr_samolotu"));
                            result.setId_linii_lotniczej(rs.getInt("id_linii_lotniczej"));
                            result.setProducent(rs.getString("producent"));
                            result.setModel(rs.getString("model"));
                            result.setIlosc_miejsc(rs.getInt("ilosc_miejsc"));
                            result.setRok_produkcji(rs.getDate("rok_produkcji"));
                            result.setRodzaj(rs.getString("rodzaj"));
                            //System.out.print("!");
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
    
}
