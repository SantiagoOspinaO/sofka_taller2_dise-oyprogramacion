package model;

/**
 * Se crea la clase abstracta Spacecraft.
 */
public abstract class Spacecraft {

    /**
     * Nombre: atributo de la clase NaveEspacial.
     */
    private String name;
    /**
     * Empuje: atributo de la clase NaveEspacial.
     */
    private double thrust;
    /**
     * Masa: atributo de la clase NaveEspacial.
     */
    private double dough;
    /**
     * Combustible: atributo de la clase NaveEspacial.
     */
    private String fuel;

    /**
     * Instancia de una nueva Spacecraft.
     *
     * @param name   the name
     * @param thrust the thrust
     * @param dough  the dough
     * @param fuel   the fuel
     */
    public Spacecraft(String name, double thrust, double dough, String fuel) {
        this.name = name;
        this.thrust = thrust;
        this.dough = dough;
        this.fuel = fuel;
    }

    /**
     * Constructor por defecto de Spacecraft.
     */
    public Spacecraft() {}


    /**
     * Se crea el metodo showData.
     */
    public void showData() {
        System.out.println("Name: " + name + ", thrust: " + thrust + " N, dough: " + dough + " Kg, fuel: " + fuel);
    }

    /**
     * Se crea el metodo showImportantInformation.
     */
    public abstract void showImportantInformation();

    /**
     * Se crea el metodo Set crew.
     * @param crew the crew
     */
    public abstract void setCrew(int crew);

    /**
     * Se crea el metodo Get del atributo name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Se crea el metodo Set del atributo name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Se crea el metodo Get del atributo thrust.
     * @return the thrust
     */
    public double getThrust() {
        return thrust;
    }

    /**
     * Se crea el metodo Set del atributo thrust.
     * @param thrust the thrust
     */
    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    /**
     * Se crea el metodo Get del atributo dough.
     * @return the dough
     */
    public double getDough() {
        return dough;
    }

    /**
     * Se crea el metodo Set del atributo dough.
     * @param dough the dough
     */
    public void setDough(double dough) {
        this.dough = dough;
    }

    /**
     * Se crea el metodo Get del atributo fuel.
     * @return the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Se crea el metodo Set del atributo fuel.
     * @param fuel the fuel
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
