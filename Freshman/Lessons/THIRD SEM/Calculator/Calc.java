package com.mycompany.calc;

import java.util.Scanner;

public class Calc {

    static Scanner scan = new Scanner(System.in);
    static Calculator calc = new Calculator();
    static int num1, num2;
    static String userPassword;
    
    public static void enterNum() {

        while (true) {
            try {
                System.out.println("\n=========== Prompt ===========");
                System.out.print("Enter first number: ");
                num1 = scan.nextInt();

                System.out.print("Enter second number: ");
                num2 = scan.nextInt();
                operationChooser();
            } catch (Exception e) {
                System.out.println("Invalid! Try Again! ");
                scan.nextLine(); // to stop the infinite loop
            }
        }
        
    }
    
    public static void operationChooser(){
        System.out.println("\n======== Operation Chooser ========");
        System.out.println("Choose an operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Power");
        System.out.println("6 - Stop");
        System.out.print("\nEnter your choice: ");
        int operation = scan.nextInt();
        scan.nextLine();
        
        if(operation == 1){
            add();
        } else if(operation == 2){
            subtract();
        } else if(operation == 3){
            multiply();
        } else if(operation == 4){
            divide();
        } else if(operation == 5){
            power();
        } else if(operation == 6){
            System.exit(0);
        }
    }
    public static void add() {
        System.out.println("\nResult: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtract() {
        System.out.println("\nResult: " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply() {
        System.out.println("\nResult: " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide() {
        System.out.println("\nResult: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
    
    public static void power(){
        System.out.println("\n===========Password===========");
        System.out.print("Enter passcode: ");
        String passcode = scan.nextLine();
        calc.unlockSecret(passcode);
        
        if(calc.isSecretUnlocked()){
            System.out.println("\nResult: " + num1 + " ^ " + num2 + " = " + (Math.pow(num1,num2)));
        } else {
            System.out.println("Access Denied!");
        }
        
    }

    public static void main(String[] args) {
        System.out.print("Enter the passcode to unlock the secret operation: ");
        userPassword = scan.nextLine();
        
        calc.setPassword(userPassword);
        enterNum();
    }
}

class Calculator {

    private String password;
    private boolean isSecretUnlocked;

    public Calculator(){
        this.isSecretUnlocked = false;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean isSecretUnlocked(){
        return isSecretUnlocked;
    }
    public boolean unlockSecret(String password){
        if(getPassword().equals(password)){
            this.isSecretUnlocked = true;
            return true;
        }
        return false;
    }
}
