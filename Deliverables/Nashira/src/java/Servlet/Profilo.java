/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Utente;
import DAO.UtenteDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LittleJoke
 */
@WebServlet("/Profilo")
public class Profilo extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profilo() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();

        Utente u = (Utente) session.getAttribute("utente");
//        Utente u = new Utente("admin","Cribus","cribus", "Via Roma 21","Hollyweed","90210","admin",true,true);
        UtenteDAO udao = new UtenteDAO();
        //            u = udao.getByID(u.getEmail());
        session.setAttribute("utente", u);
        
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/Profilo.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
