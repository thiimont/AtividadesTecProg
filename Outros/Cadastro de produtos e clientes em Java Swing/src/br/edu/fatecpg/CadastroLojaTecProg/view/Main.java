package br.edu.fatecpg.CadastroLojaTecProg.view;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes viewClientes = new Clientes();
					Produtos viewProdutos = new Produtos(viewClientes);
					viewClientes.setProdutos(viewProdutos);
					viewProdutos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}