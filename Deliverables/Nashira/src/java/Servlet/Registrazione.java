package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Bean.Utente;
import DAO.UtenteDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LittleJoke
 */
@WebServlet("/Registrazione")
public class Registrazione extends HttpServlet {

    public Registrazione() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/Registrazione.jsp");
        RequestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp");

        String email = request.getParameter("email");
        String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        String indirizzo = request.getParameter("indirizzo");
        String citta = request.getParameter("citta");
        String zip = request.getParameter("zip");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("Cpassword");

        Utente u = new Utente();
        Utente u2 = new Utente();

        u.setEmail(email);
        u.setNome(nome);
        u.setCognome(cognome);
        u.setIndirizzo(indirizzo);
        u.setCitta(citta);
        u.setZip(zip);
        u.setPassword(password);

        UtenteDAO ud = new UtenteDAO();
        try {
            u2 = ud.getByID(email); 
            if (u2.getEmail()==null) {
                if (password.equals(cpassword)) {
                    ud.add(u);
                    request.setAttribute("email", email);
                    request.setAttribute("password", password);
                    rd2.include(request, response);

                } else {
                    String error = "Password non corrispondente";
                    request.setAttribute("email", email);
                    request.setAttribute("nome", nome);
                    request.setAttribute("cognome", cognome);
                    request.setAttribute("indirizzo", indirizzo);
                    request.setAttribute("citta", citta);
                    request.setAttribute("zip", zip);
                    request.setAttribute("error", error);
                    rd1.include(request, response);
                }
            } else {
                String error = "Email gia' esistente!";
                request.setAttribute("email", email);
                request.setAttribute("nome", nome);
                request.setAttribute("cognome", cognome);
                request.setAttribute("indirizzo", indirizzo);
                request.setAttribute("citta", citta);
                request.setAttribute("zip", zip);
                request.setAttribute("error", error);
                rd1.include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registrazione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
