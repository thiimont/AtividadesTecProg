package br.edu.fatecpg.atividadesjava.model;

public class Trem {
    String locomotiva;
    String vagonete;
    String trilho;

    public Trem(String locomotiva, String vagonete, String trilho) {
        this.locomotiva = locomotiva;
        this.vagonete = vagonete;
        this.trilho = trilho;
    }

    public void transportarPassageiros() {
        System.out.println("Transportando passageiros...");
    }

    public void moverSobreTrilhos() {
        System.out.println("Movendo sobre trilhos...");
    }

    public void transportarCarga() {
        System.out.println("Transportando carga...");
    }
}

