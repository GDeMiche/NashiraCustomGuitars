/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Chitarra;
import Bean.ChitarraAdmin;
import Bean.Utente;
import DAO.ChitarraAdminDAO;
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
@WebServlet("/RimuoviChitarraAdmin")
public class RimuoviChitarraAdmin extends HttpServlet {

    public RimuoviChitarraAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        ChitarraAdminDAO cdao = new ChitarraAdminDAO();
        ChitarraAdmin c = new ChitarraAdmin();
        String ids = (String) request.getParameter("idchitad");
        int id = Integer.parseInt(ids);
        try {
            c = cdao.getByID(id);
            cdao.remove(c.getIdchitarradmin());
        } catch (SQLException ex) {
            Logger.getLogger(PromoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/jsp/AdminPanel.jsp").forward(request, response);
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
