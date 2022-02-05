package model;

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

    public Spacecraft(String name, double thrust, double dough, String fuel) {
        this.name = name;
        this.thrust = thrust;
        this.dough = dough;
        this.fuel = fuel;
    }

    public Spacecraft() {}


    public void showData() {
        System.out.println("Name: " + name + ", thrust: " + thrust + " N, dough: " + dough + " Kg, fuel: " + fuel);
    }

    public abstract void showImportantInformation();
    public abstract void setCrew(int crew);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public double getDough() {
        return dough;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
