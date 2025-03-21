package br.edu.fatecpg.javacarro.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	// em litros
	private int capacidadeTanque = 40;
	private int gasolinaAtual = 40;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public int getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
	
	public int getGasolinaAtual() {
		return this.gasolinaAtual;
	}
	
	public void setGasolinaAtual(int gasolinaAtual) {
		if(gasolinaAtual < 0 || gasolinaAtual > this.capacidadeTanque) {
			System.out.println("Não é possível colocar um valor abaixo de zero ou acima da capacidade do tanque (" + this.capacidadeTanque + "L)");
		} else {
			this.gasolinaAtual = gasolinaAtual;
			System.out.println("Agora o nível de gasolina atual do tanque é " + this.gasolinaAtual + "L");
		}
	}
	
	public void calcularGasolina(double valorGasolina) {
		int auxGasolinaAtual = this.gasolinaAtual;
		int auxValor = 0;
		if(auxGasolinaAtual < this.capacidadeTanque) {
			do {
				auxGasolinaAtual++;
				auxValor++;
			} while(auxGasolinaAtual < this.capacidadeTanque);
			System.out.println("Valor para encher o tanque: R$" + (valorGasolina * auxValor));
		} else {
			System.out.println("O tanque está cheio!");
		}
	}

}
