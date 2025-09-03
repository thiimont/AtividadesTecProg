package br.edu.fatecpg.atividadesjava.model;

public class Gravura {
    String material;
    String tecnica;
    String tipo;

    public Gravura(String material, String tecnica, String tipo) {
        this.material = material;
        this.tecnica = tecnica;
        this.tipo = tipo;
    }

    public void criarReproducao() {
        System.out.println("Criando reprodução...");
    }

    public void imprimirImagem() {
        System.out.println("Imprimindo imagem...");
    }

    public void transferirDesign() {
        System.out.println("Transferindo design...");
    }
}

