package ExReturns;

public class Ex01CalcAreaReturn {

    //Quadrado
    public static double area(double lado){
        return lado * lado;

    }
    //Retangulo
    public static double area(double base, double altura){
        return base * altura;

    }

    //Trapezio
    public static double area(double base1, double base2, double altura){
        return ((base1 + base2) * altura) / 2;
    }
    
}
