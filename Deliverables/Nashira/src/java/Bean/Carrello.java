/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.ArrayList;

/**
 *Pè
 * @author LittleJoke
 */
public class Carrello {

//    variabili
    String email;
    int idcarrello;
    float prezzotot;
    ArrayList<Chitarra> listaChitarre;

//    costruttore
    public Carrello(ArrayList<Chitarra> listaChitarre, String email) {
        this.email = email;
        this.listaChitarre = listaChitarre;
        
    }

    public Carrello() {
        listaChitarre = new ArrayList<Chitarra>();
    }

    public ArrayList<Chitarra> getChitarrebyEmail(String email) { 
        for (Chitarra c : listaChitarre) {                                     
            if (email.equals(c.getEmail())) {                                 
                this.addChitarra(c);                                              
            }
        }
        return listaChitarre;
    }
    
//    getter & setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPrezzoTot() {
        float f = 0;
        for (Chitarra chit : this.listaChitarre) {
            f += chit.getPrezzo() * chit.getQnt();
        }
        return f;
    }

    public void setPrezzotot(float prezzotot) {
        this.prezzotot = prezzotot;
    }

    public void setListaChitarre(ArrayList<Chitarra> listaChitarre) {
        this.listaChitarre = listaChitarre;
    }
    
    public ArrayList<Chitarra> getListaChitarre() {
        return listaChitarre;
    }

    public int getIdcarrello() {
        return idcarrello;
    }

    public void setIdcarrello(int idcarrello) {
        this.idcarrello = idcarrello;
    }

    public void addChitarra(Chitarra chitarra) {
        this.listaChitarre.add(chitarra);
    }

    public void removeChitarra(Chitarra chitarra) {
        this.listaChitarre.remove(chitarra);
    }

    
    @Override
    public String toString() {
        if (listaChitarre.isEmpty()) {
            return "Lista Chitarre Vuota";
        } else {
            for (Chitarra c : listaChitarre) {
                return "Carrello{" + "idUtente=" + email + ", idcarrello=" + idcarrello + ", prezzotot=" + prezzotot + ", \nCarrello Utente=" + c.toString();
            }
        }
        return "Fine lista Chitarre";
    }

}
