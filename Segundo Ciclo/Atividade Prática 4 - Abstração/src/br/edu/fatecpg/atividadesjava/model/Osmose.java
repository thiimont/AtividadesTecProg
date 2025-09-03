package br.edu.fatecpg.atividadesjava.model;

public class Osmose {
    String solvente;
    String membrana;
    String gradiente;

    public Osmose(String solvente, String membrana, String gradiente) {
        this.solvente = solvente;
        this.membrana = membrana;
        this.gradiente = gradiente;
    }

    public void transferirAgua() {
        System.out.println("Transferindo água...");
    }

    public void equilibrarConcentracao() {
        System.out.println("Equilibrando concentrações...");
    }

    public void manterHomeostase() {
        System.out.println("Mantendo homeostase...");
    }
}

