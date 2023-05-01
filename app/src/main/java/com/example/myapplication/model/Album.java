package com.example.myapplication.model;


public class Album {

    private String local;
    private int imagem;

    int saibamais;


    public Album(String local, int saibamais, int imagem) {
        this.local = local;
        this.saibamais = saibamais;
        this.imagem = imagem;


    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getSaibamais() {
        return saibamais;
    }

    public void setSaibamais(int saibamais) {
        this.saibamais = saibamais;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


}
