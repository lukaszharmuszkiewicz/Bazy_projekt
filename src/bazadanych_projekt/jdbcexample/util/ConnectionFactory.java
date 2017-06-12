/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bazadanych_projekt.jdbcexample.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bazadanych_projekt.jdbcexample.exception.DataAccessException;

public class ConnectionFactory {

          
    
   public static Connection getConnection() throws ClassNotFoundException, SQLException {
       Class.forName("oracle.jdbc.driver.OracleDriver");
     DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 

     Connection polaczenie=DriverManager.getConnection("jdbc:oracle:thin:@212.33.90.213:1521:XE","monika_szczawinska","monika_szczawinska");
       return polaczenie;
    }


    

}
