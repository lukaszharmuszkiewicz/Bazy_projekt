/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample.model;

//import java.sql.Date;



public class Pasazer {
    Integer id_pasazera;
    String imie;
    String nazwisko;
    String narodowosc;
    String pesel;
    String nr_paszportu;

    public Integer getId_pasazera() {
        return id_pasazera;
    }

    public void setId_pasazera(Integer id_pasazera) {
        this.id_pasazera = id_pasazera;
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

    public String getNr_paszportu() {
        return nr_paszportu;
    }

    public void setNr_paszportu(String nr_paszportu) {
        this.nr_paszportu = nr_paszportu;
    }
           
    public String toString(){
        return id_pasazera+", "+imie+", "+nazwisko+", "+pesel+", "+narodowosc;
    }
    
}
