package br.edu.fatecpg.atividadesjava.model;

public class Desenho {
    String ferramenta;
    String superficie;
    String tecnica;

    public Desenho(String ferramenta, String superficie, String tecnica) {
        this.ferramenta = ferramenta;
        this.superficie = superficie;
        this.tecnica = tecnica;
    }

    public void criarRepresentacao() {
        System.out.println("Criando representação...");
    }

    public void transmitirIdeia() {
        System.out.println("Transmitindo ideia...");
    }

    public void produzirArte() {
        System.out.println("Produzindo arte...");
    }
}
