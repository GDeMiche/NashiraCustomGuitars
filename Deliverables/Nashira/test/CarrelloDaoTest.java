import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Bean.Carrello;
import Bean.Chitarra;
import Bean.ListaCarrelli;
import DAO.CarrelloDAO;
import DAO.ChitarraDAO;
import database.DriverManagerConnectionPool;

class CarrelloDaoTest {
	CarrelloDAO daoCarrello = new CarrelloDAO();
	ChitarraDAO daoChitarra = new ChitarraDAO();
	ArrayList<Chitarra> listaChitarre = new ArrayList<Chitarra>() ;
	ListaCarrelli listaCarrello =new ListaCarrelli();
	Chitarra chitarra=new Chitarra(10,"azienda@email.it","Giacomo","3490000141","100","Carmine","Francesco",100,2);
	
	
	  

	@BeforeEach
	void setUp() throws Exception {
		 Connection connection = null;
	     connection = DriverManagerConnectionPool.getConnection();
	     Statement stmtSelect=null;
	     try {
		      stmtSelect = connection.createStatement();
		      String sql1 =
		          ("INSERT INTO Utente VALUES('azienda@email.it','Giuseppe','Arcano','Cap Gemini','NA','84018','password','0','0');");
		      String sql2 =("INSERT INTO Chitarra VALUES('10','azienda@email.it','Giacomo','3490000141','100','Carmine','Francesco','100','2','0')");
	      
		      stmtSelect.executeUpdate(sql1);
		      stmtSelect.executeUpdate(sql2);
	     
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
		      String sql3 = ("DELETE FROM Carrello WHERE IDCARRELLO='150';");
		      stmtSelect.executeUpdate(sql1);
		      stmtSelect.executeUpdate(sql2);
		      stmtSelect.executeUpdate(sql3);
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
	          ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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

	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    ArrayList<Carrello> listaCarrello = daoCarrello.getAll();
	    for (i = 0; i < listaCarrello.size(); i++) {
	      if (listaCarrello.get(i).getEmail().equals(carrello.getEmail())) {
	        inserito = true;
	      }
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
	    		  ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    Carrello carrellox = daoCarrello.getByEmail("azienda@email.it");
	      if (carrellox.getEmail().equals(carrello.getEmail())) {
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
	    		  ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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

	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    Carrello carrellox = daoCarrello.getByID(150);
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
	      if (carrellox.getIdcarrello()==carrello.getIdcarrello()) {
	    	
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testgetChitarreNonComprate() throws SQLException {
	    boolean inserito = false;
	    int i;
	    
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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

	    ArrayList<Chitarra> listaChitarre= daoCarrello.getChitarreNonComprate("azienda@email.it");
	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    Carrello carrellox = daoCarrello.getByID(150);
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
	    for(i=0;i<listaChitarre.size();i++) {
	      if (listaChitarre.get(i).getComprata()==carrello.getListaChitarre().get(i).getComprata()) {
	    	
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testgetChitarreByEmail() throws SQLException {
	    boolean inserito = false;
	    int i;
	    
		 Connection connection = null;
		 Statement stmtSelect=null;
	     
	     connection = DriverManagerConnectionPool.getConnection();
	    try {
	      stmtSelect = connection.createStatement();
	      String sql2 =
	    		  ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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

	    ArrayList<Chitarra> listaChitarre= daoCarrello.getChitarreByEmail("azienda@email.it");
	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
	    for(i=0;i<listaChitarre.size();i++) {
	      if (listaChitarre.get(i).getEmail().contentEquals(carrello.getEmail())) {
	    	
	        inserito = true;
	      }
	    }
	    assertEquals(inserito, true);
	  }
	
	@Test
	void testadd() throws SQLException {
		boolean inserito=false;
		int i;
		ArrayList<Chitarra> listaChitarre= daoCarrello.getChitarreByEmail("azienda@email.it");
	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
	    daoCarrello.add(carrello);

		Carrello carrellox = daoCarrello.getByEmail("azienda@email.it");
		if (carrellox.getEmail().equals(carrello.getEmail())) {
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
	    		  ("INSERT INTO Carrello VALUES('150','azi@email.it','50');");
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
	    ArrayList<Chitarra> listaChitarre= daoCarrello.getChitarreByEmail("azienda@email.it");
	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
		daoCarrello.update(carrello);

		 Carrello carrellox = daoCarrello.getByID(150);
		   
	      if (carrellox.getEmail().equals(carrello.getEmail())) {
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
	    		  ("INSERT INTO Carrello VALUES('150','azienda@email.it','50');");
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
	    ArrayList<Chitarra> listaChitarre= daoCarrello.getChitarreByEmail("azienda@email.it");
	    listaChitarre.add(chitarra);
	    Carrello carrello = new Carrello(listaChitarre,"azienda@email.it");
	    carrello.addChitarra(chitarra);
	    carrello.setIdcarrello(150);
	    carrello.setEmail("azienda@email.it");
	    carrello.setPrezzotot(400);
		daoCarrello.remove("azienda@email.it");
		Carrello carrellox = daoCarrello.getByID(150);
		
		System.out.println(carrellox.getEmail());
		System.out.println(carrellox.getIdcarrello());
		if (carrellox.getEmail() == null) {
	        inserito = true;
	      }
	    
	    assertEquals(inserito, true);
	  }
	
}