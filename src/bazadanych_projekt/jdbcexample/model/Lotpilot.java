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
public class Lotpilot {
    Integer id_pilota;
    Integer nr_lotu;

    public Integer getId_pilota() {
        return id_pilota;
    }

    public void setId_pilota(Integer id_pilota) {
        this.id_pilota = id_pilota;
    }

    public Integer getNr_lotu() {
        return nr_lotu;
    }

    public void setNr_lotu(Integer nr_lotu) {
        this.nr_lotu = nr_lotu;
    }
    
    public String toString(){
        return id_pilota+", "+nr_lotu;
    }
    
}
