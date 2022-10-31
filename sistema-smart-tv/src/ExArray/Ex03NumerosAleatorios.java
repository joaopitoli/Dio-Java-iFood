package ExArray;

import java.util.Scanner;
import java.util.Random;

public class Ex03NumerosAleatorios {
    public static void main(String[] args) {
        /*
         Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios 
         (entre 0 e 100) armazene-os num vetor. 
         Ao final, mostre os números e seus sucessores.
         */
         Random gerador = new Random();
         Scanner sc = new Scanner(System.in);

         int vetor[] = new int[20];

         for(int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100);
         }

         System.out.println("======");

         for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[(i)] + " ");
            int j = vetor[i];
            j = j + 1;
            vetor[i] = j;
            System.out.println(vetor[(i)]);
         }

         sc.close();
        
    }
    
}
