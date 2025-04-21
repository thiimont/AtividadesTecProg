package br.edu.fatecpg.atividadesjava.model;

public class Smartwatch {
    String tela;
    String sensor;
    String bateria;

    public Smartwatch(String tela, String sensor, String bateria) {
        this.tela = tela;
        this.sensor = sensor;
        this.bateria = bateria;
    }

    public void monitorarSaude() {
        System.out.println("Monitorando saúde...");
    }

    public void exibirNotificacoes() {
        System.out.println("Exibindo notificações...");
    }

    public void realizarChamadas() {
        System.out.println("Realizando chamadas...");
    }
}

