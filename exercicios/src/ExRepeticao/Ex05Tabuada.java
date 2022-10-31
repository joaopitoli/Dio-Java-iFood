package ExRepeticao;

import java.util.Scanner;

public class Ex05Tabuada {
    public static void main(String[] args) {
        /*
         * FOR
         * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
         * qualquer número inteiro
         * entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
         * tabuada.
         * 
         * A saída deve ser conforme o exemplo abaixo:
         * 
         * Tabuada de 5:
         * 5 X 1 = 5
         * 5 X 2 = 10
         * ...
         * 5 X 10 = 50
         */

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite um numero de 1 a 10: ");
         int n = sc.nextInt();

         for(int i = 1; i < 11; i++){
            System.out.println(n + " X " + i + " = " + n * (i+1));
         }


    }

}
