package ExPOO;

public class RodarAplicacao {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Vinho");
        carro1.setModelo("Corsa Wind");
        carro1.setCapacidadeTanque(46);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.80));

        System.out.println("==================");

        Carro carro2 = new Carro("Azul", "Gol Gl", 46);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.80));


    }
    
}
