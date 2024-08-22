public class SmarTV {
    boolean ligada;
    int canal;
    int volume;

    public void ligar(){
        ligada = true;
        System.out.println("Ligar TV!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Desligar TV!");
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public int mudarCanal(int novoCanal){
        return canal = novoCanal;
    }
}
