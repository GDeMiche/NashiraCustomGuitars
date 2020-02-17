/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import database.DriverManagerConnectionPool;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author LittleJoke
 */
public class DBCleaner {
    
    
      public static void main(String[] args) throws InterruptedException, SQLException  {
          
           Connection connection = null;
        Statement statement = null;
                String query = "DELETE FROM assistenza; DELETE FROM carrello; DELETE FROM chitarra; DELETE FROM chitarradmin; DELETE FROM utente;";
        System.out.println(query);
        try   {
            connection = DriverManagerConnectionPool.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.commit();

        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }
    }
}
    
    
    
