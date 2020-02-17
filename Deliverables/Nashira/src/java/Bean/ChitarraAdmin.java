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
public class ChitarraAdmin {
    
    int idchitarradmin;
    String img;
    String nome;
    float prezzo;
    String desc;

    public ChitarraAdmin(String nome, float prezzo, String desc) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.desc = desc;
    }

    public ChitarraAdmin() {
    }

    public ChitarraAdmin(String nome, float prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    
    
    public int getIdchitarradmin() {
        return idchitarradmin;
    }

    public void setIdchitarradmin(int idchitarradmin) {
        this.idchitarradmin = idchitarradmin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}