package br.edu.fatecpg.ProdutoPolimorfo.model;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + getNome() + " | Preço: " + getPreco() + " | Quantidade no estoque: " + getQtdEstoque());
	}

}
