package br.edu.fatecpg.javabanco.view;
import br.edu.fatecpg.javabanco.model.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria thiago = new ContaBancaria("Thiago");
		ContaBancaria monteiro = new ContaBancaria("Monteiro");
		
		System.out.println("Titular da conta: " + thiago.getTitular() + " | Saldo atual: " + thiago.getSaldo());
		System.out.println("Titular da conta: " + monteiro.getTitular() + " | Saldo atual: " + monteiro.getSaldo());
		
		// depósito
		thiago.saldoDepositar(0); // retorna um erro pois não é possível depositar valores menores que 1
		thiago.saldoDepositar(100);
		
		monteiro.saldoDepositar(50);
		
		// saque
		thiago.saldoSacar(200); // retorna um erro pois o valor é maior que o saldo atual de Thiago
		thiago.saldoSacar(50);
		
		monteiro.saldoSacar(-1); // retorna um erro pois não é possível sacar valores menores que 1
		monteiro.saldoSacar(25);
		
		System.out.println("Titular da conta: " + thiago.getTitular() + " | Saldo atual: " + thiago.getSaldo());
		System.out.println("Titular da conta: " + monteiro.getTitular() + " | Saldo atual: " + monteiro.getSaldo());
	}

}
