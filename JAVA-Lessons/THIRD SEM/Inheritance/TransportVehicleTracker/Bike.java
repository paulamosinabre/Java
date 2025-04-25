class Bike extends Vehicle {

    public Bike(String brand, String model, double distance) {
        super(brand, model, distance, 1.5);
    }

    @Override
    public double getFuelEfficiency() {
        return getDistance() / getFuel();
    }
}
