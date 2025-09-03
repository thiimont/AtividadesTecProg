package br.edu.fatecpg.LojaInterface.model;

public class Gerente implements Funcionario {
	
	@Override
	public void baterPonto() {
		System.out.println("Bateu ponto");
	}
	
	@Override
	public void solicitarMaterial(){
		System.out.println("Solicitou material");
	}
	
	public void fecharCaixa() {
		System.out.println("Fechou o caixa");
	}
}
