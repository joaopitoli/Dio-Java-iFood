package Others;
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.mudarCanal(16);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(9);
        smartTv.aumentarVolume();
        smartTv.desligar();


        


    }
}
