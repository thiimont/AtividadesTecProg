package br.edu.fatecpg.loja.controller;

import java.util.List;

import br.edu.fatecpg.loja.model.Cliente;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController(List<Cliente> clientes){
        this.clientes = clientes;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public String retornarCliente(int index){
        return clientes.get(index).toString();
    }

    public void exibirListaClientes(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------- Lista de clientes ----------\n");
        for(int i=0; i < clientes.size(); i++){
            sb.append("Índice: ").append(i).append(" | ").append(clientes.get(i).toString());
            sb.append("\n");
        }
        sb.append("---------------------------------------\n");
        System.out.println(sb);
    }
}
