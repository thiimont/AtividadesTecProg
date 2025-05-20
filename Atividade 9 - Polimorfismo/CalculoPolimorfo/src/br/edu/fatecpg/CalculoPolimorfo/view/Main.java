package br.edu.fatecpg.CalculoPolimorfo.view;
import br.edu.fatecpg.CalculoPolimorfo.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.somar(5, 5);
		calc.somar(5, 5, 5);
		calc.somar(2.5, 2.5);

	}

}
