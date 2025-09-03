package br.edu.fatecpg.LojaInterface.view;
import br.edu.fatecpg.LojaInterface.model.Faxineiro;
import br.edu.fatecpg.LojaInterface.model.Gerente;
import br.edu.fatecpg.LojaInterface.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		Faxineiro faxineiro = new Faxineiro();
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		
		faxineiro.baterPonto();
		faxineiro.solicitarMaterial();
		gerente.fecharCaixa();
		vendedor.realizarVenda();

	}

}
