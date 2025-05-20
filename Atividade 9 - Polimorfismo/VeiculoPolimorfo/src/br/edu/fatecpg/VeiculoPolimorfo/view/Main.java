package br.edu.fatecpg.VeiculoPolimorfo.view;
import br.edu.fatecpg.VeiculoPolimorfo.model.Carro;
import br.edu.fatecpg.VeiculoPolimorfo.model.Bicicleta;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();
		
		System.out.println(carro.mover());
		System.out.println(bicicleta.mover());
	}

}
