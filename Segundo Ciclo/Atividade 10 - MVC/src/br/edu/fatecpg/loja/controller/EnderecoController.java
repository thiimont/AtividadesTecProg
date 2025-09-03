package br.edu.fatecpg.loja.controller;

import java.util.List;

import br.edu.fatecpg.loja.model.Endereco;

public class EnderecoController {
    private List<Endereco> enderecos;

    public EnderecoController(List<Endereco> enderecos){
        this.enderecos = enderecos;
    }

    public void adicionarEndereco(Endereco endereco){
        enderecos.add(endereco);
    }

    public String retornarEndereco(int index){
        return enderecos.get(index).toString();
    }

    public void exibirListaEnderecos(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------- Lista de endereços ----------\n");
        for(int i=0; i < enderecos.size(); i++){
            sb.append("Índice: ").append(i).append(" | ").append(enderecos.get(i).toString());
            sb.append("\n");
        }
        sb.append("----------------------------------------\n");
        System.out.println(sb);
    }
}
