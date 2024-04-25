public class Usuario {

    public static void main(String[] args) throws Exception {

        SistemaSmartTV sistemaSmartTv = new SistemaSmartTV();

        System.out.println("A TV está ligada? " + SistemaSmartTV.ligada);
        System.out.println("Em qual canal a TV está? " + SistemaSmartTV.canal);
        System.out.println("Qual o volume da TV? " + SistemaSmartTV.volume);

        sistemaSmartTv.ligar();

        System.out.println("UPDATE 1 : A TV está ligada? " + SistemaSmartTV.ligada);

        sistemaSmartTv.desligar();

        System.out.println("UPDATE 2 : A TV está ligada? " + SistemaSmartTV.ligada);

        sistemaSmartTv.diminuirVolume();

        System.out.println("UPDATE 3 : Qual o volume da TV? " + SistemaSmartTV.volume);

        sistemaSmartTv.diminuirVolume();
        sistemaSmartTv.diminuirVolume();

        System.out.println("UPDATE 4 : Qual o volume da TV? " + SistemaSmartTV.volume);

        sistemaSmartTv.aumentarVolume();

        System.out.println("UPDATE 5 : Qual o volume da TV? " + SistemaSmartTV.volume);

        sistemaSmartTv.avancarCanal();

        System.out.println("UPDATE 6 : Em qual canal a TV está? " + SistemaSmartTV.canal);

        sistemaSmartTv.voltarCanal();
        sistemaSmartTv.avancarCanal();
        sistemaSmartTv.avancarCanal();
        sistemaSmartTv.avancarCanal();

        System.out.println("UPDATE 7 : Em qual canal a TV está? " + SistemaSmartTV.canal);

        sistemaSmartTv.mudarCanal(23);

        System.out.println("UPDATE 8 : Em qual canal a TV está? " + SistemaSmartTV.canal);
    }

}
