/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ListaCarrelli {

    ArrayList<Carrello> listaCarrelli;

    public ListaCarrelli() {
        listaCarrelli = new ArrayList<Carrello>();
    }

    public ArrayList<Carrello> getListaCarrelli() {
        return listaCarrelli;
    }

    public void setListaCarrelli(ArrayList<Carrello> listaCarrelli) {
        this.listaCarrelli = listaCarrelli;
    }

    public void addCarrello(Carrello c) {
        listaCarrelli.add(c);
    }

    public void removeCarrello(Carrello c) {
        listaCarrelli.remove(c);
    }

    public Carrello getCarrellobyID(int idcarello) {
        Carrello c0 = new Carrello();
        for (Carrello c : listaCarrelli) {
            if (idcarello == c.getIdcarrello()) {
                return c;
            }
        }
        return c0;
    }

    public ArrayList<Chitarra> getChitarrebyEmail(String email) {
        Carrello c0 = new Carrello();
        for (Carrello c : listaCarrelli) {
            if (email.equals(c.getEmail())) {
                return c.getListaChitarre();
            }
        }
        return c0.getListaChitarre();
    }

    public Carrello getCarrellobyEmail(String email) {
        Carrello c0 = new Carrello();
        for (Carrello c : listaCarrelli) {
            if (email.equals(c.getEmail())) {
                return c;
            }
        }
        return c0;
    }

    @Override
    public String toString() {
        if (listaCarrelli.isEmpty()) {
            return "Lista Carrelli Vuota";
        } else {
            for (Carrello c : listaCarrelli) {
                return "ListaCarrelli \n" + c.toString() + "\n";
            }
        }
        return "Fine lista Carrelli";
    }

}
