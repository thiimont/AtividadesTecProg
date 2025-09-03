package br.edu.fatecpg.javaestoque.view;
import br.edu.fatecpg.javaestoque.model.Estoque;

public class Main {

	public static void main(String[] args) {
		Estoque produto = new Estoque("Notebook", 2500, 100);
		
		System.out.println("Nome do produto: " + produto.getNome() + " | Preço: " + produto.getPreco() + " | Estoque disponível: " + produto.getQuantidadeEstoque());
		
		// preço
		produto.setPreco(-1); // retorna um erro pois o valor não pode ser menor que zero
		produto.setPreco(2300);
		
		// estoque
		produto.setQuantidadeEstoque(-1); // retorna um erro pois a quantidade no estoque não pode ser menor que zero
		produto.setQuantidadeEstoque(200);
		
		System.out.println("Nome do produto: " + produto.getNome() + " | Preço: " + produto.getPreco() + " | Estoque disponível: " + produto.getQuantidadeEstoque());
	}

}
