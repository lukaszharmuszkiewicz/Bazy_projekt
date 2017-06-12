/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazadanych_projekt.jdbcexample;

import bazadanych_projekt.jdbcexample.dao.BiletDao;
import bazadanych_projekt.jdbcexample.dao.LinialotniczaDao;
import bazadanych_projekt.jdbcexample.dao.LotDao;
import bazadanych_projekt.jdbcexample.dao.LotniskoDao;
import bazadanych_projekt.jdbcexample.dao.LotpilotDao;
import bazadanych_projekt.jdbcexample.dao.LotstewardessaDao;
import bazadanych_projekt.jdbcexample.dao.PasazerDao;
import bazadanych_projekt.jdbcexample.dao.PilotDao;
import bazadanych_projekt.jdbcexample.dao.SamolotDao;
import bazadanych_projekt.jdbcexample.dao.StewardessaDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcBiletDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcLinialotniczaDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcLotDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcLotniskoDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcLotpilotDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcLotstewardessaDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcPasazerDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcPilotDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcSamolotDao;
import bazadanych_projekt.jdbcexample.dao.jdbc.JdbcStewardessaDao;
import bazadanych_projekt.jdbcexample.model.Bilet;
import bazadanych_projekt.jdbcexample.model.Linialotnicza;
import bazadanych_projekt.jdbcexample.model.Lot;
import bazadanych_projekt.jdbcexample.model.Lotnisko;
import bazadanych_projekt.jdbcexample.model.Lotpilot;
import bazadanych_projekt.jdbcexample.model.Lotstewardessa;
import bazadanych_projekt.jdbcexample.model.Pasazer;
import bazadanych_projekt.jdbcexample.model.Pilot;
import bazadanych_projekt.jdbcexample.model.Samolot;
import bazadanych_projekt.jdbcexample.model.Stewardessa;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;
//import java.sql.Date;
/**
 *
 * @author Lenovo
 */
public class App {
   public static void main(String[] args) throws ParseException {

       PasazerDao pdao = new JdbcPasazerDao();
   MenuFrame menu = new MenuFrame();
   menu.setVisible(true);
       //PasazerFrame ps = new PasazerFrame();
       //ps.setVisible(true);
       
      // pdao.update("321", "imie", "ala");
//        PasazerDao pdao = new JdbcPasazerDao(); 
//        LotniskoDao ldao = new JdbcLotniskoDao(); 
//        BiletDao bdao = new JdbcBiletDao();
//        LotDao lodao = new JdbcLotDao();
//        LinialotniczaDao lldao = new JdbcLinialotniczaDao();
//        LotpilotDao lpdao = new JdbcLotpilotDao();
//        LotstewardessaDao lsdao = new JdbcLotstewardessaDao();
//        PilotDao pldao = new JdbcPilotDao();
//        SamolotDao sdao = new JdbcSamolotDao();
//        StewardessaDao ssdao = new JdbcStewardessaDao();
        
        
      //  SamolotDao sdao =  new JdbcSamolotDao();
        //dao.update();
        
//        java.util.Date today=new Date();
////java.sql.Date date=new java.sql.Date(today.getTime()); //your SQL date object
//SimpleDateFormat simpDate = new SimpleDateFormat("MM-dd-yyyy");
////System.out.println(simpDate.format(date)); //output String in MM-dd-yyyy
// java.sql.Date d2 = new java.sql.Date(12345);
//java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        
//        java.util.Calendar cal = Calendar.getInstance();
//java.util.Date utilDate = new java.util.Date(); // your util date
//cal.setTime(utilDate);
//cal.set(Calendar.HOUR_OF_DAY, 0);
//cal.set(Calendar.MINUTE, 0);
//cal.set(Calendar.SECOND, 0);
//cal.set(Calendar.MILLISECOND, 0);    
//java.sql.Date sqlDate = new java.sql.Date(cal.getTime().getTime()); // your sql date
//Pasazer p = new Pasazer();
//p.setImie("Lukasz");
//p.setNarodowosc("PL");
//p.setNazwisko("Harmuszkiewicz");
//p.setNr_paszportu("asdasd23");
//p.setPesel("95");
//pdao.save(p);
        
        
    
 //    pdao.delete(12);

   
       
   //     pdao.update(95, "lukasz");
         
                
        //        
//      Lotnisko lo = new Lotnisko();
//      lo.setId_lotniska("BIA");
//      lo.setMiasto("Augustow");
//      lo.setPanstwo("PL");
//      lo.setLiczba_terminali(3);
//      lo.setStrefa_czasowa("+8");
//      ldao.save(lo);
      
//      Pasazer p = new Pasazer();
//      p.setImie("Lukasz");
//      p.setNazwisko("harmuszkiewicz");
//      p.setNarodowosc("PL");
//      p.setNr_paszportu("asdads");
//      p.setPesel("325235");
//      pdao.save(p);
   // pdao.delete(10);
        
        
//        Pilot p = new Pilot();
//        p.setImie("Lukasz");
//        p.setNazwisko("asdasd");
//        p.setNarodowosc("PL");
//        p.setNr_licencji(432);
//        p.setPesel("23423432");
//       String str="2015-03-31";  
//     String str="2015-03-31";  
//    Date date=Date.valueOf(str);//converting string into sql date  
//       // java.sql.Date d2 = new java.sql.Date(20/11/1995);
//        p.setData_urodzenia(date);
//        pldao.save(p);
//      String tim="03:03:03";
//      Time time = Time.valueOf(tim);
//        
//        
//        Lot lott = new Lot();
//        
//        
//        lott.setLotnikso_startowe("ORD");
//        lott.setLotnisko_docelowe("ORD");
//        lott.setSamolot(1);
//        lott.setData_wylotu(date);
//        lott.setGodzina_ladowania(time);
//        lott.setGodzina_wylotu(time);
//        lodao.save(lott);
//        
//        System.out.println("Bilety:");
//        List<Lot> lot = lodao.findAll();
//      //  System.out.println("as");
//        for(Lot b : lot)
//        {
//            //System.o/ut.println("as");
//            System.out.println(b.getGodzina_ladowania());  
//        }
//         
//         
//      
//      
//      
//      // System.out.println( lo.getLiczba_terminali()+" "+ lo.getMiasto()+" "+ lo.getPanstwo()+" "+ lo.getStrefa_czasowa());
//       
//     //ldao.delete("BIA");
//      
 //pdao.delete("321");
//////        
//        List<Pasazer> llist = pdao.findAll();
//        for(Pasazer l : llist)
//        {
//            System.out.println(l.getPesel());
//        
//        }
//        
////        Lotnisko a = ldao.findById("BIA");
////        System.out.println(a.getId_lotniska());
//
//
//      
////pdao.delete("95072506637");
//
////
////Pasazer a = dao.findById("95072506637");
////       System.out.println(a.getImie());
////Pasazer a = dao.findById("95072506637");
////       System.out.println(a.getImie());
//        //System.out.println(list.size());
//        //dao.delete(124124);
//////Book n = dao.findById(2147428890);
//////       System.out.println(n.getIsbn());
////
////       
////       dao.update(124124, "tytul");
////dao.delete(124124);
    }
}
