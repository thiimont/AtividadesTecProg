package br.edu.fatecpg.ConversorPolimorfo.view;
import br.edu.fatecpg.ConversorPolimorfo.model.Conversor;

public class Main {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		
		conversor.converter(25.5);
		conversor.converter(60);
		conversor.converter("hello world!");
	}

}
