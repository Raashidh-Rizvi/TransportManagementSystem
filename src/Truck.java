public class Truck extends Vehicle {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Truck(String brand, double speed, Engine engine, Driver driver) {
        super(brand, speed, engine);
        this.driver = driver;
    }

    public void start() {
        System.out.println("Truck Started");

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        driver.displayDriverDetails();
    }
}
