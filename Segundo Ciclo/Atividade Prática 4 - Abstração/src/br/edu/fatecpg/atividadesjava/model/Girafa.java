package br.edu.fatecpg.atividadesjava.model;

public class Girafa {
    double altura;
    String manchas;
    int velocidade;

    public Girafa(double altura, String manchas, int velocidade) {
        this.altura = altura;
        this.manchas = manchas;
        this.velocidade = velocidade;
    }

    public void comerFolhas() {
        System.out.println("Comendo folhas...");
    }

    public void correr() {
        System.out.println("Correndo a " + velocidade + " km/h.");
    }

    public void socializar() {
        System.out.println("Socializando com o grupo...");
    }
}

