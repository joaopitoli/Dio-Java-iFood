package ExRepeticao;
import java.util.Scanner;

public class Ex01NomeIdade {
    public static void main(String[] args) {

    /*
    WHILE
    Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
    o primeiro representando o nome do aluno e o segundo representando a sua idade. 
    
    (Pare o programa inserindo o valor 0 no campo nome)
    */

    Scanner sc = new Scanner(System.in);

   
    while(true){
    System.out.print("Nome: ");
    String nome = sc.next();

    if(nome.equals("0")) break;

    System.out.print("Idade: ");
    int idade = sc.nextInt();

    

    }
    

  
    

    

    

    }

}