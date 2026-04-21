public class PrototipoLM extends CocheDeCarreras{

    private boolean sistemaHibrido;

    public PrototipoLM(boolean sistemaHibrido, String marca, String modelo, int velocidadMaxima){

        super();

        this.sistemaHibrido = sistemaHibrido;

    }

    @Override
    public void competir() {

        if(sistemaHibrido){

            System.out.println("Sistema hibrido");

        } else {

            System.out.println("Sistema de combustión");

        }

    }
}
