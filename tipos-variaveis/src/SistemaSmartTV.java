public class SistemaSmartTV {

    static boolean ligada = false;
    static int canal = 1;
    static int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void avancarCanal(){
        canal ++;
    }

    public void voltarCanal(){
        canal --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        // volume = volume + 1;
        volume ++;
    }

    public void diminuirVolume(){
        // volume = volume - 1;
        volume --;
    }

}
