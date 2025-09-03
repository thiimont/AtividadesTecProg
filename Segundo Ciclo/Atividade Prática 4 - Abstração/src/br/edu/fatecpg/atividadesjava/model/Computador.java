package br.edu.fatecpg.atividadesjava.model;

public class Computador {
    String proc;
    int ram;
    String so;

    public Computador(String proc, int ram, String so) {
        this.proc = proc;
        this.ram = ram;
        this.so = so;
    }

    public void executarPrograma() {
        System.out.println("Executando programa no " + so);
    }

    public void armazenarDados() {
        System.out.println("Armazenando dados...");
    }

    public void conectarInternet() {
        System.out.println("Conectando à internet...");
    }
}
