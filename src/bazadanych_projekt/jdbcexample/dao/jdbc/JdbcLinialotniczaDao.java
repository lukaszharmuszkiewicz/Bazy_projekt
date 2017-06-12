/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.LinialotniczaDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Linialotnicza;
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
public class JdbcLinialotniczaDao implements LinialotniczaDao {

    @Override
    public void save(Linialotnicza p) {
        final String SQL = "insert into Linia_lotnicza values (DEFAULT,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, p.getNazwa());
                statement.setString(2, p.getKraj());
                            
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
        final String SQL = "delete from Linia_lotnicza where id_linii_lotniczej=?";
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
    public Linialotnicza findById(Integer id) {
        final String SQL = "select * from linia_lotnicza where id_linii_lotniczej=?";
            Linialotnicza result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setInt(1, id);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Linialotnicza();
                            result.setId_liniilotniczej(rs.getInt("id_linii_lotniczej"));
                            result.setKraj(rs.getString("kraj"));
                            result.setNazwa(rs.getString("nazwa"));
                            
                            
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
    public List<Linialotnicza> findAll() {
        List<Linialotnicza> list = new LinkedList<>();
        final String SQL = "select * from linia_lotnicza";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Linialotnicza result = new Linialotnicza();
                            result.setId_liniilotniczej(rs.getInt("id_linii_lotniczej"));
                            result.setKraj(rs.getString("kraj"));
                            result.setNazwa(rs.getString("nazwa"));
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
