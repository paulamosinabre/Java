import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter details for a Car: ");
        System.out.print("Brand: ");
        String brandCar = scan.nextLine();
        System.out.print("Model: ");
        String modelCar = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double distanceCar = scan.nextDouble();
        scan.nextLine();
        System.out.print("Fuel Used (liters): ");
        double fuelCar = scan.nextDouble();
        scan.nextLine();
        Vehicle car = new Car(brandCar, modelCar, distanceCar, fuelCar);

        //get user input for bike
        System.out.println("\nEnter details for a Bike: ");
        System.out.print("Brand: ");
        String brandBike = scan.nextLine();
        System.out.print("Model: ");
        String modelBike = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double distanceBike = scan.nextDouble();
        scan.nextLine();

        Vehicle bike = new Bike(brandBike, modelBike, distanceBike);

        //get user input for truck
        System.out.println("\nEnter details for a Truck: ");
        System.out.print("Brand: ");
        String brandTruck = scan.nextLine();
        System.out.print("Model: ");
        String modelTruck = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double distanceTruck = scan.nextDouble();
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
