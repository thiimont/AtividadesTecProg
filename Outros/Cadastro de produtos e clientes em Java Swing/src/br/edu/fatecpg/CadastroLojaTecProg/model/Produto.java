package br.edu.fatecpg.CadastroLojaTecProg.model;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private String categoria;
	
	
	public Produto(int id, String nome, double preco, String categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public String toString() {
		return "ID: " + this.id + " | Nome: " + this.nome + " | Preço: R$" + this.preco + " | Categoria: " + this.categoria;
	}

}
