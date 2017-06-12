/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.LotDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Lot;
import bazadanych_projekt.jdbcexample.model.Lotnisko;
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
public class JdbcLotDao implements LotDao {

    @Override
    public void save(Lot p) {
        final String SQL = "insert into Lot values (DEFAULT,?,?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setInt(1, p.getSamolot());
                statement.setString(2, p.getLotnikso_startowe());
                statement.setString(3, p.getLotnisko_docelowe());
                statement.setDate(4,p.getData_wylotu());
                statement.setTime(5, p.getGodzina_wylotu());
                statement.setTime(6, p.getGodzina_ladowania());
                       
                            
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
    public void delete(Integer nr_lotu) {
        final String SQL = "delete from Lot where nr_lotu=?";
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setEscapeProcessing(true);
                    statement.setInt(1, nr_lotu);
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
    public Lot findById(Integer nr_lotu) {
        final String SQL = "select * from Lot where nr_lotu=?";
            Lot result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setInt(1, nr_lotu);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Lot();
                            result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setSamolot(rs.getInt("samolot"));
                            result.setLotnikso_startowe(rs.getString("lotnisko_startowe"));
                            result.setLotnisko_docelowe(rs.getString("lotnisko_docelowe"));
                            result.setData_wylotu(rs.getDate("data_wylotu"));
                            result.setGodzina_wylotu(rs.getTime("godzina_wylotu"));
                            result.setGodzina_ladowania(rs.getTime("godzina_ladowania"));
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
    public List<Lot> findAll() {
        List<Lot> list = new LinkedList<>();
        final String SQL = "select * from lot";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Lot result = new Lot();
                               result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setSamolot(rs.getInt("samolot"));
                            result.setLotnikso_startowe(rs.getString("lotnisko_startowe"));
                            result.setLotnisko_docelowe(rs.getString("lotnisko_docelowe"));
                            result.setData_wylotu(rs.getDate("data_wylotu"));
                            result.setGodzina_wylotu(rs.getTime("godzina_wylotu"));
                            result.setGodzina_ladowania(rs.getTime("godzina_ladowania"));

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
