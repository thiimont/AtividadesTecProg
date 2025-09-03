package br.edu.fatecpg.loja.model;

public class Cliente extends Pessoa {
    private int codigo;
    private double credito;
    private Endereco endereco;

    public Cliente(String nome, int idade, int codigo, double credito, Endereco endereco){
        super(nome, idade);
        this.codigo = codigo;
        this.credito = credito;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Idade: " + this.getIdade() +
                ", Código: " + this.codigo +
                ", Crédito: " + this.credito +
                ", Endereço: " + this.endereco;
    }
}
