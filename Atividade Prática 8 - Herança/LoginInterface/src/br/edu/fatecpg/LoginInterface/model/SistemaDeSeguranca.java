package br.edu.fatecpg.LoginInterface.model;
import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel {
	private boolean autenticado = false;
	private Scanner scan;
	
	public SistemaDeSeguranca(Scanner scan) {
		this.scan = scan;
	}
	
	private boolean login(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	private void logout() {
		System.out.println("Fazendo logout...");
		this.autenticado = false;
		realizarLogin();
	}
	
	public void realizarLogin() {
		while(!this.autenticado) {
			String usuario;
			String senha;
			System.out.println("Insira o usuário: ");
			usuario = scan.nextLine();
			System.out.println("Insira a senha: ");
			senha = scan.nextLine();
			
			if(login(usuario, senha)) {
				this.autenticado = true;
				System.out.println("Bem-vindo, " + usuario);
				menuLogado();
			} else {
				System.out.println("Usuário e/ou senha inválidos!");
			}
		}
		
		
	}
	
	private void menuLogado() {
		while(this.autenticado) {
			try {
				System.out.println("[1] Botão do Olá Mundo");
				System.out.println("[2] Logout");
				System.out.println("Digite uma opção: ");
				String input = scan.nextLine();
		        int opcao = Integer.parseInt(input);
		        
		        switch(opcao) {
		        	case 1:
		        		System.out.println("Olá Mundo!");
		        		break;
		        		
		        	case 2:
		        		logout();
		        		break;
		        		
		        	default:
		        		System.out.println("Opção inválida!");
		        }
		        
	        } catch (NumberFormatException e) {
	        	System.out.println("Insira um número válido!");
	        	
	        } catch (Exception e) {
	        	System.out.println("Erro! " + e.getMessage());
	        }
		}
		
	}
}
