package edu.norberto.projeto_smart_tv;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar() {
        ligada = true;
        System.out.println("Usuário ligou a TV\n");
    }
    
    public void desligar() {
        ligada = false;
        System.out.println("Usuário desligou a TV\n");
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Usuário aumentou o volume para: " + volume);
        } else {
            System.out.println("ERRO: Tv desligada. Ligue a TV para aumentar o volume");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            System.out.println("Usuário diminuiu o volume para: " + volume);
        } else {
            System.out.println("ERRO: Tv desligada. Ligue a TV para diminuir o volume");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
            System.out.println("Usuário mudou o canal para: " + canal);
        } else {
            System.out.println("ERRO: Tv desligada. Ligue a TV para mudar de canal");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Usuário aumentou o canal para: " + canal);
        } else {
            System.out.println("ERRO: Tv desligada. Ligue a TV para aumentar o canal");
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            canal--;
            System.out.println("Usuário diminuiu o canal para: " + canal);
        } else {
            System.out.println("ERRO: Tv desligada. Ligue a Tv para diminuir o canal");
        }
    }

}
