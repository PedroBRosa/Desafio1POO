package Ex1;

public class Main {
    public static void main(String[] args) {
        Lasanha lasanha = new Lasanha();
        System.out.println(lasanha.getTempoDeFornoPreparo());
        System.out.println(lasanha.setTempoRestanteForno(30));
        System.out.println(lasanha.setNumCamadas(3));
        System.out.println(lasanha.getTempoTotal(3,30));

    }
}
