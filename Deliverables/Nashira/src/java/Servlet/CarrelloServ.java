package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Bean.Chitarra;
import Bean.Carrello;
import Bean.Utente;
import DAO.CarrelloDAO;
import DAO.ChitarraDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author LittleJoke
 */
@WebServlet("/CarrelloServ")
public class CarrelloServ extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarrelloServ() {
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

        if (session.getAttribute("utente") == null) {
            String error = "Prima di poter acquistare devi eseguire l'accesso";
            request.setAttribute("error", error);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
        }

        Utente u = (Utente) session.getAttribute("utente");
        ChitarraDAO cdao = new ChitarraDAO();
        ArrayList<Chitarra> lista = new ArrayList<Chitarra>();
        try {
            lista = cdao.getByEmailNonComprate(u.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(CarrelloServ.class.getName()).log(Level.SEVERE, null, ex);
        }

        String nome = request.getParameter("nome");
        String corpo = request.getParameter("corpo");
        String tastiera = request.getParameter("tastiera");
        String top = request.getParameter("top");
        String pickup = request.getParameter("pickup");
        String prezzo = request.getParameter("prezzo");
        String qnt = request.getParameter("qnt");
        Chitarra chit = new Chitarra();

        if (nome != null) {
            int p = Integer.parseInt(prezzo);
            int q = Integer.parseInt(qnt);
            chit = new Chitarra(u.getEmail(), nome, corpo, tastiera, top, pickup, false);
            chit.setPrezzo(p);
            chit.setQnt(q);
            request.setAttribute("chit", chit);
        }

        if (request.getAttribute("chit") != null) {
            try {
                cdao.add(chit);
            } catch (SQLException ex) {
                Logger.getLogger(CarrelloServ.class.getName()).log(Level.SEVERE, null, ex);
            }
            lista.add(chit);
        }

        Carrello cart = new Carrello(lista, u.getEmail());
        session.setAttribute("cart", cart);
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
