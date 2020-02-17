import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bean.Assistenza;
import DAO.AssistenzaDAO;
import database.DriverManagerConnectionPool;

class AssistenzaDaoTest {
	AssistenzaDAO daoAssistenza = new AssistenzaDAO();
	  Assistenza assistenza = new Assistenza(10,"Giacomo","azienda@email.it",false);

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
		      String sql2 = ("DELETE FROM Assistenza WHERE EMAIL='azienda@email.it';");
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
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	          ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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

	    ArrayList<Assistenza> listaassistenza = daoAssistenza.getAll();
	    for (i = 0; i < listaassistenza.size(); i++) {
	      if (listaassistenza.get(i).getEmail().equals(assistenza.getEmail())) {
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	

	@Test
	void testgetAssistenzaEmail() throws SQLException {
	    boolean inserito = false;
	    int i;
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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

	    ArrayList<Assistenza> assistenzax = daoAssistenza.getAssistenzeByEmail("azienda@email.it");
	    for(i=0;i<assistenzax.size();i++)
	      if (assistenzax.get(i).getEmail().equals(assistenza.getEmail())) {
	        inserito = true;
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
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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

	    Assistenza assistenzax = daoAssistenza.getByID(10);
	      if (assistenzax.getEmail().equals(assistenza.getEmail())) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testadd() throws SQLException {
		boolean inserito=false;
		int i;
		daoAssistenza.add(assistenza);

		Assistenza assistenzax = daoAssistenza.getByID(10);
      if (assistenzax.getEmail().equals(assistenza.getEmail())) {
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
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','aziendddddda@email.it','0');");
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
		daoAssistenza.update(assistenza);

		 ArrayList<Assistenza> assistenzax = daoAssistenza.getAssistenzeByEmail("azienda@email.it");
		   for(i=0;i<assistenzax.size();i++) {
	      if (assistenzax.get(i).getEmail().equals(assistenza.getEmail())) {
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
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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
	    daoAssistenza.remove(10);
		Assistenza assistenzax = daoAssistenza.getByID(10);
		if (assistenzax.getEmail() == null) {
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
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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

	    Assistenza assistenzax = daoAssistenza.getByEmail("azienda@email.it");
	      if (assistenzax.getEmail().equals(assistenza.getEmail())) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	@Test
	void testsetRisoltotrue() throws SQLException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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
	    daoAssistenza.setRisoltoTrue(assistenza);
		Assistenza assistenzax = daoAssistenza.getByID(10);
		if (assistenzax.getRisolto() == "1") {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	@Test
	void testgetRisolto() throws SQLException {
		boolean inserito=false;
		int i;
		Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Assistenza VALUES('10','Giacomo','azienda@email.it','0');");
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
	    daoAssistenza.getRisolto(false);
		Assistenza assistenzax = daoAssistenza.getByID(10);
		if (assistenzax.getIdAssistenza() == 10) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
}
