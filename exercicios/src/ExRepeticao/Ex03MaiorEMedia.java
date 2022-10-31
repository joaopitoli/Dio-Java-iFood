package ExRepeticao;

import java.util.Scanner;

public class Ex03MaiorEMedia {
    public static void main(String[] args) {
        /*DO-WHILE
        Maior e Média: Faça um programa que leia 5 números e informe o maior número 
        e a média desses números. */

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int numero = 0;
        int maiorNumero = 0;

        do{
            System.out.print("Numero: ");
            numero = sc.nextInt();

            if(numero > maiorNumero)
            maiorNumero = numero;
            
            n++;
        }while(n < 5);

        System.out.println("O maior numero é o: " + maiorNumero);


    }
}
