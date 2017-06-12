/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Lenovo
 */
public class Lot {
   Integer nr_lotu;
   Integer samolot;
   String lotnikso_startowe;
   String lotnisko_docelowe;
   Date data_wylotu;
   Time godzina_wylotu;
   Time godzina_ladowania;

    public Time getGodzina_wylotu() {
        return godzina_wylotu;
    }

    public void setGodzina_wylotu(Time godzina_wylotu) {
        this.godzina_wylotu = godzina_wylotu;
    }

    public Time getGodzina_ladowania() {
        return godzina_ladowania;
    }

    public void setGodzina_ladowania(Time godzina_ladowania) {
        this.godzina_ladowania = godzina_ladowania;
    }

    public Date getData_wylotu() {
        return data_wylotu;
    }

    public void setData_wylotu(Date data_wylotu) {
        this.data_wylotu = data_wylotu;
    }



    public Integer getNr_lotu() {
        return nr_lotu;
    }

    public void setNr_lotu(Integer nr_lotu) {
        this.nr_lotu = nr_lotu;
    }

    public Integer getSamolot() {
        return samolot;
    }

    public void setSamolot(Integer samolot) {
        this.samolot = samolot;
    }

 

    public String getLotnikso_startowe() {
        return lotnikso_startowe;
    }

    public void setLotnikso_startowe(String lotnikso_startowe) {
        this.lotnikso_startowe = lotnikso_startowe;
    }

    public String getLotnisko_docelowe() {
        return lotnisko_docelowe;
    }

    public void setLotnisko_docelowe(String lotnisko_docelowe) {
        this.lotnisko_docelowe = lotnisko_docelowe;
    }


   
   public String toString(){
       return nr_lotu+", "+samolot+", "+data_wylotu+", "+godzina_wylotu+", "+godzina_ladowania+", "+lotnikso_startowe+", "+lotnisko_docelowe;
   }
   
}
