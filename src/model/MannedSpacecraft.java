package model;

import java.util.Scanner;

public class MannedSpacecraft extends Spacecraft implements IStartFlight {

    /**
     * Propositos: atributo de la clase NaveTripulada.
     */
    public static final String[] PURPOSES = {"Mision lunar",
            "Experimentación o estudio del comportamiento humano en condiciones ingrávidas o en el exterior de la cápsula",
            "Mantenimiento de satélites o probar acoplamientos con otras naves y equipos electrónicos"};

    public MannedSpacecraft(String name, double thrust, double dough, String fuel) {
        super(name, thrust, dough, fuel);
    }

    public MannedSpacecraft() {
    }

    public static void  createAMannedSpacecraft(){
        Scanner response = new Scanner(System.in);
        MannedSpacecraft mannedSpacecraft = new MannedSpacecraft();
        System.out.println("Ingresar name: ");
        mannedSpacecraft.setName(response.nextLine());
        System.out.println("Ingresar empuje [N]: ");
        mannedSpacecraft.setThrust(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar masa [Kg]: ");
        mannedSpacecraft.setDough(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar combustible: ");
        mannedSpacecraft.setFuel(response.nextLine());
        mannedSpacecraft.selectPropose();
        mannedSpacecraft.showImportantInformation();
        mannedSpacecraft.takeOff();
        mannedSpacecraft.landed();
    }

    public void selectPropose(){
        MannedSpacecraft spacecraft;
        boolean isSpacecraft = true;
        System.out.println("");
        System.out.println("=== Para crear una nave espacial de tipo MannedSpacecraft debe seleccionar el proposito ===");

        if (isSpacecraft){
            spacecraft = new MannedSpacecraft();
            for (int i = 0; i < 3; i++) {
                System.out.println(i+1 + ". " + PURPOSES[i]);
            }
        }
        int response = 0;
        do {
            System.out.print("-->");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                int purposeSelected = response;
                System.out.println("");
                System.out.println("-- NAVE ESPACIAL TRIPULADA --");
                showData();
                System.out.println("Proposito: " + PURPOSES[purposeSelected - 1]);
                break;
            } else
                break;

        } while (response != 0);

    }

    @Override
    public void showData() {
       super.showData();
    }

    @Override
    public void showImportantInformation() {
        System.out.print("Informacion importante: ");
        System.out.println("En este apartado cabe destacar los grandes centros de investigación espaciales en órbita " +
                "terrestre. El primero fue el Skylab estadounidense, actualmente destruido, pesaba 77 toneladas y orbitaba" +
                " a 435 km. El segundo de la historia, el Salyut soviético, también destruido, pesaba 19,8 toneladas y " +
                "orbitaba a una media de 248,9 km de distancia sobre la superficie terrestre.");
    }

    @Override
    public void setCrew(int crew) {
        if (crew <= 6) {
            showData();
            System.out.println("Tripulantes: " + crew);
            System.out.println("");
        } else {
            System.out.println("ERROR! Este tipo de nave esta diseñada con una capacidad maxima de 6 tripulantes");
        }
    }

    @Override
    public void takeOff() {
        System.out.println("La nave esta despegando");
    }

    @Override
    public void landed() {
        System.out.println("La nave esta aterrizando");
    }

}
