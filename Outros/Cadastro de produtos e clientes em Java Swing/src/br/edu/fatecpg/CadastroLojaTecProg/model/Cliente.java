package br.edu.fatecpg.CadastroLojaTecProg.model;

public class Cliente {
	private int id;
	private String nome;
	private double credito;
	
	
	public Cliente(int id, String nome, double credito) {
		this.id = id;
		this.nome = nome;
		this.credito = credito;
	}
	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public double getCredito() {
		return this.credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public String toString() {
		return "ID: " + this.id + " | Nome: " + this.nome + " | Crédito: R$" + this.credito;
	}

}
