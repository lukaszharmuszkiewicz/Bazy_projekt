/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.dao;
import bazadanych_projekt.jdbcexample.model.Pasazer;
import java.util.List;

/**
 *
 * @author Lenovo
 */

    
    public interface PasazerDao  {
    void save(Pasazer p);
    void delete (String p);
    void update_nazwisko (String pesel, String wartosc);
    void update_narodowosc(String pesel, String wartosc);
    Pasazer findById(String pesel);
    List<Pasazer> findAll();
}

