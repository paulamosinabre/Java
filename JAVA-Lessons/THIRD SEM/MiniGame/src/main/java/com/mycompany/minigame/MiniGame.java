package com.mycompany.minigame;

import java.util.Scanner;

public class MiniGame {

    public static void main(String[] args) {
        enterInfo();
    }

    public static void enterInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character: ");
        String name = scan.nextLine();

        System.out.print("Enter class type (Warrior/Mage/Archer): ");
        String classType = scan.nextLine();

        if (classType.equalsIgnoreCase("Warrior") || classType.equalsIgnoreCase("Mage") || classType.equalsIgnoreCase("Archer")) {
            System.out.print("Enter initial level: ");
            int level = scan.nextInt();
            scan.nextLine();

            Character myCharacter = new Character(name, classType, level);

            System.out.println("\nCharacter Created!");
            myCharacter.displayInfo();

            System.out.print("\nDo you want to level up? (yes/no): ");
            String choose = scan.nextLine();

            if (choose.equalsIgnoreCase("yes")) {
                myCharacter.levelUp();
                System.out.println("\nUpdated Character Info: " + "\nName: " + myCharacter.getName() + "\nClass: " + myCharacter.getClassType() + "\nLevel: " + myCharacter.getLevel());
            } else if (choose.equalsIgnoreCase("no")) {
                System.out.println("Your level remains the same :/");
            } else {
                System.out.println("Invalid!");
            }
        } else {
            System.out.println("Invalid class type! Try Again");
            enterInfo();
        }

    }
}
