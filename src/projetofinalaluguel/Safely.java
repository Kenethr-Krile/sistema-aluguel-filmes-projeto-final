
package projetofinalaluguel;

import java.util.Scanner;

//Classe auxiliar para tratamento de erros relacionados ao tipo de variavel digita pelo cliente em inputs.
public class Safely {
    
    //tratamento de inteiros.
    public static int getInt(Scanner read){
        while (true){
            try{
                return Integer.parseInt(read.nextLine().trim());
            }
            catch (NumberFormatException error){
                System.out.printf("Tipo de variavel informada incorreta, tente novamente!\n<:");
            }
        }
    }
    // Tratamento de Doubles
    public static double getDouble(Scanner read){
        while (true){
            try{
                return Double.parseDouble(read.nextLine().trim());
            }
            catch (NumberFormatException error){
                System.out.printf("Tipo de variavel informada incorreta, tente novamente!\n<:");
            }
        }
    }
    // Tratamento de Floats.
    public static float getFloat(Scanner read){
        while (true){
            try{
                return Float.parseFloat(read.nextLine().trim());
            }
            catch (NumberFormatException error){
                System.out.printf("Tipo de variavel informada incorreta, tente novamente!\n<:");
            }
        }
    }
    // Tratamento de texto.
    public static String getLine(Scanner read){
        while (true){
            String input = read.nextLine().trim();
            if ( !input.isEmpty() ){
                return input;
            }
            else{
                System.out.printf("Entrada de dados vazia, tente novamente!\n<:");
            }
        }
    }
}
