/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Carrello;
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
public class CarrelloDAO {

    private final String TABLE_NAME = "carrello";

    public CarrelloDAO(Carrello c) {
        // void
    }

    public CarrelloDAO() {
    }

    public synchronized ArrayList<Carrello> getAll() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Carrello> carrelli = new ArrayList<Carrello>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME;

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Carrello bean = new Carrello();

                bean.setIdcarrello(rs.getInt("idcarrello"));
                bean.setEmail(rs.getString("email"));
                bean.setPrezzotot(rs.getFloat("prezzotot"));

                carrelli.add(bean);
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

        return carrelli;
    }

    public synchronized Carrello getByEmail(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Carrello bean = new Carrello();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE email ='" + email + "'";
        System.out.println("sql " + selectSQL);
        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdcarrello(rs.getInt("idcarrello"));
                bean.setEmail(rs.getString("email"));
                bean.setPrezzotot(rs.getFloat("prezzotot"));

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

    public synchronized Carrello getByID(int idcarrello) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        Carrello bean = new Carrello();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE idcarrello = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, idcarrello);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdcarrello(rs.getInt("idcarrello"));
                bean.setEmail(rs.getString("email"));
                bean.setPrezzotot(rs.getFloat("prezzotot"));

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

    public synchronized ArrayList<Chitarra> getChitarreNonComprate(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM chitarra WHERE email = '" + email + "' AND comprata = '0' ";

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

    public synchronized ArrayList<Chitarra> getChitarreByEmail(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<Chitarra> chitarre = new ArrayList<Chitarra>();

        String selectSQL = "SELECT * FROM chitarra WHERE email ='" + email + "'";

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

    public synchronized void add(Carrello c) throws SQLException {  //da modificare
        Connection connection = DriverManagerConnectionPool.getConnection();
        Statement statement = connection.createStatement();

        String SQL = "INSERT INTO `" + TABLE_NAME + "`  (`idcarrello`, `prezzotot`, `idutente`) VALUES ('" + c.getIdcarrello() + "', '" + c.getPrezzoTot() + "', '" + c.getEmail() + "')";
        System.out.println("sql query ADD carrello " + SQL);
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

    public synchronized void update(Carrello c) throws SQLException { // da modificare
        Connection connection = null;
        Statement st = null;

        System.out.println("id dell'utente da modificare" + c.getIdcarrello());

        String insertSQL = "UPDATE " + TABLE_NAME + " SET `idcarrello` = '" + c.getIdcarrello() + "', `email` = '" + c.getEmail() + "', `prezzotot` = '" + c.getPrezzoTot() + "'  WHERE (`idcarrello` = '" + c.getIdcarrello() + "')";
        System.out.println("carrello update " + insertSQL);
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

    public synchronized void remove(String email) throws SQLException { //forse l'ho editata bene da provare
        Connection connection = null;
        Statement statement = null;

        String query = "DELETE FROM " + this.TABLE_NAME + " WHERE email='" + email + "'";
        System.out.println("carrello remove " + query);

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
