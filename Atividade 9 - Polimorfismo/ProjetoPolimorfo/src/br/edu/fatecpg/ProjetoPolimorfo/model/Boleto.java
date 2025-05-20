package br.edu.fatecpg.ProjetoPolimorfo.model;
import java.util.Random;

public class Boleto extends Pagamento {
	private Random rd = new Random();
	
	public Boleto(double valor) {
		super(valor);
	}

	@Override
	public String processar() {
		Long boleto = rd.nextLong(100000000000000000l, 999999999999999999l);
		return "Pagamento realizado no boleto: " + boleto + " no valor de: " + this.getValor();
	}
	
}