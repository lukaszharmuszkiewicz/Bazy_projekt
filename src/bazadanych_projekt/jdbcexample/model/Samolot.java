/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.model;

import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class Samolot {
    Integer nr_samolotu;
    Integer id_linii_lotniczej;
    String producent;
    String model;
    Integer ilosc_miejsc;
    Date rok_produkcji;
    String rodzaj;

    public Integer getNr_samolotu() {
        return nr_samolotu;
    }

    public void setNr_samolotu(Integer nr_samolotu) {
        this.nr_samolotu = nr_samolotu;
    }

    public Integer getId_linii_lotniczej() {
        return id_linii_lotniczej;
    }

    public void setId_linii_lotniczej(Integer id_linii_lotniczej) {
        this.id_linii_lotniczej = id_linii_lotniczej;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getIlosc_miejsc() {
        return ilosc_miejsc;
    }

    public void setIlosc_miejsc(Integer ilosc_miejsc) {
        this.ilosc_miejsc = ilosc_miejsc;
    }

    public Date getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(Date rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
    
    public String toString(){
        //return nr_samolotu+", "+Int.toStr(id_linii_lotniczej)+", "+producent+", "+model+", "+rodzaj+;
        return nr_samolotu+", " +id_linii_lotniczej+", "+producent+", "+model+", "+rodzaj;
    }
    
}
