package br.edu.fatecpg.CadastroLojaTecProg.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.CadastroLojaTecProg.model.Produto;

import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Produtos extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private JTextField txt_preco;
	private JTextField txt_categoria;
	private Clientes viewClientes;
	private DefaultListModel<Produto> produtos = new DefaultListModel<Produto>();
	private int idProduto = 0;

	
	public Produtos(Clientes viewClientes) {
		this.viewClientes = viewClientes;
		
		setTitle("Cadastro de produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<Produto> list = new JList<Produto>(produtos);
		list.setBounds(26, 28, 391, 190);
		contentPane.add(list);
		
		JLabel lbl_mensagem = new JLabel("");
		lbl_mensagem.setBounds(127, 234, 434, 17);
		contentPane.add(lbl_mensagem);
		
		JButton btn_adicionarProduto = new JButton("Adicionar");
		btn_adicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = txt_nome.getText().trim();
					double preco = Double.parseDouble(txt_preco.getText().trim());
					String categoria = txt_categoria.getText();

					Produto novoProduto = new Produto(idProduto, nome, preco, categoria);
					produtos.addElement(novoProduto);
					idProduto++;
					
					lbl_mensagem.setText("Produto adicionado com sucesso!");
				} catch(NumberFormatException erro) {
					lbl_mensagem.setText("Insira informações válidas.");
				}
			}
		});
		btn_adicionarProduto.setBounds(447, 191, 114, 27);
		contentPane.add(btn_adicionarProduto);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(447, 64, 114, 21);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		txt_preco = new JTextField();
		txt_preco.setBounds(447, 113, 114, 21);
		contentPane.add(txt_preco);
		txt_preco.setColumns(10);
		
		txt_categoria = new JTextField();
		txt_categoria.setBounds(447, 158, 114, 21);
		contentPane.add(txt_categoria);
		txt_categoria.setColumns(10);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setBounds(447, 45, 60, 17);
		contentPane.add(lbl_nome);
		
		JLabel lbl_preco = new JLabel("Preço:");
		lbl_preco.setBounds(447, 97, 60, 17);
		contentPane.add(lbl_preco);
		
		JLabel lbl_categoria = new JLabel("Categoria:");
		lbl_categoria.setBounds(447, 143, 81, 17);
		contentPane.add(lbl_categoria);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewClientes.setVisible(true);
			}
		});
		btn_clientes.setBounds(12, 229, 106, 27);
		contentPane.add(btn_clientes);
		
		JLabel lbl_titulo = new JLabel("Lista de produtos:");
		lbl_titulo.setBounds(26, 12, 136, 17);
		contentPane.add(lbl_titulo);
	}
	
	protected double getPrecoProduto(int id) {
		return produtos.get(id).getPreco();
	}
}
