package ExSobrecarga;

public class Ex01CalculaArea {

    //Quadrado
    public static void area(double lado){
        System.out.println("Area do quadrado: " + lado * lado);
    }

    //Retangulo
    public static void area(double base, double altura){
        System.out.println("Area do retangulo: " + base * altura);
    }

    //Trapezio
    public static void area(double base1, double base2, double altura){
        System.out.println("Area do trapezio: " + ((base1 + base2) * altura) / 2);

    }


    
}
