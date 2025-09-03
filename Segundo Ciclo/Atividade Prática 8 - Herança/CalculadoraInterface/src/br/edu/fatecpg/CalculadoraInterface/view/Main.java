package br.edu.fatecpg.CalculadoraInterface.view;
import br.edu.fatecpg.CalculadoraInterface.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(5, 5));
		System.out.println(calc.subtrair(5, 5));
		System.out.println(calc.multiplicar(5, 5));
		System.out.println(calc.dividir(10, 2));
	}

}
