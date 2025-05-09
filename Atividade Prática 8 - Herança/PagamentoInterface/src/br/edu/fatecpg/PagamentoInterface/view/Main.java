package br.edu.fatecpg.PagamentoInterface.view;
import br.edu.fatecpg.PagamentoInterface.model.PagamentoCartao;
import br.edu.fatecpg.PagamentoInterface.model.PagamentoDinheiro;

public class Main {

	public static void main(String[] args) {
		PagamentoCartao pC = new PagamentoCartao(100);
		PagamentoDinheiro pD = new PagamentoDinheiro(100);
		
		// no cartão
		pC.emitirRecibo();
		
		// no dinheiro
		pD.emitirRecibo();
		

	}

}
