/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Lotpilot;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface LotpilotDao {
     void save(Lotpilot p);
    void delete (Integer nr, Integer id);
    void update (Integer isbn, String title);
    Lotpilot findById(Integer nr);
    List<Lotpilot> findAll();
}
