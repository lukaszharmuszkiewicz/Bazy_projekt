/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.PilotDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Pilot;
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
public class JdbcPilotDao implements PilotDao {

    @Override
    public void save(Pilot p) {
        final String SQL = "insert into pilot values (DEFAULT, ?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, p.getImie());
                statement.setString(2, p.getNazwisko());
                statement.setInt(3, p.getNr_licencji());
                statement.setDate(4, p.getData_urodzenia());              
                statement.setString(5, p.getNarodowosc());
                statement.setString(6, p.getPesel());
              
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
        final String SQL = "delete from pilot where pesel=?";
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setEscapeProcessing(true);
                    statement.setString(1, pesel);
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
    public Pilot findById(String pesel) {
        final String SQL = "select * from pilot where pesel=?";
            Pilot result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setString(1, pesel);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Pilot();
                            result.setId_pilota(rs.getInt("id_pilota"));
                            result.setImie(rs.getString("imie"));
                            result.setNazwisko(rs.getString("nazwisko"));
                            result.setNr_licencji(rs.getInt("nr_licencji"));
                            result.setNarodowosc(rs.getString("narodowosc"));
                            result.setData_urodzenia(rs.getDate("data_urodzenia"));
                            result.setPesel(rs.getString("pesel"));
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
    public List<Pilot> findAll() {
       List<Pilot> list = new LinkedList<>();
        final String SQL = "select * from pilot";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Pilot result = new Pilot();
                            result.setId_pilota(rs.getInt("id_pilota"));
                            result.setImie(rs.getString("imie"));
                            result.setNazwisko(rs.getString("nazwisko"));
                            result.setNr_licencji(rs.getInt("nr_licencji"));
                            result.setNarodowosc(rs.getString("narodowosc"));
                            result.setData_urodzenia(rs.getDate("data_urodzenia"));
                            result.setPesel(rs.getString("pesel"));
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
    

