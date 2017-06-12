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
public class Stewardessa {
    
    Integer id_sterwardessy;
    String imie;
    String nazwisko;
    Integer wzrost;

    public Integer getId_sterwardessy() {
        return id_sterwardessy;
    }

    public void setId_sterwardessy(Integer id_sterwardessy) {
        this.id_sterwardessy = id_sterwardessy;
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

    public Integer getWzrost() {
        return wzrost;
    }

    public void setWzrost(Integer wzrost) {
        this.wzrost = wzrost;
    }
    
    public String toString(){
        return id_sterwardessy+", "+imie+", "+nazwisko+", "+wzrost;
    }
    
}
