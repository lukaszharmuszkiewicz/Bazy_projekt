/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Linialotnicza;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface LinialotniczaDao {
     void save(Linialotnicza p);
    void delete (Integer id);
    void update (Integer isbn, String title);
    Linialotnicza findById(Integer id);
    List<Linialotnicza> findAll();
}
