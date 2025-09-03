package br.edu.fatecpg.atividadesjava.model;

public class Recessao {
    String pib;
    String desemprego;
    String consumo;

    public Recessao(String pib, String desemprego, String consumo) {
        this.pib = pib;
        this.desemprego = desemprego;
        this.consumo = consumo;
    }

    public void impactarEconomia() {
        System.out.println("Impactando a economia...");
    }

    public void reduzirConfiançaMercado() {
        System.out.println("Reduzindo confiança do mercado...");
    }

    public void afetarPoliticas() {
        System.out.println("Afetando políticas fiscais...");
    }
}
