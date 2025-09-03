package br.edu.fatecpg.atividadesjava.model;

public class IdadeMedia {
    String periodo;
    String sistema;
    String religiao;

    public IdadeMedia(String periodo, String sistema, String religiao) {
        this.periodo = periodo;
        this.sistema = sistema;
        this.religiao = religiao;
    }

    public void modelarEstruturas() {
        System.out.println("Modelando estruturas políticas e sociais...");
    }

    public void impactarCultura() {
        System.out.println("Impactando a evolução da cultura...");
    }

    public void formarBasesCulturais() {
        System.out.println("Formando bases de culturas ocidentais...");
    }
}

