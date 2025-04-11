package com.mycompany.calculator;

public class Calculators {

    private double add, subtract, multiply, divide;
    private boolean isSecretUnlocked;

    public boolean unlockSecret(String passcode) {
        String myPasscode = "1010";

        if (myPasscode.equalsIgnoreCase(passcode)) {
            System.out.println("Access granted! Secret Operation unlocked.");
            isSecretUnlocked = true;
            return true;
        } 
            
        return false;
    }

    public void add(double num1, double num2) {
        System.out.println("Result: " + (num1 + num2));
    }

    public void subtract(double num1, double num2) {
        System.out.println("Result: " + (num1 - num2));
    }

    public void multiply(double num1, double num2) {
        System.out.println("Result: " + (num1 * num2));
    }

    public void divide(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Result: Undefined.");
        }
        System.out.println("Result: " + (num1 + num2));
    }

    public void power(double num1, double num2) {
        System.out.println("Result: " + (Math.pow(num1, num2)));
    }
}
