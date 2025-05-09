package br.edu.fatecpg.LoginInterface.view;
import br.edu.fatecpg.LoginInterface.model.SistemaDeSeguranca;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SistemaDeSeguranca s = new SistemaDeSeguranca(scan);
		
		s.realizarLogin();
		

	}

}
