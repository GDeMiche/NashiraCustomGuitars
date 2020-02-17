/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.ChitarraAdmin;
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
public class ChitarraAdminDAO {
    
     private final String TABLE_NAME = "chitarradmin";

     
    public ChitarraAdminDAO() {
    }

    public ArrayList<ChitarraAdmin> getAll() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ChitarraAdmin> chitarre = new ArrayList<ChitarraAdmin>();

        String selectSQL = "SELECT * FROM " + this.TABLE_NAME;

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                ChitarraAdmin bean = new ChitarraAdmin();

                bean.setIdchitarradmin(rs.getInt("idchitarradmin"));
                bean.setImg(rs.getString("img"));
                bean.setNome(rs.getString("nome"));
                bean.setPrezzo(rs.getFloat("prezzo"));
                bean.setDesc(rs.getString("desc"));


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

    public ChitarraAdmin getByID(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ChitarraAdmin bean = new ChitarraAdmin();
        String selectSQL = "SELECT * FROM " + this.TABLE_NAME + " WHERE idchitarradmin = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                bean.setIdchitarradmin(rs.getInt("idchitarradmin"));
                bean.setImg(rs.getString("img"));
                bean.setNome(rs.getString("nome"));
                bean.setPrezzo(rs.getFloat("prezzo"));
                bean.setDesc(rs.getString("desc"));

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

    public synchronized void add(ChitarraAdmin ca) throws SQLException {
        Connection connection = DriverManagerConnectionPool.getConnection();
        Statement statement = connection.createStatement();

        String SQL = "INSERT INTO " +this.TABLE_NAME+ " (`img`, `nome`, `prezzo`, `desc`) VALUES ('"+ca.getImg()+"', '"+ca.getNome()+"', '"+ca.getPrezzo()+"', '"+ca.getDesc()+"')";

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

    public synchronized void update(ChitarraAdmin ca) throws SQLException {
        Connection connection = null;
        Statement st = null;

        String insertSQL = "UPDATE "+this.TABLE_NAME+" SET `img` = '"+ca.getImg()+"', `nome` = '"+ca.getNome()+"', `prezzo` = '"+ca.getPrezzo()+"', `desc` = '"+ca.getDesc()+"' WHERE (`idchitarradmin` = '"+ca.getIdchitarradmin()+"'";

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

    public synchronized void remove(int id) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String query = "DELETE FROM " + this.TABLE_NAME + " WHERE idchitarradmin='" + id + "'";
        System.out.println("chitarradmin remove " + query);

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
