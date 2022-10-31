package Others;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual Digitado: " + novoCanal);
    }

    public void aumentarCanal(){
        canal++; 
        System.out.println("Canal Atual:" + canal);
    }

    public void diminuirCanal(){
        canal--;  
        System.out.println("Canal Atual:" + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }


    public void ligar(){
        ligada = true;
        System.out.println("SmartTv Ligada!");

    }

    public void desligar(){
        ligada = false;
        System.out.println("SmartTv Desligada!");
    }


}
