/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Utente;
import Bean.Assistenza;
import DAO.AssistenzaDAO;
import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet("/InoltraAssistenza")
public class InoltraAssistenza extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String prob = (String) request.getParameter("problema");
        HttpSession session = request.getSession();
        Utente u = (Utente) session.getAttribute("utente");
        request.setAttribute("problema", prob);

        if (prob.length() != 0) {
            AssistenzaDAO adao = new AssistenzaDAO();
            Assistenza a = new Assistenza(prob, u.getEmail());
            try {
                adao.add(a);
            } catch (SQLException ex) {
                Logger.getLogger(InoltraAssistenza.class.getName()).log(Level.SEVERE, null, ex);
            }
            String ok = "Messaggio Inviato Correttamente";
            request.setAttribute("ok", ok);
            request.getRequestDispatcher("/WEB-INF/jsp/Assistenza.jsp").forward(request, response);
        } else {
            String error = "Errore: Messaggio Vuoto";
            request.setAttribute("error", error);
            request.getRequestDispatcher("/WEB-INF/jsp/Assistenza.jsp").forward(request, response);
        }

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
