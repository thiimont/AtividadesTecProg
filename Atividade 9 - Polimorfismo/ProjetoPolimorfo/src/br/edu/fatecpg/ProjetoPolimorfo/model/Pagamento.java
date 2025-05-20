package br.edu.fatecpg.ProjetoPolimorfo.model;

public abstract class Pagamento {
	private double valor;
	
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String processar() {
		return "Processando pagamento genérico...";
	}
}