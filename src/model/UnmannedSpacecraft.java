package model;

import java.util.Scanner;

/**
 * Se crea la clase unmanned spacecraft que extiende de Spacecraft e implementa IStartFlight.
 */
public class UnmannedSpacecraft extends Spacecraft implements IStartFlight {

    /**
     * Lugar de destino: atributo de la clase NaveNoTripulada.
     */
    private String placeOfDestination;

    /**
     * Instancia de una nueva Unmanned spacecraft.
     *
     * @param name               the name
     * @param thrust             the thrust
     * @param dough              the dough
     * @param fuel               the fuel
     * @param placeOfDestination the place of destination
     */
    public UnmannedSpacecraft(String name, double thrust, double dough, String fuel, String placeOfDestination) {
        super(name, thrust, dough, fuel);
        this.placeOfDestination = placeOfDestination;
        System.out.println("");
        System.out.println("-- NAVE ESPACIAL NO TRIPULADA --");
    }

    /**
     * Constructor por defecto de Unmanned spacecraft.
     */
    public UnmannedSpacecraft() {}

    /**
     * Se crea el metodo create a unmanned spacecraft.
     */
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

    /**
     * Se sobre escribe el metodo showData de la clase padre Spacecraft.
     */
    @Override
    public void showData() {
        super.showData();
        System.out.println("Lugar de destino: " + placeOfDestination);
    }

    /**
     * Se sobre escribe el metodo abstracto showImportantInformation de la clase padre Spacecraft.
     */
    @Override
    public void showImportantInformation() {
        System.out.print("Informacion importante: ");
        System.out.println("De esta categoría, el más importante, y activo actualmente, es el vehículo de transferencia" +
                " automatizada (ATV) que sirve para abastecer, limpiar y regular periódicamente la elevación de la EEI." +
                " Esta nave robótica cuenta con cuatro motores de combustión de monometilhidracina (MMH) y óxido nítrico, " +
                "que le dan un empuje de 0,2 toneladas.");
    }

    /**
     * Se sobre escribe el metodo abstracto setCrew de la clase padre Spacecraft.
     * @param crew the crew
     */
    @Override
    public void setCrew(int crew) {
        System.out.println();
    }

    /**
     * Se sobre carga el metodo Set crew.
     */
    public void setCrew(){
        System.out.println("Este tipo de nave no tiene tripulantes");
    }

    /**
     * Se implementa el metodo takeOff de la interface IStartFlight.
     */
    @Override
    public void takeOff() {
        System.out.println("La nave esta despegando");
    }

    /**
     * Se implementa el metodo landed de la interface IStartFlight.
     */
    @Override
    public void landed() {
        System.out.println("Las naves no tripuladas utilizan sus propios propulsores para mantenerse en orbita o direccionarse hasta un cuerpo celeste ");
    }

    /**
     * Se crea el metodo Get del atributo place of destination.
     * @return the place of destination
     */
    public String getPlaceOfDestination() {
        return placeOfDestination;
    }

    /**
     * Se crea el metodo Set del atributo place of destination.
     * @param placeOfDestination the place of destination
     */
    public void setPlaceOfDestination(String placeOfDestination) {
        this.placeOfDestination = placeOfDestination;
    }
}
