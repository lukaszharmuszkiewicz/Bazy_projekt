/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Samolot;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface SamolotDao {
      void save(Samolot p);
    void delete (Integer id);
    void update (Integer isbn, String title);
    Samolot findById(Integer nr);
    List<Samolot> findAll();
}
