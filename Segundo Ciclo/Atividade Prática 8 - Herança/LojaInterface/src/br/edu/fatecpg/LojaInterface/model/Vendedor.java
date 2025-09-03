package br.edu.fatecpg.LojaInterface.model;

public class Vendedor implements Funcionario {

	@Override
	public void baterPonto() {
		System.out.println("Bateu ponto");
	}
	
	@Override
	public void solicitarMaterial() {
		System.out.println("Solicitou material");
	}
	
	public void realizarVenda() {
		System.out.println("Realizou a venda");
	}
}
