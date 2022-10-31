package ExArray;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Ex02Consoantes {
    public static void main(String[] args) {
        /*
         Consoantes: Faça um Programa que leia um vetor de 6 caracteres, 
         e diga quantas consoantes foram lidas. Imprima as consoantes.
         */

         Scanner sc = new Scanner(System.in);
         
         
         String[] consoantes = new String[6];
         int quantidadeConsoantes = 0;
         int count = 0;

         do{
            System.out.println("Letra: ");
            String letra = sc.next();

            if( !(letra.equalsIgnoreCase("a") |
                 letra.equalsIgnoreCase("e") |
                 letra.equalsIgnoreCase("i") |
                 letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u")))
               {
                consoantes[count] = letra;
                quantidadeConsoantes++;
               }

               count++;


         }while(count < consoantes.length);

         System.out.println("Consoantes: ");
         for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
         }
         System.out.println("");
         System.out.println("Qtd de Consoantes: " + quantidadeConsoantes);

         sc.close();   
    }
}

