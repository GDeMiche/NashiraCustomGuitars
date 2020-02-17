import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bean.ChitarraAdmin;
import DAO.ChitarraAdminDAO;
import database.DriverManagerConnectionPool;

class ChitarraAdminDaoTest {
	ChitarraAdminDAO daoChitarraAdmin = new ChitarraAdminDAO();
	  ChitarraAdmin chitarraAdmin = new ChitarraAdmin(10,"azienda@email.it","Giacomo",141,"100");

	@BeforeEach
	@AfterEach
	void tearDown() throws Exception {
		Statement stmtSelect=null;
		Connection connection = null;
		try {
			
		     
		     connection = DriverManagerConnectionPool.getConnection();
		      stmtSelect = connection.createStatement();
		      String sql1 = ("DELETE FROM Chitarradmin WHERE IDCHITARRADMIN='10';");
		      stmtSelect.executeUpdate(sql1);
		      connection.commit();
		    } finally {
	            try {
	                if (stmtSelect != null) {
	                	stmtSelect.close();
	                }
	            } finally {
	                DriverManagerConnectionPool.releaseConnection(connection);
	            }
	     }
	}
	

	@Test
	void testGetAll() throws SQLException {
	    boolean inserito = false;
	    int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     PreparedStatement preparedStatement = null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Chitarradmin VALUES('10','azienda@email.it','Giacomo','141','100');");
	      stmtSelect.executeUpdate(sql2);
	      connection.commit();
	    } finally {
            try {
                if (stmtSelect != null) {
                	stmtSelect.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
     }

	    ArrayList<ChitarraAdmin> listaChitarre = daoChitarraAdmin.getAll();
	    for (i = 0; i < listaChitarre.size(); i++) {
	      if (listaChitarre.get(i).getIdchitarradmin()==(chitarraAdmin.getIdchitarradmin())) {
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	

	@Test
	void testgetByID() throws SQLException {
	    boolean inserito = false;
	    int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Chitarradmin VALUES('10','azienda@email.it','Giacomo','141','100');");
	      stmtSelect.executeUpdate(sql2);
	      connection.commit();
	    } finally {
            try {
                if (stmtSelect != null) {
                	stmtSelect.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
     }

	    ChitarraAdmin chitarraAdminx = daoChitarraAdmin.getByID(10);
	      if (chitarraAdminx.getIdchitarradmin()==chitarraAdmin.getIdchitarradmin()) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	
	
	@Test
	void testadd() throws SQLException {
		boolean inserito=false;
		int i;
		daoChitarraAdmin.add(chitarraAdmin);

		ChitarraAdmin chitarraAdminx = daoChitarraAdmin.getByID(10);
	 
      if (chitarraAdminx.getIdchitarradmin()==(chitarraAdmin.getIdchitarradmin())) {
        inserito = true;
      }
    
    assertEquals(inserito, true);
  
}
	@Test
	void testupdate() throws SQLException {
		boolean inserito=false;
		int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Chitarradmin VALUES('10','azienda@email.it','Giacomino','141','100');");
	      stmtSelect.executeUpdate(sql2);
	      connection.commit();
	    } finally {
            try {
                if (stmtSelect != null) {
                	stmtSelect.close();
                }
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
     }
		daoChitarraAdmin.update(chitarraAdmin);

		 ChitarraAdmin chitarraAdminx = daoChitarraAdmin.getByID(10);
		   if (chitarraAdminx.getNome().equals(chitarraAdmin.getNome())) {
	        inserito = true;
	      }
		 
	    assertEquals(inserito, true);
	}
	@Test
	void testremove() throws SQLException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Chitarradmin VALUES('10','azienda@email.it','Giacomo','141','100');");
	      stmtSelect.executeUpdate(sql2);
	      connection.commit();
	    } finally {
           try {
               if (stmtSelect != null) {
               	stmtSelect.close();
               }
           } finally {
               DriverManagerConnectionPool.releaseConnection(connection);
           }
    }
	    daoChitarraAdmin.remove(10);
		ChitarraAdmin chitarraAdminx = daoChitarraAdmin.getByID(10);
	  
		if (chitarraAdminx.getIdchitarradmin()==0) {
	        inserito = true;
	    
	    } 
	    assertEquals(inserito, true);
	  }
	
}