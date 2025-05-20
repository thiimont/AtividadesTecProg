package br.edu.fatecpg.ConversorPolimorfo.model;

public class Conversor {
	public void converter(double C) {
		double F = C * 1.8 + 32;
		System.out.println("em Fahrenheit: " + F);
	}
	
	public void converter(int km) {
		double mi = km * 0.62137;
		System.out.println("em milhas: " + mi);
	}
	
	public void converter(String str) {
		String strUpper = str.toUpperCase();
		System.out.println("em letra maiúscula: " + strUpper);
	}
}
