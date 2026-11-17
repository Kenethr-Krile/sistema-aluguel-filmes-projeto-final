
package projetofinalaluguel;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {
    
    ArrayList<Filmes> aluguel = new ArrayList<>();
    
    String codigo;
    String nome;
    String endereco;
    String cpf;
    int idade;
    
    void exibirCliente(){

        System.out.printf("\n/--------------- FICHA DO CLIENTE ---------------\\ \n\n");

        System.out.printf("Codigo do Cliente: %s\n", codigo);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("CPF: %s \n", cpf);
        System.out.printf("Idade: %d\n",idade);
        System.out.printf("Endereco: %s\n", endereco);
        
    }
    
    void cadastrarCliente(){
        Scanner read = new Scanner(System.in);

        System.out.printf("Informe o codigo do cliente:");
        codigo = Safely.getLine(read);
        System.out.printf("Informe o nome do cliente:");
        nome = Safely.getLine(read);
        System.out.printf("Informe o CPF do cliente:");
        cpf = Safely.getLine(read);
        System.out.printf("Informe a idade do cliente:");
        idade = Safely.getInt(read);
        System.out.printf("Informe o endereco do cliente:");
        endereco = Safely.getLine(read);
    }
      
}
