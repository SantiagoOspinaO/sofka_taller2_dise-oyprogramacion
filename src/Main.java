import model.MannedSpacecraft;
import model.ShuttleSpacecraft;
import model.UnmannedSpacecraft;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int response = 0;
        do {
            System.out.println("== BIENVENIDO ==");
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Crear un Vehiculo Lanzadera");
            System.out.println("2. Crear una Nave Espacial No Tripulada");
            System.out.println("3. Crear una Nave Espacial Tripulada");
            System.out.println("0. Salir");
            System.out.print("--> ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    ShuttleSpacecraft.createAShuttleSpacecraft();
                    break;
                case 2:
                    UnmannedSpacecraft.createAUnmannedSpacecraft();
                    break;
                case 3:
                    MannedSpacecraft.createAMannedSpacecraft();
                    break;
                case 0:
                    break;
            }

        } while (response != 0);
        
    }
}
