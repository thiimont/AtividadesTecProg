package br.edu.fatecpg.ProjetoPolimorfo.view;
import br.edu.fatecpg.ProjetoPolimorfo.model.Boleto;
import br.edu.fatecpg.ProjetoPolimorfo.model.Credito;

public class Main {

	public static void main(String[] args) {
		Boleto boleto = new Boleto(500);
		System.out.println(boleto.processar());
		
		Credito cr = new Credito(300);
		String r = cr.processar("Thiago", "1234", 2);
		System.out.println(r);
		r = cr.processar();
		System.out.println(r);
	}

}