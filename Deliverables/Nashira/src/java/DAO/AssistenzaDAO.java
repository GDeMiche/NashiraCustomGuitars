/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Assistenza;
import database.DriverManagerConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class AssistenzaDAO {

    private final String TABLE_NAME = "assistenza";

    public synchronized ArrayList<Assistenza> getAll() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Assistenza> richieste = new ArrayList<Assistenza>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME;

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Assistenza bean = new Assistenza();

                bean.setIdAssistenza(rs.getInt("idassistenza"));
                bean.setEmail(rs.getString("email"));
                bean.setProblema(rs.getString("problema"));
                bean.setRisolto(rs.getBoolean("risolto"));

                richieste.add(bean);
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

        return richieste;
    }
    
        public synchronized ArrayList<Assistenza> getAssistenzeByEmail(String email) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Assistenza> richieste = new ArrayList<Assistenza>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = '"+email+"'";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Assistenza bean = new Assistenza();

                bean.setIdAssistenza(rs.getInt("idassistenza"));
                bean.setEmail(rs.getString("email"));
                bean.setProblema(rs.getString("problema"));
                bean.setRisolto(rs.getBoolean("risolto"));

                richieste.add(bean);
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

        return richieste;
    }

    public synchronized Assistenza getByID(int idassistenza) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Assistenza bean = new Assistenza();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE idassistenza = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, idassistenza);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdAssistenza(rs.getInt("idassistenza"));
                bean.setEmail(rs.getString("email"));
                bean.setProblema(rs.getString("problema"));
                bean.setRisolto(rs.getBoolean("risolto"));

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

    public synchronized void add(Assistenza a) throws SQLException {
        Connection connection = DriverManagerConnectionPool.getConnection();
        Statement statement = connection.createStatement();

        String SQL = "INSERT INTO " + this.TABLE_NAME + " (idassistenza, problema, email, risolto) VALUES ('" + a.getIdAssistenza() + "', '" + a.getProblema() + "', '" + a.getEmail() + "', '0')";
        System.out.println("sql query ADD assistenza " + SQL);
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

    public synchronized void update(Assistenza a) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'assistenza da modificare" + a.getIdAssistenza());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET problema = '" + a.getProblema() + "', email = '" + a.getEmail() + "', risolto =  '" + a.getRisolto() + "' WHERE (idassistenza = '" + a.getIdAssistenza() + "')";
        System.out.println("sql query update assistenza " + insertSQL);
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

    public synchronized void remove(int id) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String query = "DELETE FROM " + this.TABLE_NAME + " WHERE idassistenza='" + id + "'";
        System.out.println("assistenza remove " + query);

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

    public synchronized Assistenza getByEmail(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Assistenza bean = new Assistenza();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdAssistenza(rs.getInt("idassistenza"));
                bean.setEmail(rs.getString("email"));
                bean.setProblema(rs.getString("problema"));
                bean.setRisolto(rs.getBoolean("risolto"));

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

    public synchronized Assistenza getRisolto(boolean risolto) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Assistenza bean = new Assistenza();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE risolto = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setBoolean(1, risolto);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdAssistenza(rs.getInt("idassistenza"));
                bean.setEmail(rs.getString("email"));
                bean.setProblema(rs.getString("problema"));
                bean.setRisolto(rs.getBoolean("risolto"));

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

    public synchronized void setRisoltoTrue(Assistenza a) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'assistenza da modificare" + a.getIdAssistenza());

        String insertSQL = "UPDATE " + this.TABLE_NAME + " SET risolto = '1' WHERE (idassistenza = '" + a.getIdAssistenza() + "')";
        System.out.println("sql query update assistenza " + insertSQL);
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
}
