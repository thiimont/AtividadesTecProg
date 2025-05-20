package br.edu.fatecpg.ProdutoPolimorfo.view;
import br.edu.fatecpg.ProdutoPolimorfo.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Número 1");
		Produto produto2 = new Produto("Número 2", 100);
		Produto produto3 = new Produto("Número 3", 100, 50);
		
		produto1.exibirInformacoes();
		produto2.exibirInformacoes();
		produto3.exibirInformacoes();

	}

}
