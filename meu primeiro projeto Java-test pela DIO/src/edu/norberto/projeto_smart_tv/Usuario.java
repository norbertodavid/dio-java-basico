package edu.norberto.projeto_smart_tv;

public class Usuario {
    
    public static void main(String[] args) throws Exception {

        //Instanciei a classe SmartTv
        SmartTv smartTv = new SmartTv();

        //Printei o status atual da TV
        System.out.println("");
        System.out.print("TV ligada? " + smartTv.ligada + "\n");
        System.out.print("Canal atual: " + smartTv.canal + "\n");
        System.out.print("Volume atual: " + smartTv.volume + "\n");

        System.out.println("\n >>> Após a interação ---------- v \n");

        //Chamei o método ligar
        smartTv.ligar();

        //Interações do Usuário
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume + "\n");

        smartTv.mudarCanal(33);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal + "\n");

        smartTv.desligar();

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume + "\n");
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal + "\n");

    }
}
