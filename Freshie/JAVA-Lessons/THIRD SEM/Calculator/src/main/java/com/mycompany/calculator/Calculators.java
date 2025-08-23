package com.mycompany.calculator;

public class Calculators {

    private double add, subtract, multiply, divide;
    private boolean isSecretUnlocked;
    private String password;
    
    public String setPassword(String passcode){
        return this.password = passcode;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public boolean unlockSecret(String passcode) {
        if (getPassword().equalsIgnoreCase(passcode)) {
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
        System.out.println("Result: " + (num1 / num2));
    }

    public void power(double num1, double num2) {
        System.out.println("Result: " + (Math.pow(num1, num2)));
    }
}
