package Ex1;

public class Lasanha {
    private int tempoDeFornoPreparo = 40 ;
    private int tempoDeForno;
    private int tempoRestanteForno;
    private int numCamadas;
    private int tempoMontagem;
    private int tempoTotal;


    public Lasanha() {
        this.tempoDeForno = tempoDeForno;
        this.tempoRestanteForno = tempoRestanteForno;
        this.numCamadas = numCamadas;
        this.tempoMontagem = tempoMontagem;
        this.tempoTotal = tempoTotal;
    }

    public int getTempoDeFornoPreparo(){

        return tempoDeFornoPreparo;
    }

    public int setTempoRestanteForno(int tempoDeForno){
        tempoRestanteForno = tempoDeFornoPreparo - tempoDeForno;
        return tempoRestanteForno;
    }

    public int setNumCamadas(int numCamadas){
        tempoMontagem = numCamadas*2;
        return  tempoMontagem;
    }

    public int getTempoTotal(int numCamadas, int tempoDeForno){
        tempoTotal = 2*numCamadas+tempoDeForno;
        return  tempoTotal;
    }


}
