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
public class Estoque {
    
    private String nomeProduto;
    private String marca;
    private int quantidade;
    private double valor;
    private String vazio;
    
    public Estoque() {
    }

    public Estoque(String nomeProduto, String marca, int quantidade, double valor, String vazio) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
        this.vazio = vazio;
        
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVazio() {
        return vazio;
    }

    public void setVazio(String vazio) {
        this.vazio = vazio;
    }

    
    public double valorTotalProduto(){
    double valor=this.quantidade*this.valor; 
    return valor;
    }
    
    
    
    public String toString(){
    return "\nNome do produto: "+nomeProduto
            +"\nMarca do produto: "+marca
            +"\nValor unitário R$ "+valor
            +"\nQuantidade em estoque:" +quantidade
            +"\nValor total: "+valorTotalProduto()
            ;
    }
}
