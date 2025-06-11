public class Bus extends Vehicle {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Bus(String brand, double speed, Engine engine, Driver driver) {
        super(brand, speed, engine);
        this.driver = driver;

    }

    public void start() {
        System.out.println("Bus Started");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        driver.displayDriverDetails();

    }
}
