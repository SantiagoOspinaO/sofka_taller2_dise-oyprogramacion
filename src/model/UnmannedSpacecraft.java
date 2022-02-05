package model;

import java.util.Scanner;

public class UnmannedSpacecraft extends Spacecraft implements IStartFlight {

    /**
     * Lugar de destino: atributo de la clase NaveNoTripulada.
     */
    private String placeOfDestination;

    public UnmannedSpacecraft(String name, double thrust, double dough, String fuel, String placeOfDestination) {
        super(name, thrust, dough, fuel);
        this.placeOfDestination = placeOfDestination;
        System.out.println("");
        System.out.println("-- NAVE ESPACIAL NO TRIPULADA --");
    }

    public UnmannedSpacecraft() {}

    public static void createAUnmannedSpacecraft(){
        Scanner response = new Scanner(System.in);
        UnmannedSpacecraft unmannedSpacecraft = new UnmannedSpacecraft();
        System.out.println("Ingresar name: ");
        unmannedSpacecraft.setName(response.nextLine());
        System.out.println("Ingresar empuje [N]: ");
        unmannedSpacecraft.setThrust(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar masa [Kg]: ");
        unmannedSpacecraft.setDough(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar combustible: ");
        unmannedSpacecraft.setFuel(response.nextLine());
        System.out.println("Ingresar lugar de destino: ");
        unmannedSpacecraft.setPlaceOfDestination(response.nextLine());
        unmannedSpacecraft.setCrew();
        unmannedSpacecraft.showData();
        unmannedSpacecraft.showImportantInformation();
        unmannedSpacecraft.takeOff();
        unmannedSpacecraft.landed();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Lugar de destino: " + placeOfDestination);
    }

    @Override
    public void showImportantInformation() {
        System.out.print("Informacion importante: ");
        System.out.println("De esta categoría, el más importante, y activo actualmente, es el vehículo de transferencia" +
                " automatizada (ATV) que sirve para abastecer, limpiar y regular periódicamente la elevación de la EEI." +
                " Esta nave robótica cuenta con cuatro motores de combustión de monometilhidracina (MMH) y óxido nítrico, " +
                "que le dan un empuje de 0,2 toneladas.");
    }

    @Override
    public void setCrew(int crew) {
        System.out.println();
    }

    public void setCrew(){
        System.out.println("Este tipo de nave no tiene tripulantes");
    }

    @Override
    public void takeOff() {
        System.out.println("La nave esta despegando");
    }

    @Override
    public void landed() {
        System.out.println("Las naves no tripuladas utilizan sus propios propulsores para mantenerse en orbita o direccionarse hasta un cuerpo celeste ");
    }

    public String getPlaceOfDestination() {
        return placeOfDestination;
    }

    public void setPlaceOfDestination(String placeOfDestination) {
        this.placeOfDestination = placeOfDestination;
    }
}
