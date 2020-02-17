package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Bean.ChitarraAdmin;
import DAO.ChitarraAdminDAO;
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
 * @author LittleJoke
 */
@WebServlet("/AggiungiChitarraServ")
public class AggiungiChitarraServ extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AggiungiChitarraServ() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String nome = request.getParameter("nome");
        String desc = request.getParameter("descrizione");
        String prezzo = request.getParameter("prezzo");
        float p = Float.parseFloat(prezzo);
        ChitarraAdmin ca = new ChitarraAdmin(nome, p,desc);
        ChitarraAdminDAO cadao = new ChitarraAdminDAO();
        try {
            cadao.add(ca);
            String ok = "Chitarra Aggiunta con Successo";
            request.setAttribute("ok", ok);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/AggiungiChitarra.jsp").forward(request, response);
        } catch (SQLException ex) {
            String error = "Errore";
            request.setAttribute("error", error);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/AggiungiChitarra.jsp").forward(request, response);
            Logger.getLogger(AggiungiChitarraServ.class.getName()).log(Level.SEVERE, null, ex);
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
