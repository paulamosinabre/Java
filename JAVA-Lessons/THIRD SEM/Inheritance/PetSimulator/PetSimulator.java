package com.mycompany.petsimulator;

import java.util.Scanner;

public class PetSimulator {

    public static void main(String[] args) {
        System.out.println("-------------Welcome to Pet Simulator!-------------");
        getPetInfo();
    }
    
    public static void getPetInfo(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            System.out.print("Would you like to create a Dog or a Cat? ");
            String petChooser = scan.nextLine();

            if (petChooser.equalsIgnoreCase("dog")) {
                System.out.print("\nEnter your dog's name: ");
                String name = scan.nextLine();

                System.out.print("Enter your dog's age: ");
                int age = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter your dog's breed: ");
                String breed = scan.nextLine();

                dog.setName(name);
                dog.setAge(age);
                dog.setBreed(breed);
                getDogActions(dog, scan);
                break;

            } else if (petChooser.equalsIgnoreCase("cat")) {
                System.out.print("\nEnter your cat's name: ");
                String name = scan.nextLine();

                System.out.print("Enter your cat's age: ");
                int age = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter your cat's color: ");
                String breed = scan.nextLine();

                cat.setName(name);
                cat.setAge(age);
                cat.setColor(breed);

                getCatActions(cat,scan);
                break;
            } else {
                System.out.println("Invalid pet! Choose between the two only!\n");
            }
        }
    }

    public static void getDogActions(Dog dog, Scanner scan) {
        while (true) {
            System.out.println(""
                    + "\n--- What would you like to do? ---\n"
                    + "1. View pet info\n"
                    + "2. Make pet speak\n"
                    + "3. Play fetch\n"
                    + "4. Exit");

            int actions = scan.nextInt();

            switch (actions) {
                case 1 -> dog.getInfo();
                case 2 -> dog.speak();
                case 3 -> dog.fetch();
                case 4 -> {
                    System.out.println("Exiting...");
                    scan.close();
                }
                default -> System.out.println("Invalid! Please try again.");

            }
        }
    }

    public static void getCatActions(Cat cat, Scanner scan) {
        while (true) {
            System.out.println(""
                    + "\n--- What would you like to do? ---\n"
                    + "1. View pet info\n"
                    + "2. Make pet speak\n"
                    + "3. Scratch\n"
                    + "4. Exit");

            int actions = scan.nextInt();

            switch (actions) {
                case 1 -> cat.getInfo();
                case 2 -> cat.speak();
                case 3 -> cat.scratch();
                case 4 -> {
                    System.out.println("Exiting...");
                    scan.close();
                }
                default -> System.out.println("Invalid! Please try again.");
            }
        }
    }
}
