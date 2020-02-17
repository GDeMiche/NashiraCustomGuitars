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
public class Chitarra {

//  variabili delle colonne del db 
    int idchitarra;
    String email;
    String nome;
    String corpo;
    String tastiera;
    String top;
    String pickup;
    int prezzo;
    int qnt;
    boolean comprata;

// costruttore
    public Chitarra(int idchitarra, String email, String nome, String corpo, String tastiera, String top, String pickup, int prezzo, int qnt) {
        this.idchitarra = idchitarra;
        this.email = email;
        this.nome = nome;
        this.corpo = corpo;
        this.tastiera = tastiera;
        this.top = top;
        this.pickup = pickup;
        this.prezzo = prezzo;
        this.qnt = qnt;
        this.comprata=false;   
    }

    public Chitarra(String email, String nome, String corpo, String tastiera, String top, String pickup, int prezzo, int qnt) {
        this.email = email;
        this.nome = nome;
        this.corpo = corpo;
        this.tastiera = tastiera;
        this.top = top;
        this.pickup = pickup;
        this.prezzo = prezzo;
        this.qnt = qnt;
        this.comprata = false;
    }

    public Chitarra(String email, String nome, String corpo, String tastiera, String top, String pickup, boolean comprata) {
        this.email = email;
        this.nome = nome;
        this.corpo = corpo;
        this.tastiera = tastiera;
        this.top = top;
        this.pickup = pickup;
        this.comprata = comprata;
    }
    
    

    public Chitarra(String email, String nome, String corpo, String tastiera, String top, String pickup, int prezzo, int qnt, boolean comprata) {
        this.email = email;
        this.nome = nome;
        this.corpo = corpo;
        this.tastiera = tastiera;
        this.top = top;
        this.pickup = pickup;
        this.prezzo = prezzo;
        this.qnt = qnt;
        this.comprata = comprata;
    }
    
    

//   getter & setter
    public Chitarra() {
        this.comprata = false;
    }

    public boolean isComprata() {
        return comprata;
    }
    
    public String getComprata(){
        String s = "0";
        if(this.comprata==true){
            s = "1";
        }
        return s;
    }

    public void setComprata(boolean comprata) {
        this.comprata = comprata;
    }

    public int getIdchitarra() {
        return idchitarra;
    }

    public void setIdchitarra(int idchitarra) {
        this.idchitarra = idchitarra;
    }

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

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getTastiera() {
        return tastiera;
    }

    public void setTastiera(String tastiera) {
        this.tastiera = tastiera;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return "Chitarra" + idchitarra + ", corpo=" + corpo + ", tastiera=" + tastiera + ", top=" + top + ", pickup=" + pickup + ", prezzo=" + prezzo + ", qnt=" + qnt + "}\n";
    }

}
