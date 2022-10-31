package ExRepeticao;

import java.util.Scanner;

public class Ex06Fatorial {
    public static void main(String[] args) {
        /*Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int n = sc.nextInt();
        int res = 1;
        
        for(int i = n; i >= 1; i--){

           res = res * i;
              
        }
        System.out.println(res);
        
        
        sc.close();
    }

    
    
}
