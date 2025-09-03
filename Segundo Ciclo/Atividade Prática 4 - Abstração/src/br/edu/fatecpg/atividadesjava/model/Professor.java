package br.edu.fatecpg.atividadesjava.model;

public class Professor {
    String materia;
    String comunicacao;
    String experiencia;

    public Professor(String materia, String comunicacao, String experiencia) {
        this.materia = materia;
        this.comunicacao = comunicacao;
        this.experiencia = experiencia;
    }

    public void ensinar() {
        System.out.println("Ensinando...");
    }

    public void avaliar() {
        System.out.println("Avaliar progresso...");
    }

    public void planejarAulas() {
        System.out.println("Planejando aulas...");
    }
}

