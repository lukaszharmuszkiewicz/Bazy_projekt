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
public class Bilet {
    Integer id_biletu;

    public Integer getId_biletu() {
        return id_biletu;
    }

    public void setId_biletu(Integer id_biletu) {
        this.id_biletu = id_biletu;
    }
    Integer id_pasazera;
    Integer nr_lotu;
    Double cena;
    String numer_siedzenia;

    public Integer getId_pasazera() {
        return id_pasazera;
    }

    public void setId_pasazera(Integer id_pasazera) {
        this.id_pasazera = id_pasazera;
    }

    public Integer getNr_lotu() {
        return nr_lotu;
    }

    public void setNr_lotu(Integer nr_lotu) {
        this.nr_lotu = nr_lotu;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getNumer_siedzenia() {
        return numer_siedzenia;
    }

    public void setNumer_siedzenia(String numer_siedzenia) {
        this.numer_siedzenia = numer_siedzenia;
    }
    
    public String toString(){
        return id_biletu+", "+id_pasazera+", "+nr_lotu+", "+cena+", "+numer_siedzenia; 
    }
    
    
    
}
