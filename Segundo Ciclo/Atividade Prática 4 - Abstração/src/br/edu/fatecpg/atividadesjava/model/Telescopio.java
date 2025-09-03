package br.edu.fatecpg.atividadesjava.model;

public class Telescopio {
    String lente;
    String tubo;
    String montagem;

    public Telescopio(String lente, String tubo, String montagem) {
        this.lente = lente;
        this.tubo = tubo;
        this.montagem = montagem;
    }

    public void aumentarVisao() {
        System.out.println("Aumentando a visão...");
    }

    public void focarObjeto() {
        System.out.println("Focando objeto...");
    }

    public void ajustarPosicao() {
        System.out.println("Ajustando posição...");
    }
}

