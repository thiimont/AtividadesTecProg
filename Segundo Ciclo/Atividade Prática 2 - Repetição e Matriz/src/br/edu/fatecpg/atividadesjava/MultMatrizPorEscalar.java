package br.edu.fatecpg.atividadesjava;
import java.util.Scanner;

public class MultMatrizPorEscalar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, senha;
		boolean logado = false;
		boolean erro = true;
		
		String[][] login = {
				{"thiago", "fatec777"},
				{"ana", "1234"},
				{"pedro", "abc"},
				{"mariana", "0000"},
				{"sofia", "qwerty"},
				{"lucas", "123abc"}
		};
		
		do {
			System.out.println("Digite o seu nome: ");
			nome = scan.nextLine();
			System.out.println("Digite a sua senha: ");
			senha = scan.nextLine();
			for(int x=0; x<6; x++) {
				if(login[x][0].equals(nome) && login[x][1].equals(senha)) {
					System.out.println("Logado(a) com sucesso!");
					logado = true;
					erro = false;
				}
			}
			if(erro) {
				System.out.println("Nome e/ou senha incorretos!");
			}
		} while(!logado);

	}

}
