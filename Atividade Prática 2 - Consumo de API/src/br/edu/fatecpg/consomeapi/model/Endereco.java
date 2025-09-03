package br.edu.fatecpg.consomeapi.model;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    private String cep;
    @SerializedName("logradouro")
    private String rua;
    private String bairro;
    private String localidade;
    private String estado;

    public Endereco(String cep, String rua, String bairro, String local, String estado){
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.localidade = local;
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereço > CEP: " + cep + " | Rua: " + rua + " | Bairro: " + bairro + " | Localidade: " + localidade + " | Estado: " + estado + "\n";
    }
}
