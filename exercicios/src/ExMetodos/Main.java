package ExMetodos;

public class Main {
   public static void main(String[] args) {
    
        //Calculadora
        System.out.println("Exercicio Calculadora: ");
        Ex01Calculadora.adicao(3,6);
        Ex01Calculadora.subtracao(3,6);
        Ex01Calculadora.multiplicacao(3,6);
        Ex01Calculadora.divisao(3,6);

        System.out.println("======================");

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Ex02Mensagem.obterMensagem(5);
        Ex02Mensagem.obterMensagem(14);
        Ex02Mensagem.obterMensagem(0);
        Ex02Mensagem.obterMensagem(35);

        System.out.println("======================");

        //Emprestimo
        System.out.println("Exercicio Emprestimo: ");
        Ex03Emprestimo.calcular(1000, 2);
        Ex03Emprestimo.calcular(1000, Ex03Emprestimo.getDuasParcelas());
        Ex03Emprestimo.calcular(1000, 3);
        Ex03Emprestimo.calcular(1000, Ex03Emprestimo.getTresParcelas());
        Ex03Emprestimo.calcular(1000, 4);
        
   } 
}
