import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter details for Car: ");
		System.out.println("Brand: ");
		String carBrand = scan.nextLine();
		System.out.println("Model: ");
		String carModel = scan.nextLine();
		System.out.println("Distance: ");
		int carDistance = scan.nextInt();
		System.out.println("FuelUsed: ");
		double carFuel = scan.nextDouble();
		Vehicle car = new Car(carBrand, carModel, carDistance, carFuel);
		
        System.out.println("\nEnter details for a Bike: ");
        System.out.print("Brand: ");
        String brandBike = scan.nextLine();
        System.out.print("Model: ");
        String modelBike = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        int distanceBike = scan.nextInt();
        scan.nextLine();

        Vehicle bike = new Bike(brandBike, modelBike, distanceBike);

        //get user input for truck
        System.out.println("\nEnter details for a Truck: ");
        System.out.print("Brand: ");
        String brandTruck = scan.nextLine();
        System.out.print("Model: ");
        String modelTruck = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        int distanceTruck = scan.nextInt();
        scan.nextLine();
        System.out.print("Fuel Used (liters): ");
        double fuelTruck = scan.nextDouble();
        scan.nextLine();

        Vehicle truck = new Truck(brandTruck, modelTruck, distanceTruck, fuelTruck);

        System.out.println("\n---Vehicle Summary---");
        car.getInfo();
        System.out.println(" ");
        bike.getInfo();
        System.out.println(" ");
        truck.getInfo();
		
		
	}
}

class Vehicle {
	private String brand, model;
	private int distance;
	private double fuelUsed;
	
	public Vehicle(String brand, String model, int distance, double fuelUsed){
	this. brand = brand;
	this.model = model;
	this.distance = distance;
	this.fuelUsed = fuelUsed;
	}
	
	public int getDistance() { return distance; }
	public double getFuelUsed() { return fuelUsed; }
	public void getInfo(){
	System.out.println("Vehicle: " + brand + " " + model);
	System.out.println("Distance Traveled: " + distance);
	System.out.printf("Fuel Efficiency: %.2f \n,", fuelUsed);
	}
}

class Car extends Vehicle {
	public Car(String brand, String model, int distance, double fuelUsed){
	super(brand, model, distance, fuelUsed);
	}
	
	public double getFuelEfficiency(){
		return getDistance() / getFuelUsed();
	}
}

class Bike extends Vehicle {
	public Bike(String brand, String model, int distance){
	super(brand, model, distance, 1.5);
	}
	
	public double getFuelEfficiency(){
		return getDistance() / getFuelUsed();
	}
}

class Truck extends Vehicle {
	public Truck(String brand, String model, int distance, double fuelUsed){
	super(brand, model, distance, fuelUsed);
	}
	
	public double getFuelEfficiency(){
		return getDistance() / getFuelUsed();
	}
}
