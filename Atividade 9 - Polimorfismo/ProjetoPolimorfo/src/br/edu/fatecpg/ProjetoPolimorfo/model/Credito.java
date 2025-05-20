package br.edu.fatecpg.ProjetoPolimorfo.model;

public class Credito extends Pagamento {
	public String nome;
	public String numCartao;
	public int vezes;

	public Credito(double valor) {
		super(valor);
	}
	
	public Credito(double valor, String nome, String numCartao, int vezes) {
		super(valor);
		this.nome = nome;
		this.numCartao = numCartao;
		this.vezes = vezes;
	}

	public String processar(String nome, String numCartao, int vezes) {
		return "Pagamento realizado no cartão de crédito!";
	}

}