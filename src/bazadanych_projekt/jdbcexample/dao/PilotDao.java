/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Pilot;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface PilotDao {
      void save(Pilot p);
    void delete (String pelel);
    void update (Integer isbn, String title);
    Pilot findById(String pesel);
    List<Pilot> findAll();
}
