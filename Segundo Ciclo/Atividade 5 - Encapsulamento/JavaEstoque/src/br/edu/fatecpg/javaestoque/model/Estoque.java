package br.edu.fatecpg.javaestoque.model;

public class Estoque {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Estoque(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	
	public void setPreco(double preco) {
		if(preco < 0) {
			System.out.println("O preço não pode ser menor que zero");
		} else {
			this.preco = preco;
			System.out.println("Agora o preço do produto é R$" + this.preco);
		}
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0) {
			System.out.println("A quantidade no estoque não pode ser menor que zero");
		} else {
			this.quantidadeEstoque = quantidadeEstoque;
			System.out.println("Agora a quantidade no estoque do produto é " + this.quantidadeEstoque);
		}
	}
	
}
