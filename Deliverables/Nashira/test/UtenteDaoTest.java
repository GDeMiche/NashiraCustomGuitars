import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bean.Utente;
import DAO.UtenteDAO;
import database.DriverManagerConnectionPool;

class UtenteDaoTest {
	UtenteDAO daoUtente = new UtenteDAO();
	  Utente utente = new Utente("azienda@email.it","Giacomo","3490000141","100","Carmine","Francesco","password");

	@BeforeEach

	@AfterEach
	void tearDown() throws Exception {
		Statement stmtSelect=null;
		Connection connection = null;
		try {
			
		     
		     connection = DriverManagerConnectionPool.getConnection();
		      stmtSelect = connection.createStatement();
		      String sql1 = ("DELETE FROM Utente WHERE EMAIL='azienda@email.it';");
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
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	          ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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

	    ArrayList<Utente> listaUtenti = daoUtente.getAll();
	    for (i = 0; i < listaUtenti.size(); i++) {
	      if (listaUtenti.get(i).getEmail().equals(utente.getEmail())) {
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
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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

	    Utente utentex = daoUtente.getByID("azienda@email.it");
	      if (utentex.getEmail().equals(utente.getEmail())) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	
	@Test
	void testadd() throws SQLException {
		boolean inserito=false;
		int i;
		daoUtente.add(utente);

		Utente utentex = daoUtente.getByID("azienda@email.it");
      if (utentex.getEmail().equals(utente.getEmail())) {
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
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Jack','3490000141','100','Carmine','Francesco','password','0','0');");
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
		daoUtente.update(utente);

		 Utente utentex = daoUtente.getByID("azienda@email.it");
		   
	      if (utentex.getNome().equals(utente.getNome())) {
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
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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
	    daoUtente.remove("azienda@email.it");;
		Utente utentex = daoUtente.getByID("azienda@email.it");
		if (utentex.getEmail() == null) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testpromoEsperto() throws SQLException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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
	    daoUtente.promoEsperto(utente);;
		Utente utentex = daoUtente.getByID("azienda@email.it");
		if (utentex.getEsperto() == "1") {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testpromoAdmin() throws SQLException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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
	    daoUtente.promoAdmin(utente);;
		Utente utentex = daoUtente.getByID("azienda@email.it");
		if (utentex.getAdmin() == "1") {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testCheckLogin() throws SQLException, ClassNotFoundException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Utente VALUES('azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','password','0','0');");
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
	    Boolean utentex=daoUtente.checkLogin("azienda@email.it", "password");
		if (utentex == true) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	
	
	
	
}
