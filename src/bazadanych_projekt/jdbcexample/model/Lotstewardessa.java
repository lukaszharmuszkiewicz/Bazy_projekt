/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.model;

/**
 *
 * @author Lenovo
 */
public class Lotstewardessa {
  Integer nr_lotu;
  Integer id_stewardessy;
  String funkcja;

    public Integer getNr_lotu() {
        return nr_lotu;
    }

    public void setNr_lotu(Integer nr_lotu) {
        this.nr_lotu = nr_lotu;
    }

    public Integer getId_stewardessy() {
        return id_stewardessy;
    }

    public void setId_stewardessy(Integer id_stewardessy) {
        this.id_stewardessy = id_stewardessy;
    }

    public String getFunkcja() {
        return funkcja;
    }

    public void setFunkcja(String funkcja) {
        this.funkcja = funkcja;
    }
    
    public String toString(){
        return nr_lotu+", "+id_stewardessy+", "+funkcja;
    }
  
  
}
