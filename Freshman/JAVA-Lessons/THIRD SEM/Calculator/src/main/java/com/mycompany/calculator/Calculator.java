package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);
    static Calculators calculators = new Calculators();
    static double num1, num2;

    public static void main(String[] args) {
        System.out.print("Enter the passcode to unlock the secret operation: ");
        String password = scan.nextLine();

        calculators.setPassword(password);
        numberChooser();
    }

    public static void numberChooser() {

        while (true) {
            try {
                System.out.print("\nEnter first number: ");
                num1 = scan.nextInt();

                System.out.print("Enter second number: ");
                num2 = scan.nextInt();

                operationChooser();
            } catch (Exception e) {
                System.out.println("Invalid number! Please Try Again.");
                scan.nextLine();
            }
        }
    }

    public static void operationChooser() {
        try {
            System.out.print("\nChoose an operation: ");
            System.out.println("\n1 - Add" + "\n2 - Subtract" + "\n3 - Multiply" + "\n4 - Divide" + "\n5 - Power(Secret Operation)" + "\n6 - Stop");
            System.out.print("Enter your choice: ");
            int choose = scan.nextInt();
            scan.nextLine();
            switch (choose) {
                case 1:
                    calculators.add(num1, num2);
                    numberChooser();
                    break;
                case 2:
                    calculators.subtract(num1, num2);
                    numberChooser();
                    break;

                case 3:
                    calculators.multiply(num1, num2);
                    numberChooser();
                    break;

                case 4:
                    calculators.divide(num1, num2);
                    numberChooser();
                    break;
                case 5:
                    enterPassword();

                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid number! Please Try Again.");
                    operationChooser();
            }
        } catch (Exception e) {
            System.out.println("Invalid! Please Try Again.");
            scan.nextLine();
            numberChooser();
        }

    }

    public static void enterPassword() {
        System.out.print("\nEnter the passcode to unlock the secret operation: ");
        String userPassword = scan.nextLine();

        if (calculators.unlockSecret(userPassword) == true) {
            calculators.power(num1, num2);
        } else {
            System.out.println("Access denied. We are proceeding with basic operations only.");
            numberChooser();
        }
    }
}
