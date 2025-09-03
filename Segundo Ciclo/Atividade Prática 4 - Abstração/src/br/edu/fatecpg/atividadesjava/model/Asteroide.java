package br.edu.fatecpg.atividadesjava.model;

public class Asteroide {
    String composicao;
    String tamanho;
    String orbita;

    public Asteroide(String composicao, String tamanho, String orbita) {
        this.composicao = composicao;
        this.tamanho = tamanho;
        this.orbita = orbita;
    }

    public void viajarEspaco() {
        System.out.println("Viajando pelo espaço...");
    }

    public void colidir() {
        System.out.println("Colidindo com planetas...");
    }

    public void fornecerInformacoes() {
        System.out.println("Fornecendo informações...");
    }
}

