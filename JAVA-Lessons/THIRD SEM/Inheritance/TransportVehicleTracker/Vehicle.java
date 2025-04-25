class Vehicle {

    private String brand, model;
    private double distance, fuel;

    public Vehicle(String brand, String model, double distance, double fuel) {
        this.brand = brand;
        this.model = model;
        this.distance = distance;
        this.fuel = fuel;
    }

    public String getBrand() { return this.brand;}
    public String getModel() { return this.model;}
    public double getDistance() {return this.distance;}
    public double getFuel() {return this.fuel;}
    public double getFuelEfficiency() {return 1.0;}

    public void getInfo() {
        System.out.println("Vehicle: " + brand + " " + model);
        System.out.println("Distance Traveled: " + distance + " km");
        System.out.printf("Fuel Efficiency: %.2f km/l \n", getFuelEfficiency());
    }
}
