package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);
    static Calculators calculators = new Calculators();

    public static void main(String[] args) {
        enterInformation();
    }

    public static void enterInformation() {
        System.out.print("Enter first number: ");
        double num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        double num2 = scan.nextInt();

        System.out.print("\nChoose an operation: ");
        System.out.println("\n1 - Add" + "\n2 - Subtract" + "\n3 - Multiply" + "\n4 - Divide" + "\n5 - Power(Secret Operation)");
        System.out.print("Enter your choice: ");
        int choose = scan.nextInt();
        scan.nextLine();
        switch (choose) {
            case 1:
                calculators.add(num1, num2);
                break;
            case 2:
                calculators.subtract(num1, num2);
                break;

            case 3:
                calculators.multiply(num1, num2);
                break;

            case 4:
                calculators.divide(num1, num2);
                break;
            case 5:
                System.out.print("Enter the passcode to unlock the secret operation: ");
                String userPassword = scan.nextLine();

                if (calculators.unlockSecret(userPassword) == true) {
                    calculators.power(num1, num2);
                } else {
                    System.out.println("Access denied. We are proceeding with basic operations only.");
                    enterInformation();
                }
                break;

            default:
                System.out.println("Invalid number! Please Try Again.");

        }
    }

}
