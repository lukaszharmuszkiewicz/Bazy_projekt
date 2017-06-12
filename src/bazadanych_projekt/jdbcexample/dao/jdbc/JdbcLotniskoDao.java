/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao.jdbc;
import bazadanych_projekt.jdbcexample.dao.LotniskoDao;
import bazadanych_projekt.jdbcexample.exception.DataAccessException;
import bazadanych_projekt.jdbcexample.model.Lotnisko;
import bazadanych_projekt.jdbcexample.util.ConnectionFactory;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class JdbcLotniskoDao implements LotniskoDao {

    @Override
    public void save(Lotnisko p) {
        final String SQL = "insert into lotnisko values (?,?,?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setEscapeProcessing(true);
                statement.setString(1, p.getId_lotniska());
                statement.setString(2, p.getMiasto());
                statement.setString(3, p.getPanstwo());
                statement.setInt(4, p.getLiczba_terminali());
                statement.setString(5, p.getStrefa_czasowa());              
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
    public void delete(String id_lotniska) {
           final String SQL = "delete from lotnisko where id_lotniska=?";
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    statement.setEscapeProcessing(true);
                    statement.setString(1, id_lotniska);
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
    public Lotnisko findById(String pesel) {
        final String SQL = "select * from lotnisko where id_lotniska=?";
            Lotnisko result = null;
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                    statement.setString(1, pesel);
                    try (ResultSet rs = statement.executeQuery()) {
                        if (rs.next()) {
                            result = new Lotnisko();
                            result.setId_lotniska(rs.getString("id_lotniska"));
                            result.setMiasto(rs.getString("miasto"));
                            result.setPanstwo(rs.getString("panstwo"));
                            result.setLiczba_terminali(rs.getInt("liczba_terminali"));
                            result.setStrefa_czasowa(rs.getString("strefa_czasowa"));                       
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
    public List<Lotnisko> findAll() {
        List<Lotnisko> list = new LinkedList<>();
        final String SQL = "select * from lotnisko";
           // Pasazer result = null;
        
            try (Connection conn = ConnectionFactory.getConnection()) {
                try (PreparedStatement statement = conn.prepareStatement(SQL)) {
                  
                    try (ResultSet rs = statement.executeQuery()) {
                        //System.out.println(rs.getRow());
                        while(rs.next()) {
                            Lotnisko result = new Lotnisko();
                            result.setId_lotniska(rs.getString("id_lotniska"));
                            result.setMiasto(rs.getString("miasto"));
                            result.setPanstwo(rs.getString("panstwo"));
                            result.setLiczba_terminali(rs.getInt("liczba_terminali"));
                            result.setStrefa_czasowa(rs.getString("strefa_czasowa"));

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
  
    

