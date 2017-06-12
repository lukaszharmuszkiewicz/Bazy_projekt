/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;
import bazadanych_projekt.jdbcexample.model.Lotnisko;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface LotniskoDao {
    
    
    void save(Lotnisko p);
    void delete (String p);
    void update (Integer isbn, String title);
    Lotnisko findById(String pesel);
    List<Lotnisko> findAll();
}
    

