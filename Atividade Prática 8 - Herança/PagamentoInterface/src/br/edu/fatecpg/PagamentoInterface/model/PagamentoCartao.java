package br.edu.fatecpg.PagamentoInterface.model;

public class PagamentoCartao implements Pagamento {
	public double valor;
	
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double calcularPagamento() {
		return this.valor + (this.valor * 0.05);
	}
	
	@Override
	public void emitirRecibo() {
		System.out.println("\nCartão\nValor original: R$" + this.valor + "\nValor pago: R$" + calcularPagamento() + "\nTaxa de: R$" + (calcularPagamento() - this.valor));
	}

}
