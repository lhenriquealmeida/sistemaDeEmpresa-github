/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

/**
 *
 * @author henrique
 */
public class Loja {
    private String nomeLoja;
    private int quantidadeDeFuncionario;
    private String cnpj;
    private String endereco;
    private String vazio;
    
    public Loja() {
    }

    public Loja(String nomeLoja, int quantidadeDeFuncionario, String cnpj, String endereco, String vazio) {
        this.nomeLoja = nomeLoja;
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.vazio=vazio;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public int getQuantidadeDeFuncionario() {
        return quantidadeDeFuncionario;
    }

    public void setQuantidadeDeFuncionario(int quantidadeDeFuncionario) {
        this.quantidadeDeFuncionario = quantidadeDeFuncionario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getVazio() {
        return vazio;
    }

    public void setVazio(String vazio) {
        this.vazio = vazio;
    }
    
    public String toString(){
    return "\nNome: " +nomeLoja
           +"\n CNPJ: " +cnpj
           +"\n Endereço físico: " +endereco
           +"\n Quantidade de funcinários: "+quantidadeDeFuncionario;
    }
    
}
