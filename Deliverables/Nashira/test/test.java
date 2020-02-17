/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LittleJoke
 */

import Bean.Utente;
import DAO.UtenteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
public class test {
    public static void main(String[] args) throws SQLException {
        
        
        UtenteDAO dao = new UtenteDAO();
        ArrayList <Utente> utenti = dao.getAll();
        
        for (Utente getall : utenti){
            System.out.println("test dao "+getall.toString());
        }
        
         
            
    }
}
