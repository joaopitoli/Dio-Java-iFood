package ExRepeticao;

import java.util.Scanner;

public class Ex04PareImpar {
    public static void main(String[] args) {
        /*
        DO-WHILE
        Par e Ímpar: Faça um programa que peça N números inteiros. 
        Calcule e mostre a quantidade de números pares e a quantidade de números impares.
         */

         Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de Numeros: ");
        int n = sc.nextInt();
        int m = 0;
        int impar = 0;
        int par = 0;

        do{
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if(numero % 2 != 0){
                impar++;
            }else{
                par++;
            }


            m++;
        }while(m < n);

        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);

         
    }
}
