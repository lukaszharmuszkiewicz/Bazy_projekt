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
public class Lotnisko {
    String id_lotniska;
    String miasto;
    String panstwo;
    Integer liczba_terminali;
    String strefa_czasowa;

    public String getId_lotniska() {
        return id_lotniska;
    }

    public void setId_lotniska(String id_lotniska) {
        this.id_lotniska = id_lotniska;
    }
    
            
        
    

    

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getPanstwo() {
        return panstwo;
    }

    public void setPanstwo(String panstwo) {
        this.panstwo = panstwo;
    }

    public Integer getLiczba_terminali() {
        return liczba_terminali;
    }

    public void setLiczba_terminali(Integer liczba_terminali) {
        this.liczba_terminali = liczba_terminali;
    }

    public String getStrefa_czasowa() {
        return strefa_czasowa;
    }

    public void setStrefa_czasowa(String strefa_czasowa) {
        this.strefa_czasowa = strefa_czasowa;
    }
    
    public String toString(){
        return id_lotniska+", "+miasto+", "+panstwo+", "+liczba_terminali+", "+strefa_czasowa;
    }
}
