
package estudoemcasa01;

import Loja.Loja;
import Loja.Estoque;
import Loja.Funcionarios;
import java.util.Scanner;

/**
 *
 * @author henrique
 */
public class Estabelecimento {

   
    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner (System.in);
        Estoque product = new Estoque();
        Funcionarios funcionario = new Funcionarios();
        Loja loja = new Loja();
        
        int opcao;
        System.out.println("");
        System.out.println("Seja bem-vindo a nossa plataforma para gerir uma empresa");
        System.out.println("");
        System.out.println("Dentre as opções, qual operação você deseja fazer?");
        System.out.println("");
        System.out.println("1 - Criar uma empresa");
        System.out.println("2 - Cadastrar os funcionários");
        System.out.println("3 - Incrementar ou decrementar o estoque");
        opcao = sc.nextInt();
                
        switch(opcao){
            case 1:           
        System.out.println("Seja bem-vindo ao novo estabelecimento");
        loja.setVazio(sc.nextLine());
        System.out.println("Qual nome do estabelecimento?");
            loja.setNomeLoja(sc.nextLine());
        System.out.println("");
        
        System.out.println("Em qual CNPJ está registado a "+loja.getNomeLoja()+". O CNPJ possui 11 digitos");
            loja.setCnpj(sc.nextLine());
            
        System.out.println("");
       
        System.out.println("Ok, Nome e CNPJ cadastrados, agora insira o endereço fisico");
            loja.setEndereco(sc.nextLine());
        System.out.println("");
        
        System.out.println("Para finalizar o cadastro da empresa, quantos funcionários você pretende empregar?");
            loja.setQuantidadeDeFuncionario(sc.nextInt());
            
        System.out.println("");
        System.out.println("");
              
        System.out.println(loja.toString());
        
        break;
        
        case 2:
            
            System.out.println(""); 
            System.out.println("Olá, vamos cadastrar os funcionários.");
            funcionario.setVazio(sc.nextLine());
            System.out.println("Qual nome do 1º funcionário?");
            funcionario.setNome(sc.nextLine());
            System.out.println("Qual cargo deste funcionário?");
            funcionario.setCargo(sc.nextLine());
            System.out.println("Qual salário ele ganha?");
            funcionario.setSalario(sc.nextDouble());
            
            System.out.println(funcionario.toString());
            
        
        break;
        
        case 3: 
            product.setVazio(sc.nextLine());
            System.out.println("Qual nome do produtor?");
            product.setNomeProduto(sc.nextLine());
            System.out.println("Qual marca do produto?");
            product.setMarca(sc.nextLine());
            System.out.println("Qual valor unitário?");
            product.setValor(sc.nextDouble());
            System.out.println("Quantos existem no estoque?");
            product.setQuantidade(sc.nextInt());
        
            System.out.println(product.toString());
         
            default: System.out.println("Opição invalida, tente novamente");
        break;
        }
        
        int opcao2;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Gostaria de fazer mais alguma operação?");
        System.out.println("1 - SIM   |   2 -  NÃO");
        opcao2=sc.nextInt();
        if(opcao2 == 1){
            System.out.println("Qual das opções?");
        }else{
            System.out.println("Muito obrigado por utilizar nosso programa");
        }
        
        
        
        sc.close();
    }
    
}
