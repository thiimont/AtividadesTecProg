package br.edu.fatecpg.atividadesjava.model;

public class Tigre {
    String pelagem;
    String garras;
    String mandibulas;

    public Tigre(String pelagem, String garras, String mandibulas) {
        this.pelagem = pelagem;
        this.garras = garras;
        this.mandibulas = mandibulas;
    }

    public void caçar() {
        System.out.println("Caçando...");
    }

    public void defenderTerritorio() {
        System.out.println("Defendendo território...");
    }

    public void nadar() {
        System.out.println("Nadando...");
    }
}

