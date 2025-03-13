package com.mycompany.samplecodes;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleCodes {

    static ArrayList<String> name = new ArrayList<>();;
    static Scanner scan = new Scanner(System.in);;
    
    public static void chooseAnAction(){
        //Choose an action
        
        System.out.println("\n \n[1] Add");
        System.out.println("[2] Remove");
        System.out.println("[3] Edit");
        System.out.println("[4] Exit");
        System.out.print("\nChoose a number: ");
        
        int choose = scan.nextInt();
        scan.nextLine();
        
        switch (choose) {
            case 1:
                System.out.print("Enter a name: ");
                String newName = scan.nextLine();

                name.add(newName);
                output();
                chooseAnAction();
                break;
            case 2:
                System.out.print("Enter an index to remove. From 0 - " + name.size() + ": ");
                int remove = scan.nextInt();

                name.remove(remove);
                output();
                chooseAnAction();
                break;
            case 3:
                System.out.print("Enter an index to replace. From 0 - " + name.size() + ": ");
                int replaceIndex = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter a new name: ");
                String replaceName = scan.nextLine();

                if (replaceIndex < name.size()) {
                    name.set(replaceIndex, replaceName);
                    output();
                    chooseAnAction();
                } else {
                    System.out.println("Invalid index! Try again.");
                    chooseAnAction();
                }
                break;
            case 4:
                System.out.println("Closing...");
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("List of Names:");
        name.add("Jamaica");
        name.add("Jasmine");
        name.add("Anecka");
        name.add("Kim");
        name.add("Amanda");
        name.add("Christine");

        output();
        chooseAnAction();
    }
    
    public static void output() {
        for (int i = 0; i < name.size(); i++) {
            System.out.print(name.get(i));

            if (i < name.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
