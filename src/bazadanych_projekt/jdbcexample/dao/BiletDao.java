/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Bilet;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface BiletDao {
     void save(Bilet p);
    void delete (Integer id);
    void update (Integer isbn, String title);
    Bilet findById(Integer id);
    List<Bilet> findAll();
}
