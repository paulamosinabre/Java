package com.mycompany.vehicletracker;

import java.util.Scanner;

public class VehicleTracker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter details for a Car: ");
        System.out.print("Brand: ");
        String carBrand = scan.nextLine();
        System.out.print("Model: ");
        String carModel = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double carDistance = scan.nextDouble();
        scan.nextLine();
        System.out.print("Fuel Used (liters): ");
        double carFuel = scan.nextDouble();
        scan.nextLine();
        Vehicle car = new Car(carBrand, carModel, carDistance, carFuel);

        //get user input for bike
        System.out.println("\nEnter details for a Bike: ");
        System.out.print("Brand: ");
        String bikeBrand = scan.nextLine();
        System.out.print("Model: ");
        String bikeModel = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double bikeDistance = scan.nextDouble();
        scan.nextLine();

        Vehicle bike = new Bike(bikeBrand, bikeModel, bikeDistance);

        //get user input for truck
        System.out.println("\nEnter details for a Truck: ");
        System.out.print("Brand: ");
        String truckBrand = scan.nextLine();
        System.out.print("Model: ");
        String truckModel = scan.nextLine();
        System.out.print("Distance Traveled (km): ");
        double truckDistance = scan.nextDouble();
        scan.nextLine();
        System.out.print("Fuel Used (liters): ");
        double truckFuel = scan.nextDouble();
        scan.nextLine();

        Vehicle truck = new Truck(bikeBrand, truckModel, truckDistance, truckFuel);

        System.out.println("\n---Vehicle Summary---");
        car.getInfo();
        System.out.println(" ");
        bike.getInfo();
        System.out.println(" ");
        truck.getInfo();

    }
}
