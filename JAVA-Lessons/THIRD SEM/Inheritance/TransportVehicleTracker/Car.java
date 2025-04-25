class Car extends Vehicle {
    private double fuelUsed;

    public Car(String brand, String model, double distance, double fuelUsed) {
        super(brand, model, distance, fuelUsed);
        this.fuelUsed = fuelUsed;
    }

    @Override
    public double getFuelEfficiency() {
        return getDistance() / getFuel();
    }

}
