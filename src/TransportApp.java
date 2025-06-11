public class TransportApp {
    public static void main(String[] args) {



        Engine BusEngine = new Engine("Diesel");
        Driver busDriver = new Driver("John","NP1456798");

        Bus bus = new Bus("Tata",120,BusEngine,busDriver);


        Engine TruckEngine = new Engine("Turbo Diesel");
        Driver TruckDriver = new Driver("John","TP231456798");

        Truck Truck = new Truck("Mistubishi",100,TruckEngine,TruckDriver);


        bus.start();
        System.out.println();
        bus.displayDetails();
        System.out.println();

        Truck.start();
        System.out.println();
        Truck.displayDetails();








    }

}


