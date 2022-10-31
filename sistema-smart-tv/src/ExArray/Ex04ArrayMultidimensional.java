package ExArray;

import java.util.Random;

public class Ex04ArrayMultidimensional {
    /*
     Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
     Após isso determine o menor número da matriz e a sua posição(linha, coluna).
     */

    public static void main(String[] args) {
        
        Random gerador = new Random();
     
        int[][] matriz = new int[4][4];
   
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = gerador.nextInt(9);
            }
        }

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
                
            }
            System.out.println();
            
        }

        
    }
    

    
}
