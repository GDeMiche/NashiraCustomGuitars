/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author pc
 */
public class Assistenza {
    int idAssistenza;
    String problema;
    String email;
    boolean risolto;

    public Assistenza(String problema, String email) {
        this.problema = problema;
        this.email = email;
    }

    public Assistenza(int idAssistenza, String problema, String email, boolean risolto) {
        this.idAssistenza = idAssistenza;
        this.problema = problema;
        this.email = email;
        this.risolto = risolto;
    }

    public Assistenza(String problema, String email, boolean risolto) {
        this.problema = problema;
        this.email = email;
        this.risolto = risolto;
    }

    public Assistenza() {
    }

    public int getIdAssistenza() {
        return idAssistenza;
    }

    public void setIdAssistenza(int idAssistenza) {
        this.idAssistenza = idAssistenza;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRisolto() {
        return risolto;
    }

     public String getRisolto(){
        String s = "0";
        if(this.risolto==true){
            s = "1";
        }
        return s;
    }
     
    public void setRisolto(boolean risolto) {
        this.risolto = risolto;
    }
    
    
}
