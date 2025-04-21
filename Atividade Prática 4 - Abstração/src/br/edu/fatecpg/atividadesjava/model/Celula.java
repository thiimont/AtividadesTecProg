package br.edu.fatecpg.atividadesjava.model;

public class Celula {
    String membrana;
    String nucleo;
    String citoplasma;

    public Celula(String membrana, String nucleo, String citoplasma) {
        this.membrana = membrana;
        this.nucleo = nucleo;
        this.citoplasma = citoplasma;
    }

    public void realizarFuncoesVitais() {
        System.out.println("Realizando funções vitais...");
    }

    public void dividir() {
        System.out.println("Dividindo a célula...");
    }

    public void armazenarMaterialGenetico() {
        System.out.println("Armazenando material genético...");
    }
}

