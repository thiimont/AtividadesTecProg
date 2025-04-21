package br.edu.fatecpg.atividadesjava.model;

public class TaxaDeJuros {
    double taxa;
    String periodo;
    double base;

    public TaxaDeJuros(double taxa, String periodo, double base) {
        this.taxa = taxa;
        this.periodo = periodo;
        this.base = base;
    }

    public void calcularEmprestimo() {
        System.out.println("Calculando empréstimo...");
    }

    public void determinarRetornoInvestimento() {
        System.out.println("Determinando retorno do investimento...");
    }

    public void ajustarDividas() {
        System.out.println("Ajustando dívidas...");
    }
}

