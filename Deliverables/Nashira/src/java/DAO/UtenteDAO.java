/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Utente;
import database.DriverManagerConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LittleJoke
 */
public class UtenteDAO {

    private final String TABLE_NAME = "utente";

    public UtenteDAO(Utente u) {
        // void
    }

    public UtenteDAO() {
    }

    public ArrayList<Utente> getAll() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Utente> utenti = new ArrayList<Utente>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME;

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Utente bean = new Utente();

                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCognome(rs.getString("cognome"));
                bean.setIndirizzo(rs.getString("indirizzo"));
                bean.setCitta(rs.getString("citta"));
                bean.setZip(rs.getString("zip"));
                bean.setPassword(rs.getString("password"));
                bean.setEsperto(rs.getBoolean("esperto"));
                bean.setAdmin(rs.getBoolean("admin"));

                utenti.add(bean);
            }

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

        return utenti;
    }

    public Utente getByID(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Utente bean = new Utente();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCognome(rs.getString("cognome"));
                bean.setIndirizzo(rs.getString("indirizzo"));
                bean.setCitta(rs.getString("citta"));
                bean.setZip(rs.getString("zip"));
                bean.setPassword(rs.getString("password"));
                bean.setEsperto(rs.getBoolean("esperto"));
                bean.setAdmin(rs.getBoolean("admin"));

            }

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

        return bean;

    }

    public void add(Utente u) throws SQLException {
        Connection connection = DriverManagerConnectionPool.getConnection();
        Statement statement = connection.createStatement();

        String SQL = "INSERT INTO `" + TABLE_NAME + "` (`email`, `nome`, `cognome`, `indirizzo`, `citta`, `zip`, `password`, `esperto`, `admin`) VALUES ('" + u.getEmail() + "', '" + u.getNome() + "', '" + u.getCognome() + "', '" + u.getIndirizzo() + "', '" + u.getCitta() + "', '" + u.getZip() + "', '" + u.getPassword() + "', '"+ u.getEsperto()+"', '"+u.getAdmin()+"')";
        System.out.println("sql query ADD " + SQL);
        try {

            statement.executeUpdate(SQL);
            connection.commit();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }
    }

    public synchronized void promoEsperto(Utente u) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente promosso ad esperto " + u.getEmail());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET esperto = '1' WHERE (email = '" + u.getEmail()+ "')";
        System.out.println("utente update " + insertSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            st = connection.createStatement();
            st.executeUpdate(insertSQL);
            connection.commit();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }

        public synchronized void removeEsperto(Utente u) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente promosso ad esperto " + u.getEmail());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET esperto = '0' WHERE (email = '" + u.getEmail()+ "')";
        System.out.println("utente update " + insertSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            st = connection.createStatement();
            st.executeUpdate(insertSQL);
            connection.commit();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }

    
    public synchronized void update(Utente u) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente da modificare" + u.getEmail());

        String insertSQL = "UPDATE " + TABLE_NAME + " SET `email` = '" + u.getEmail() + "', `nome` = '" + u.getNome() + "', `cognome` = '" + u.getCognome() + "', `indirizzo` = '" + u.getIndirizzo() + "', `citta` = '" + u.getCitta() + "', `zip` = '" + u.getZip() + "', `password` = '" + u.getPassword() + "' WHERE (`email` = '" + u.getEmail() + "')";
        System.out.println("utente update " + insertSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            st = connection.createStatement();
            st.executeUpdate(insertSQL);
            connection.commit();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }

    
    public synchronized void promoAdmin(Utente u) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente promosso ad admin " + u.getEmail());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET admin = '1',  esperto = '1'  WHERE (email = '" + u.getEmail()+ "')";
        System.out.println("utente update " + insertSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            st = connection.createStatement();
            st.executeUpdate(insertSQL);
            connection.commit();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }

        public synchronized void removeAdmin(Utente u) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente promosso ad admin " + u.getEmail());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET admin = '0' WHERE (email = '" + u.getEmail()+ "')";
        System.out.println("utente update " + insertSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            st = connection.createStatement();
            st.executeUpdate(insertSQL);
            connection.commit();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }
    
    
    public synchronized void remove(String email) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String query = "DELETE FROM " + this.TABLE_NAME + " WHERE email='" + email + "'";
        System.out.println("utenti remove " + query);

        try {
            connection = DriverManagerConnectionPool.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.commit();

        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }

    }

    public synchronized boolean checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean status = false;
//        Utente bean = new Utente();

        String query = "SELECT * FROM " + TABLE_NAME + " WHERE email = ? AND password = ?";
        System.out.println("checklogin " + query);

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
//              per esperto ed admin creare metodo 

            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("status " + status);
//            status = rs.next();
            if (rs.next()) {
                status = true;
                System.out.println("if status " + status);
            }

        } catch (Exception e) {
            System.out.println(e);
            Logger.getLogger(UtenteDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;

    }
}
