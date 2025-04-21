package br.edu.fatecpg.atividadesjava.model;

public class ArteDigital {
    String ferramenta;
    String manipulacao;
    String interatividade;

    public ArteDigital(String ferramenta, String manipulacao, String interatividade) {
        this.ferramenta = ferramenta;
        this.manipulacao = manipulacao;
        this.interatividade = interatividade;
    }

    public void criarImagem() {
        System.out.println("Criando imagens digitais...");
    }

    public void explorarExpressao() {
        System.out.println("Explorando novas formas de expressão...");
    }

    public void editarObras() {
        System.out.println("Editando obras digitais...");
    }
}

