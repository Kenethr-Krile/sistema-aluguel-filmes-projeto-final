
package projetofinalaluguel;

import java.util.Scanner;

public class Safely {

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
