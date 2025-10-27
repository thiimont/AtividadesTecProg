package br.edu.fatecpg.CadastroLojaTecProg.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.CadastroLojaTecProg.model.Cliente;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private JTextField txt_credito;
	private JTextField txt_idcliente;
	private JTextField txt_idproduto;
	private Produtos viewProdutos;
	private DefaultListModel<Cliente> clientes = new DefaultListModel<Cliente>();
	private int idCliente = 0;
	
	
	public Clientes() {
		setTitle("Cadastro de clientes e compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<Cliente> list = new JList<Cliente>(clientes);
		list.setBounds(26, 28, 391, 190);
		contentPane.add(list);
		
		JLabel lbl_mensagem = new JLabel("");
		lbl_mensagem.setBounds(289, 230, 282, 36);
		contentPane.add(lbl_mensagem);
		
		JButton btn_adicionar = new JButton("Adicionar");
		btn_adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = txt_nome.getText().trim();
					double credito = Double.parseDouble(txt_credito.getText().trim());
					
					Cliente novoCliente = new Cliente(idCliente, nome, credito);
					clientes.addElement(novoCliente);
					idCliente++;
					lbl_mensagem.setText("Cliente adicionado com sucesso!");
				} catch(NumberFormatException erro) {
					lbl_mensagem.setText("Insira informações válidas.");
				}
			}
		});
		btn_adicionar.setBounds(447, 146, 114, 27);
		contentPane.add(btn_adicionar);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(447, 64, 114, 21);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		txt_credito = new JTextField();
		txt_credito.setBounds(447, 113, 114, 21);
		contentPane.add(txt_credito);
		txt_credito.setColumns(10);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setBounds(447, 45, 60, 17);
		contentPane.add(lbl_nome);
		
		JLabel lbl_credito = new JLabel("Crédito:");
		lbl_credito.setBounds(447, 97, 60, 17);
		contentPane.add(lbl_credito);
		
		txt_idcliente = new JTextField();
		txt_idcliente.setBounds(101, 223, 52, 21);
		contentPane.add(txt_idcliente);
		txt_idcliente.setColumns(10);
		
		JLabel lbl_idcliente = new JLabel("ID do Cliente:");
		lbl_idcliente.setBounds(12, 225, 88, 17);
		contentPane.add(lbl_idcliente);
		
		JLabel lbl_idproduto = new JLabel("ID do Produto:");
		lbl_idproduto.setBounds(12, 249, 88, 17);
		contentPane.add(lbl_idproduto);
		
		txt_idproduto = new JTextField();
		txt_idproduto.setColumns(10);
		txt_idproduto.setBounds(101, 247, 52, 21);
		contentPane.add(txt_idproduto);
		
		JButton btn_comprar = new JButton("Comprar");
		btn_comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int idCli = Integer.parseInt(txt_idcliente.getText().trim());
					int idProd = Integer.parseInt(txt_idproduto.getText().trim());
					
					double credito = clientes.get(idCli).getCredito();
					double preco = viewProdutos.getPrecoProduto(idProd);
					
					if((credito - preco) < 0) {
						lbl_mensagem.setText("Saldo insuficiente.");
					} else {
						clientes.get(idCli).setCredito(credito - preco);
						lbl_mensagem.setText("Compra realizada com sucesso!");
						contentPane.revalidate();
						contentPane.repaint();
					}
					
				} catch(NumberFormatException erro) {
					lbl_mensagem.setText("Insira os IDs.");
				} catch(ArrayIndexOutOfBoundsException erro) {
					lbl_mensagem.setText("ID(s) inválido(s).");
				}
			}
		});
		btn_comprar.setBounds(165, 234, 106, 27);
		contentPane.add(btn_comprar);
		
		JLabel lbl_titulo = new JLabel("Lista de clientes e compras:");
		lbl_titulo.setBounds(26, 12, 195, 17);
		contentPane.add(lbl_titulo);
	}
	
	protected void setProdutos(Produtos viewProdutos) {
		this.viewProdutos = viewProdutos;
	}
}
