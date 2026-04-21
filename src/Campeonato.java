import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {

        ArrayList<CocheDeCarreras> cocheDeCarreras = new ArrayList<>();

        PrototipoLM prototipoLM1 = new PrototipoLM(false,"Mercedez","AMG GT XX Concept",360);
        PrototipoLM prototipoLM2 = new PrototipoLM(true,"Ferrari","Sucesor",350);

        GranTurismo granTurismo1 = new GranTurismo(20,"","",00);
        GranTurismo granTurismo2 = new GranTurismo(50,"","",00);

        cocheDeCarreras.add(prototipoLM1);
        cocheDeCarreras.add(prototipoLM2);

        cocheDeCarreras.add(granTurismo1);
        cocheDeCarreras.add(granTurismo2);

        for (CocheDeCarreras coche : cocheDeCarreras){

            coche.mostrarDatos();

            System.out.println();

            coche.mostrarDatos();

            System.out.println();

        }


    }

}
