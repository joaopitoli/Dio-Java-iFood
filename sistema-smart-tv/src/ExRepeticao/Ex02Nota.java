package ExRepeticao;

import java.util.Scanner;

public class Ex02Nota {
    public static void main(String[] args) {

        /*
        WHILE
        Nota: Faça um programa que peça uma nota, entre zero e dez. 
        
        Mostre uma mensagem caso o valor seja inválido e continue pedindo 
        até que o usuário informe um valor válido. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        int nota = sc.nextInt();

        while(nota > 0 && nota < 11){
            System.out.print("Nota: ");
            nota = sc.nextInt();

        }
        
    }
}
