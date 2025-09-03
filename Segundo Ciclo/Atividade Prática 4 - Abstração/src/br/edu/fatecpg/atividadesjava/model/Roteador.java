package br.edu.fatecpg.atividadesjava.model;

public class Roteador {
    String entradas;
    String antenas;
    String trafego;

    public Roteador(String entradas, String antenas, String trafego) {
        this.entradas = entradas;
        this.antenas = antenas;
        this.trafego = trafego;
    }

    public void rotearPacotes() {
        System.out.println("Roteando pacotes...");
    }

    public void conectarDispositivos() {
        System.out.println("Conectando dispositivos...");
    }

    public void gerenciarSeguranca() {
        System.out.println("Gerenciando segurança...");
    }
}

