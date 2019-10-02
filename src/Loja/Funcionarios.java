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
    
    public Funcionarios() {
    }

    public Funcionarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
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
    
    public String toString(){
    return " Nome do Funcionário: " + nome
          +"\n Cargo do funcionário: "+cargo
            +"Salário R$ " +salario;
    }
    
}
