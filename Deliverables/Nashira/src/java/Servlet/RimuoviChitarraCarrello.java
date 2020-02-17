/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Chitarra;
import Bean.Utente;
import DAO.ChitarraDAO;
import DAO.UtenteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LittleJoke
 */
@WebServlet("/RimuoviChitarraCarrello")
public class RimuoviChitarraCarrello extends HttpServlet {

    public RimuoviChitarraCarrello() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        ChitarraDAO cdao = new ChitarraDAO();
        Chitarra c = new Chitarra();
        String ids = (String) request.getParameter("idchitrem");
        int id = Integer.parseInt(ids);
        try {
            c = cdao.getByID(id);
            cdao.remove(c.getIdchitarra());
        } catch (SQLException ex) {
            Logger.getLogger(PromoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/jsp/Carrello.jsp").forward(request, response);
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
