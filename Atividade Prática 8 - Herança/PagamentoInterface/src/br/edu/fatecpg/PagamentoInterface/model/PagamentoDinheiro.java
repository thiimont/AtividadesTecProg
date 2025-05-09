package br.edu.fatecpg.PagamentoInterface.model;

public class PagamentoDinheiro implements Pagamento {
	public double valor;
	
	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double calcularPagamento() {
		return this.valor - (this.valor * 0.10);
	}
	
	@Override
	public void emitirRecibo() {
		System.out.println("\nDinheiro\nValor original: R$" + this.valor + "\nValor pago: R$" + calcularPagamento() + "\nDesconto de: R$" + (this.valor - (calcularPagamento())));
	}

}
