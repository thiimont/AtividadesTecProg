package br.edu.fatecpg.javacarro.view;
import br.edu.fatecpg.javacarro.model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno", 2010);
		
		System.out.println("Seu carro é da marca " + carro.getMarca() + ", modelo " + carro.getModelo() + " " + carro.getAno());
		System.out.println("A capacidade do tanque é de " + carro.getCapacidadeTanque() + "L | Nível de gasolina atual do tanque: " + carro.getGasolinaAtual() + "L");

		carro.setGasolinaAtual(24);
		carro.calcularGasolina(5.54);
		
		System.out.println("Seu carro é da marca " + carro.getMarca() + ", modelo " + carro.getModelo() + " " + carro.getAno());
		System.out.println("A capacidade do tanque é de " + carro.getCapacidadeTanque() + "L | Nível de gasolina atual do tanque: " + carro.getGasolinaAtual() + "L");
	}

}
