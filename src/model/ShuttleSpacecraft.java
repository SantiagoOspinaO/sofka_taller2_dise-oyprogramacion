package model;

import java.util.Scanner;

/**
 * Se crea la clase shuttle spacecraft que extiende de Spacecraft e implementa IStartFlight.
 */
public class ShuttleSpacecraft extends Spacecraft implements IStartFlight {

    /**
     * Carga útil a lanzar: atributo de la clase NaveLanzadora.
     */
    private String payloadToLaunch;

    /**
     * Instancia de una nueva Shuttle spacecraft.
     *
     * @param name            the name
     * @param thrust          the thrust
     * @param dough           the dough
     * @param fuel            the fuel
     * @param payloadToLaunch the payload to launch
     */
    public ShuttleSpacecraft(String name, double thrust, double dough, String fuel, String payloadToLaunch) {
        super(name, thrust, dough, fuel);
        this.payloadToLaunch = payloadToLaunch;
        System.out.println("");
        System.out.println("-- NAVE ESPACIAL LANZADERA --");
    }

    /**
     * Constructor por defecto de Shuttle spacecraft.
     */
    public ShuttleSpacecraft() {}

    /**
     * Se crea el metodo create a shuttle spacecraft.
     */
    public static void createAShuttleSpacecraft(){

        Scanner response = new Scanner(System.in);
        ShuttleSpacecraft shuttleSpacecraft = new ShuttleSpacecraft();
        System.out.println("Ingresar name: ");
        shuttleSpacecraft.setName(response.nextLine());
        System.out.println("Ingresar empuje [N]: ");
        shuttleSpacecraft.setThrust(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar masa [Kg]: ");
        shuttleSpacecraft.setDough(Double.parseDouble(response.nextLine()));
        System.out.println("Ingresar combustible: ");
        shuttleSpacecraft.setFuel(response.nextLine());
        System.out.println("Ingresar carga útil a lanzar: ");
        shuttleSpacecraft.setPayloadToLaunch(response.nextLine());
        System.out.println("Ingrese la cantidad de tripulantes: ");
        shuttleSpacecraft.setCrew(response.nextInt());
        shuttleSpacecraft.showImportantInformation();
        shuttleSpacecraft.takeOff();
        shuttleSpacecraft.landed();
    }

    /**
     * Se sobre escribe el metodo showData de la clase padre Spacecraft.
     */
    @Override
    public void showData() {
        super.showData();
        System.out.println("Carga útil a lanzar: " + payloadToLaunch);
    }

    /**
     * Se sobre escribe el metodo abstracto showImportantInformation de la clase padre Spacecraft.
     */
    @Override
    public void showImportantInformation() {
        System.out.print("Informacion importante: ");
        System.out.println("El más potente jamás construido pertenecía a los EE.UU. y su nombre era Saturno V. " +
                "Este gigante, de 3500 toneladas de empuje y 2900 toneladas de peso, era capaz de transportar 118 toneladas" +
                " en órbita baja terrestre, pero fue retirado en 1973. Con más de 100 metros de altura y una potencia de" +
                " 32000×5 caballos, permitió transportar la nave tripulada Apolo hasta la Luna.");
    }

    /**
     * Se sobre escribe el metodo abstracto setCrew de la clase padre Spacecraft.
     * @param crew the crew
     */
    @Override
    public void setCrew(int crew) {
        if (crew <= 4) {
            showData();
            System.out.println("Tripulantes: " + crew);
        } else {
            System.out.println("ERROR! Este tipo de nave esta diseñada con una capacidad maxima de 4 tripulantes");
        }
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
        System.out.println("La nave esta aterrizando");
    }

    /**
     * Metodo Get del atributo payload to launch.
     * @return the payload to launch
     */
    public String getPayloadToLaunch() {
        return payloadToLaunch;
    }

    /**
     * Metodo Set del atributo payload to launch.
     * @param payloadToLaunch the payload to launch
     */
    public void setPayloadToLaunch(String payloadToLaunch) {
        this.payloadToLaunch = payloadToLaunch;
    }

}
