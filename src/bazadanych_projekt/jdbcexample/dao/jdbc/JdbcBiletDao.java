/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;

import bazadanych_projekt.jdbcexample.dao.BiletDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Bilet;
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
public class JdbcBiletDao implements BiletDao {

    @Override
    public void save(Bilet p) {
        final String SQL = "insert into Bilet values (DEFAULT,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL)) {
               // statement.setEscapeProcessing(true);
                statement.setInt(1, p.getId_pasazera());
                statement.setInt(2, p.getNr_lotu());
                statement.setDouble(3, p.getCena());
                statement.setString(4, p.getNumer_siedzenia());                            
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
         final String SQL = "delete from bilet where id_biletu=?";
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
    public Bilet findById(Integer id) {
        final String SQL = "select * from bilet where nr_biletu=?";
            Bilet result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setInt(1, id);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Bilet();
                            result.setId_biletu(rs.getInt("nr_biletu"));
                            result.setId_pasazera(rs.getInt("id_pasazera"));
                            result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setCena(rs.getDouble("cena"));
                            result.setNumer_siedzenia(rs.getString("numer_siedzenia"));
                            
                            
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
    public List<Bilet> findAll() {
        List<Bilet> list = new LinkedList<>();
        final String SQL = "select * from bilet";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println("!");
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Bilet result = new Bilet();
                        result.setId_biletu(rs.getInt("nr_biletu"));
                            result.setId_pasazera(rs.getInt("id_pasazera"));
                            result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setCena(rs.getDouble("cena"));
                            result.setNumer_siedzenia(rs.getString("numer_siedzenia"));
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
