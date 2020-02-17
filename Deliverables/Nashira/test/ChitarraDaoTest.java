import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bean.Chitarra;
import DAO.ChitarraDAO;
import database.DriverManagerConnectionPool;

class ChitarraDaoTest {
	ChitarraDAO daoChitarra = new ChitarraDAO();
	  Chitarra chitarra = new Chitarra(10,"azienda@email.it","Giacomo","3490000141","100","Carmine","Francesco",100,2);

	@BeforeEach
	void setUp() throws Exception {
		 Connection connection = null;
	     connection = DriverManagerConnectionPool.getConnection();
	     Statement stmtSelect=null;
	     try {
		      stmtSelect = connection.createStatement();
		      String sql1 =
		          ("INSERT INTO Utente VALUES('azienda@email.it','Giuseppe','Arcano','Cap Gemini','NA','84018','password','0','0');");
		      stmtSelect.executeUpdate(sql1);
	     
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

	@AfterEach
	void tearDown() throws Exception {
		Statement stmtSelect=null;
		Connection connection = null;
		try {
			
		     
		     connection = DriverManagerConnectionPool.getConnection();
		      stmtSelect = connection.createStatement();
		      String sql1 = ("DELETE FROM Utente WHERE EMAIL='azienda@email.it';");
		      String sql2 = ("DELETE FROM Chitarra WHERE EMAIL='azienda@email.it';");
		      stmtSelect.executeUpdate(sql1);
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
	          ("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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

	    ArrayList<Chitarra> listaChitarre = daoChitarra.getAll();
	    for (i = 0; i < listaChitarre.size(); i++) {
	      if (listaChitarre.get(i).getEmail().equals(chitarra.getEmail())
	          && listaChitarre.get(i).getIdchitarra()==(chitarra.getIdchitarra())) {
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
	          ("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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

	    Chitarra chitarrax = daoChitarra.getByID(10);
	      if (chitarrax.getIdchitarra()==chitarra.getIdchitarra()) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testgetByEmail() throws SQLException {
		boolean inserito = false;
	    int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	          ("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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

	    ArrayList<Chitarra> listaChitarre = daoChitarra.getByEmail("azienda@email.it");
	    for (i = 0; i < listaChitarre.size(); i++) {
	      if (listaChitarre.get(i).getEmail().equals(chitarra.getEmail())) {
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	
	
	@Test
	void testgetByEmailNonComprate() throws SQLException {
		boolean inserito = false;
	    int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	          ("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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

	    ArrayList<Chitarra> listaChitarre = daoChitarra.getByEmailNonComprate("azienda@email.it");
	    for (i = 0; i < listaChitarre.size(); i++) {
	      if (listaChitarre.get(i).getEmail().equals(chitarra.getEmail())&&
	    		  listaChitarre.get(i).getComprata()==chitarra.getComprata()) {
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testadd() throws SQLException {
		boolean inserito=false;
		int i;
		daoChitarra.add(chitarra);

		ArrayList<Chitarra> listaChitarre = daoChitarra.getByEmail("azienda@email.it");
	    for (i = 0; i < listaChitarre.size(); i++) {
      if (listaChitarre.get(i).getEmail().equals(chitarra.getEmail())) {
        inserito = true;
      }
    
    assertEquals(inserito, true);
  }
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
	          ("INSERT INTO Chitarra VALUES('10','azie@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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
		daoChitarra.update(chitarra);

		 ArrayList<Chitarra> listaChitarre = daoChitarra.getByEmail("azienda@email.it");
		    for (i = 0; i < listaChitarre.size(); i++) {
	      if (listaChitarre.get(i).getEmail().equals(chitarra.getEmail())) {
	        inserito = true;
	      }
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
	          ("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0');");
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
	    daoChitarra.remove(10);
		ArrayList<Chitarra> listaChitarre = daoChitarra.getByEmail("azienda@email.it");
	    for(i=0;i<=listaChitarre.size();i++) {  
		if (listaChitarre.isEmpty()) {
	        inserito = true;
	      }
	    } 
	    assertEquals(inserito, true);
	  }
	
}
