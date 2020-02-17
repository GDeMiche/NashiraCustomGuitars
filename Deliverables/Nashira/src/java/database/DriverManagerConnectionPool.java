package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe che si occupa di fornire una connessione con il database
 */
public  class DriverManagerConnectionPool  {

        private static List<Connection> freeDbConnections;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean flag=false;

	
	static {
		freeDbConnections = new LinkedList<Connection>();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		} catch (Exception e) {
			System.out.println("DB driver not found:"+ e.getMessage());
		} 
	}

	
	private static synchronized Connection createDBConnection() throws SQLException {
		Connection newConnection = null;
		String ip = "localhost";
		String port = "3306";
		String db = "tsw";
		String username = "root";
		String password = "admin";

		

		newConnection = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db+"?allowMultiQueries=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", username, password);

		newConnection.setAutoCommit(false);
		return newConnection;
	}


	public static synchronized Connection getConnection() throws SQLException {
		Connection connection;

		if (!freeDbConnections.isEmpty()) {
			connection = (Connection) freeDbConnections.get(0);
			freeDbConnections.remove(0);

			try {
				if (connection.isClosed())
					connection = getConnection();
			} catch (SQLException e) {
				connection.close();
				connection = getConnection();
			}
		} else {
			connection = createDBConnection();		
		}

		return connection;
	}
        
   
       
	public static synchronized void releaseConnection(Connection connection) throws SQLException {
		if(connection != null) freeDbConnections.add(connection);
	}
        
           
}