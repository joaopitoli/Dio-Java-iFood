package ExArray;

import java.util.Scanner;
import java.lang.*;

public class Ex01OrdemInversa {
    public static void main(String[] args) {
        
        /* Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e 
        mostre-os na ordem inversa. */
        

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int vetor[] = new int[n];
        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }

        

        


        sc.close();


        
    }
    
}
