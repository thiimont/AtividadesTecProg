package br.edu.fatecpg.CalculoPolimorfo.model;

public class Calculadora {
	public void somar(int a, int b) {
		System.out.println("Resultado: " + (a + b));
	}
	
	public void somar(int a, int b, int c) {
		System.out.println("Resultado: " + (a + b + c));
	}
	
	public void somar(double a, double b) {
		System.out.println("Resultado: " + (a + b));
	}

}
