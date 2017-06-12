/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;
import bazadanych_projekt.jdbcexample.dao.LotstewardessaDao;
import bazadanych_projekt.jdbcexample.model.Lotstewardessa;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Pasazer;
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
public class JdbcLotstewardessaDao implements LotstewardessaDao {

    @Override
    public void save(Lotstewardessa p) {
      final String SQL = "insert into lot_stewardessa values (?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setInt(1, p.getNr_lotu());
                statement.setInt(2, p.getId_stewardessy());
                statement.setString(3, p.getFunkcja());
               
              
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
    public void delete(Integer nr, Integer id) {
        final String SQL = "delete from lot_stewardessa where nr_lotu=? and id_stewardessy = ?";
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setEscapeProcessing(true);
                    statement.setInt(1, nr);
                    statement.setInt(2, id);
                            
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
    public Lotstewardessa findById(Integer nr, Integer id) {
        final String SQL = "select * from lot_stewardessa where nr_lotu=? and id_stewardessy =?";
            Lotstewardessa result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setInt(1, nr);
                    statement.setInt(2, id);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Lotstewardessa();
                            result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setId_stewardessy(rs.getInt("id_stewardessy"));
                            result.setFunkcja(rs.getString("funkcja"));
                            
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
    public List<Lotstewardessa> findAll() {
         List<Lotstewardessa> list = new LinkedList<>();
        final String SQL = "select * from Lot_stewardessa";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Lotstewardessa result = new Lotstewardessa();
                            result.setNr_lotu(rs.getInt("nr_lotu"));
                            result.setId_stewardessy(rs.getInt("id_stewardessy"));
                            result.setFunkcja(rs.getString("funkcja"));
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
