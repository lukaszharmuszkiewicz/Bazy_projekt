/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.model;

import java.sql.Date;


public class Pilot {
   Integer id_pilota;
   String imie;
   String nazwisko;
   Integer nr_licencji;
   Date data_urodzenia;
   String narodowosc;
   String pesel;

    public Integer getId_pilota() {
        return id_pilota;
    }

    public void setId_pilota(Integer id_pilota) {
        this.id_pilota = id_pilota;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getNr_licencji() {
        return nr_licencji;
    }

    public void setNr_licencji(Integer nr_licencji) {
        this.nr_licencji = nr_licencji;
    }

    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
   
      
   public String toString(){
       return imie+", "+nazwisko+", "+narodowosc+", "+pesel;
   }
//CREATE TABLE Pilot(
//id_pilota NUMBER(3) PRIMARY KEY,
//imie varchar2(20),
//nazwisko varchar2(30),
//nr_licencji number(6),
//data_urodzenia date,
//narodowosc varchar2(3),
//PESEL varchar2(13)

    
}
