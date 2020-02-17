/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author LittleJoke
 */
public class Utente {

    // variabili delle colonne del db
    String email;
    String nome;
    String cognome;
    String indirizzo;
    String citta;
    String zip;
    String password;
    boolean esperto;
    boolean admin;

    //costruttori
    
    /**
     * 
     * @param email
     * @param nome
     * @param cognome
     * @param indirizzo
     * @param citta
     * @param zip
     * @param password
     * @param esperto
     * @param admin 
     */
    public Utente(String email, String nome, String cognome, String indirizzo, String citta, String zip, String password, boolean esperto,boolean admin) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.zip = zip;
        this.password = password;
        this.esperto = esperto;
        this.admin = admin;
    }
/**
 * 
 * @param email
 * @param nome
 * @param cognome
 * @param indirizzo
 * @param citta
 * @param zip
 * @param password 
 */
    public Utente(String email, String nome, String cognome, String indirizzo, String citta, String zip, String password) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.zip = zip;
        this.password = password;
    }
/**
 * 
 * @param email
 * @param nome
 * @param cognome
 * @param indirizzo
 * @param citta
 * @param zip
 * @param password
 * @param esperto 
 */
    public Utente(String email, String nome, String cognome, String indirizzo, String citta, String zip, String password, boolean esperto) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.zip = zip;
        this.password = password;
        this.esperto = esperto;
    }
    
    
    
    public Utente() {
        this.esperto=false;
        this.admin=false;
    }

    public Utente(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public String getAdmin(){
        String s = "0";
        if(this.admin==true){
            s = "1";
        }
        return s;
    }
    
    public String getEsperto(){
        String s = "0";
        if(this.esperto==true){
            s = "1";
        }
        return s;
    }

    public void setAdmin(String admin) {
        this.admin = false;
    }

    //getter & setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEsperto() {
        return esperto;
    }

    public void setEsperto(boolean esperto) {
        this.esperto = esperto;
        
    }

    @Override
    public String toString() {
        return "Utente{" + "email=" + email + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", citta=" + citta + ", zip=" + zip + ", password=" + password + ", esperto=" + esperto + ", admin=" + admin + '}';
    }

    
}
