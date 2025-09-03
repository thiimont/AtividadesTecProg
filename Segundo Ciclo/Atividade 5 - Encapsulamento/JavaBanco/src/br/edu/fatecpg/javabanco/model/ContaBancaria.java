package br.edu.fatecpg.javabanco.model;

public class ContaBancaria {
	private String titular;
	private double saldo = 0;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void saldoDepositar(double valorDeposito) {
		if(valorDeposito < 1) {
			System.out.println("Não é possível depositar um valor menor que 1");
		} else {
			this.saldo = this.saldo + valorDeposito;
			System.out.println(this.titular + ", você depositou R$" + valorDeposito + ". Agora seu saldo é de R$" + this.saldo);
		}
	}
	
	public void saldoSacar(double valorSaque) {
		if(valorSaque > this.saldo) {
			System.out.println("O valor que está tentando sacar é maior que o saldo atual: R$" + this.saldo);
		} else if(valorSaque < 1) {
			System.out.println("Não é possível sacar um valor menor que 1");
		} else {
			this.saldo = this.saldo - valorSaque;
			System.out.println(this.titular + ", você sacou R$" + valorSaque + ". Agora seu saldo é de R$" + this.saldo);
		}
	}
}
