/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Bean.Chitarra;
import Bean.ChitarraAdmin;
import Bean.Utente;
import DAO.ChitarraAdminDAO;
import DAO.ChitarraDAO;
import DAO.UtenteDAO;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Popola {

    public static void main(String[] args) throws InterruptedException, SQLException {

        UtenteDAO ud = new UtenteDAO();

        Utente u1 = new Utente("admin@admin", "Admin", "admin", "Via Roma 21", "Hollywood", "90210", "admin", true, true);
        Utente u2 = new Utente("mario@balbi", "Mario", "Giordano", "Via Hollywood 21", "Roma", "05652", "mario", false, false);
        Utente u3 = new Utente("mario@esperto", "Mario", "Giordano", "Via Hollywood 21", "Roma", "05652", "mario", true, false);

        ud.add(u1);
        ud.add(u2);
        ud.add(u3);

//        ChitarraDAO lista = new ChitarraDAO();
//        Chitarra c1 = new Chitarra("mario@balbi", "mario1", "bekki", "tast", "bobbat", "bellifa", 523, 4, false);
//        Chitarra c2 = new Chitarra("mario@balbi", "mario2", "alabastro", "tast", "comprata", "beeellsi", 205, 6, true);
//        Chitarra c3 = new Chitarra("mariobalbi@6.it", "mario3", "befds", "tast", "ega", "belfefli", 23, 5, true);
//        Chitarra c4 = new Chitarra("mariobalbi@5.it", "mario3", "befds", "tast", "ega", "belfefli", 435, 52, true);
//        Chitarra c5 = new Chitarra("mariobalbi@4.it", "mario3", "befds", "tast", "ega", "belfefli", 32, 5, true);
//        Chitarra c6 = new Chitarra("mariobalbi@7.it", "mario3", "befds", "tast", "ega", "belfefli", 43, 5, true);
//        Chitarra c7 = new Chitarra("mariobalbi@8.it", "mario4", "bcasc", "tast", "bogaet", "bellcci", 12, 1, false);
//        Chitarra c8 = new Chitarra("mariobalbi@1.it", "mario4", "bcasc", "tast", "bogaet", "bellcci", 43, 12, false);
//        Chitarra c9 = new Chitarra("mariobalbi@1.it", "mario4", "bcasc", "tast", "bogaet", "bellcci", 2321, 1, false);
//        Chitarra c10 = new Chitarra("mario@balbi", "mario5", "vittorio", "nap", "di", "sopra", 102, 2, false);
//        lista.add(c1);
//        lista.add(c2);
//        lista.add(c3);
//        lista.add(c4);
//        lista.add(c5);
//        lista.add(c6);
//        lista.add(c7);
//        lista.add(c8);
//        lista.add(c9);
//        lista.add(c10);

        ChitarraAdminDAO lista2 = new ChitarraAdminDAO();
        ChitarraAdmin ca1 = new ChitarraAdmin("Ribelle", 690,"");
        ChitarraAdmin ca2 = new ChitarraAdmin("Giannola", 1390,"");
        ChitarraAdmin ca3 = new ChitarraAdmin("La S", 1190,"");
        lista2.add(ca1);
        lista2.add(ca2);
        lista2.add(ca3);

    }
}
