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
public class Funcionarios {
    private String nome;
    private String cargo;
    private double salario;
    private String vazio;
    
    public Funcionarios() {
    }

    public Funcionarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getVazio() {
        return vazio;
    }

    public void setVazio(String vazio) {
        this.vazio = vazio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String toString(){
    return "\n Nome do Funcionário: " + nome
          +"\n Cargo do funcionário: "+cargo
          +"\n Salário bruto R$ " +salario
          +"\n O salario liquido é, R$ "+salarioLiquido();
    }
    
    public double salarioLiquido(){
    double salarioLiquido=this.salario-5.0;
    return salarioLiquido;
    }
    
}
