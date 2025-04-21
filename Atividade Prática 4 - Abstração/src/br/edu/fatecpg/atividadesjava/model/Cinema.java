package br.edu.fatecpg.atividadesjava.model;

public class Cinema {
    String equipamento;
    String roteiro;
    String edicao;

    public Cinema(String equipamento, String roteiro, String edicao) {
        this.equipamento = equipamento;
        this.roteiro = roteiro;
        this.edicao = edicao;
    }

    public void produzirFilmes() {
        System.out.println("Produzindo filmes e documentários...");
    }

    public void exibirHistorias() {
        System.out.println("Exibindo histórias visuais...");
    }

    public void entreterPublico() {
        System.out.println("Entreter e educar o público...");
    }
}

