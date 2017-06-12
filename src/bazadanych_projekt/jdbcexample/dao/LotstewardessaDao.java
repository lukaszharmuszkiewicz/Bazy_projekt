/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;

import bazadanych_projekt.jdbcexample.model.Lotstewardessa;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface LotstewardessaDao {
    void save(Lotstewardessa p);
    void delete (Integer nr, Integer id);
    void update (Integer isbn, String title);
    Lotstewardessa findById(Integer nr, Integer id);
    List<Lotstewardessa> findAll();
}
