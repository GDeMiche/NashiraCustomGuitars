/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Chitarra;
import database.DriverManagerConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LittleJoke
 */
public class ChitarraDAO {

    private final String TABLE_NAME = "chitarra";

//    public ChitarraDAO(Chitarra c) {
//      // void
//    }
    public synchronized ArrayList<Chitarra> getAll() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME;

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Chitarra bean = new Chitarra();

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

                chitarre.add(bean);
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

        return chitarre;
    }

    public synchronized Chitarra getByID(int idchitarra) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Chitarra bean = new Chitarra();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE idchitarra = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, idchitarra);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

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

    public synchronized ArrayList<Chitarra> getByEmail(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, email);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Chitarra bean = new Chitarra();

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

                chitarre.add(bean);

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

        return chitarre;
    }

    public synchronized ArrayList<Chitarra> getByEmailNonComprate(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = '" + email + "' AND comprata = '0';";
        System.out.println("getByEmailNonComprate " + selectSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Chitarra bean = new Chitarra();

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

                chitarre.add(bean);

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

        return chitarre;
    }
    
    public synchronized ArrayList<Chitarra> getByEmailComprate(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email = '" + email + "' AND comprata = '1';";
        System.out.println("getByEmailNonComprate " + selectSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Chitarra bean = new Chitarra();

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

                chitarre.add(bean);

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

        return chitarre;
    }
    
    public synchronized ArrayList<Chitarra> getAllComprate() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE comprata = '1';";
        System.out.println("getByEmailNonComprate " + selectSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Chitarra bean = new Chitarra();

                bean.setIdchitarra(rs.getInt("idchitarra"));
                bean.setEmail(rs.getString("email"));
                bean.setNome(rs.getString("nome"));
                bean.setCorpo(rs.getString("corpo"));
                bean.setTastiera(rs.getString("tastiera"));
                bean.setTop(rs.getString("top"));
                bean.setPickup(rs.getString("pickup"));
                bean.setPrezzo(rs.getInt("prezzo"));
                bean.setQnt(rs.getInt("qnt"));
                bean.setComprata(rs.getBoolean("comprata"));

                chitarre.add(bean);

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

        return chitarre;
    }

    public synchronized void add(Chitarra c) throws SQLException {
        Connection connection = DriverManagerConnectionPool.getConnection();
        Statement statement = connection.createStatement();

        String SQL = "INSERT INTO `" + TABLE_NAME + "` (`email`, `nome`, `corpo`, `tastiera`, `top`, `pickup`, `prezzo`, `qnt`,`comprata`) VALUES ('" + c.getEmail() + "', '" + c.getNome() + "', '" + c.getCorpo() + "', '" + c.getTastiera() + "', '" + c.getTop() + "', '" + c.getPickup() + "', '" + c.getPrezzo() + "', '" + c.getQnt() + "', '" + c.getComprata() + "' )";
        System.out.println("sql query ADD chitarra " + SQL);
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

    public synchronized void update(Chitarra c) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente da modificare" + c.getIdchitarra());

        String insertSQL = "UPDATE " + TABLE_NAME + " SET `idchitarra` = '"+ c.getIdchitarra() +"', `email` = '" + c.getEmail() + "', `nome` = '" + c.getNome() + "', `corpo` = '" + c.getCorpo() + "', `tastiera` = '" + c.getTastiera() + "', `top` = '" + c.getTop() + "', `pickup` = '" + c.getPickup() + "', `prezzo` = '" + c.getPrezzo() + "', `qnt` = '" + c.getQnt() + "', `comprata` = '" + c.getComprata() + "' WHERE `idchitarra` = '"+c.getIdchitarra()+"'";
        System.out.println("sql query update chitarra " + insertSQL);
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

     public synchronized void setComprata1(String email) throws SQLException {
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente da modificare" + email);

        String insertSQL = "UPDATE " + TABLE_NAME + " SET `comprata` = '1' WHERE `email` = '"+email+"'";
        System.out.println("sql query update chitarra " + insertSQL);
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

        String query = "DELETE FROM " + this.TABLE_NAME + " WHERE idchitarra='" + id + "'";
        System.out.println("chitarra remove " + query);

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
}
