package Servlet;

import Bean.Carrello;
import Bean.Chitarra;
import Bean.Utente;
import DAO.CarrelloDAO;
import DAO.UtenteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet("/Login")
public class Login extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Utente u = new Utente();
        CarrelloDAO cartd = new CarrelloDAO();
        UtenteDAO userd = new UtenteDAO();
        RequestDispatcher rd1 = request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp");
        RequestDispatcher rd2 = request.getRequestDispatcher("/WEB-INF/jsp/Index.jsp");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        HttpSession session = request.getSession();

        try {

            if (userd.checkLogin(email, pass)) {
                u = userd.getByID(email);
                Carrello cart = cartd.getByEmail(email);
                if (cart != null) {
                    ArrayList<Chitarra> lista = cartd.getChitarreNonComprate(u.getEmail());
                    cart.setListaChitarre(lista);
                    session.setAttribute("cart", cart);
                } else {
                    session.setAttribute("cart", null);
                }               
                
                session.setAttribute("utente", u);
                rd2.forward(request, response);
                
            } else {
                String error = "Email o Password non corretti";
                request.setAttribute("error", error);
                rd1.include(request, response);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            out.write("Errore del server !!");
            System.out.println(ex);
            out.flush();
            out.close();
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
