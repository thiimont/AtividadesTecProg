package br.edu.fatecpg.atividadesjava.model;

public class Pintura {
    String superficie;
    String pincel;
    String tecnica;

    public Pintura(String superficie, String pincel, String tecnica) {
        this.superficie = superficie;
        this.pincel = pincel;
        this.tecnica = tecnica;
    }

    public void criarRepresentacao() {
        System.out.println("Criando representação artística...");
    }

    public void expressarEmocoes() {
        System.out.println("Expressando emoções...");
    }

    public void decorarAmbientes() {
        System.out.println("Decorando ambientes...");
    }
}

