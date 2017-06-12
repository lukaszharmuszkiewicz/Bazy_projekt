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
public class Linialotnicza {
    Integer id_liniilotniczej;
    String nazwa;
    String kraj;

    public Integer getId_liniilotniczej() {
        return id_liniilotniczej;
    }

    public void setId_liniilotniczej(Integer id_liniilotniczej) {
        this.id_liniilotniczej = id_liniilotniczej;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }
    
    public String toString(){
        return id_liniilotniczej+", "+nazwa+", "+kraj;
    }
    
}
