package br.edu.fatecpg.atividadesjava.model;

public class Genetica {
    String dna;
    String cromossomos;
    String alelos;

    public Genetica(String dna, String cromossomos, String alelos) {
        this.dna = dna;
        this.cromossomos = cromossomos;
        this.alelos = alelos;
    }

    public void transmitirCaracterísticas() {
        System.out.println("Transmitindo características...");
    }

    public void determinarCaracteristicas() {
        System.out.println("Determinando características físicas...");
    }

    public void regularProcessos() {
        System.out.println("Regulando processos biológicos...");
    }
}

