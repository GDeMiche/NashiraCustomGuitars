/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Carrello;
import Bean.Chitarra;
import Bean.Utente;
import DAO.CarrelloDAO;
import DAO.ChitarraDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
@WebServlet("/EffettuaAcquisto")
public class EffettuaAcquisto extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EffettuaAcquisto() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ChitarraDAO chitd = new ChitarraDAO();
        HttpSession session = request.getSession();
        Utente u = (Utente) session.getAttribute("utente");
        
        ArrayList<Chitarra> lista = new ArrayList<Chitarra>();
        try {
            lista = chitd.getByEmailNonComprate(u.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(EffettuaAcquisto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Chitarra c : lista){
            c.setComprata(true);
            try {
                 chitd.setComprata1(u.getEmail());            

            } catch (SQLException ex) {
                Logger.getLogger(EffettuaAcquisto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
      //  session.removeAttribute("cart");
       // session.setAttribute("cart", null);
        
//        try {
//            cdao.remove(u.getEmail());            
//        } catch (SQLException ex) {
//            Logger.getLogger(EffettuaAcquisto.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/Acquisto.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
