
package projetofinalaluguel;

import java.util.Scanner;


public class Filmes {
    String titulo;
    int anoLancamento;
    int classificacaoIdade;
    int duracao;
    String genero;
    double preco;
    double nota;
    
        void exibirFicha(){
            
            System.out.printf("\n/--------------- FICHA TECNICA ---------------\\ \n\n");
            
            System.out.printf("Titulo: %s\n", titulo);
            System.out.printf("Ano: %d \n", anoLancamento);
            System.out.printf("Faixa Etaria: %d\n",classificacaoIdade);
            System.out.printf("Tempo de duracao: %d minutos\n", duracao);
            System.out.printf("Genero: %s\n", genero);
            System.out.printf("Nota: %.1f\n", nota);
            System.out.printf("Preco do Aluguel: R$%.2f\n",preco);
        }
        void cadastrarFicha(){
            Scanner read = new Scanner(System.in);
            
            System.out.printf("Informe o titulo do filme:");
            titulo = Safely.getLine(read);
            System.out.printf("Informe o ano de lancamento:");
            anoLancamento = Safely.getInt(read);
            System.out.printf("Informe a classificacao de idade do filme:");
            classificacaoIdade = Safely.getInt(read);
            System.out.printf("Informe a duracao do filme em minutos:");
            duracao = Safely.getInt(read);
            System.out.printf("Informe o genero do filme:");
            genero = Safely.getLine(read);
            System.out.printf("Informe a nota do filme:");
            nota = Safely.getDouble(read);
            System.out.printf("Informe o valor do aluguel:");
            preco = Safely.getDouble(read);
        }
    
    
}
