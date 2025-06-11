public class Vehicle {
    protected String brand;
    protected double speed;
    protected Engine engine;

    public Vehicle(String brand, double speed, Engine engine) {
        this.brand = brand;
        this.speed = speed;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Vehicle Started");
    }

    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Speed: " + this.speed +" km/h");
        engine.displayEngineDetails();

    }



}
