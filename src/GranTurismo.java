public class GranTurismo extends CocheDeCarreras{

    private int pesoExtraLastre;

    public GranTurismo(int pesoExtraLastre, String marca, String modelo, int velociadaMaxima) {

        super();

        this.pesoExtraLastre = pesoExtraLastre;

    }

    @Override
    public void competir() {

        if(this.pesoExtraLastre >= 100){

            System.out.println("Le cuesta gestionar la conduccion");

        }

        if(this.pesoExtraLastre < 100){

            System.out.println("No le cuesta gestionar la conduccion");

        }

    }

}
