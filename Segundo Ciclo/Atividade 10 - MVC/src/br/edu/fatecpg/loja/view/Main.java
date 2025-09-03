package br.edu.fatecpg.loja.view;

import java.util.List;
import java.util.ArrayList;

import br.edu.fatecpg.loja.model.Cliente;
import br.edu.fatecpg.loja.model.Endereco;
import br.edu.fatecpg.loja.controller.ClienteController;
import br.edu.fatecpg.loja.controller.EnderecoController;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();

        ClienteController clienteController = new ClienteController(clientes);
        EnderecoController enderecoController = new EnderecoController(enderecos);

        Endereco endereco = new Endereco("00000-000", "Rua ABC", "123", "Um lugar");
        Cliente cliente = new Cliente("Thiago", 19, 200, 15000, endereco);

        clienteController.adicionarCliente(cliente);
        enderecoController.adicionarEndereco(endereco);

//        Retorna o cliente e o endereço pelo índice
//        System.out.println(clienteController.retornarCliente(0));
//        System.out.println(enderecoController.retornarEndereco(0));

        clienteController.exibirListaClientes();
        enderecoController.exibirListaEnderecos();
    }
}