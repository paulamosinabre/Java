package com.mycompany.smarthome;

import java.util.Scanner;

public class SmartLight extends Appliance {

    private int brightness;
    private String color;

    public SmartLight(String appName) {
        super(appName);       // super = parent class (superclass other term)
        this.brightness = 0;
        this.color = "White";
    }

    public void adjustBrightness(int level) {
        this.brightness = level;
        System.out.println(appName + " brightness set to " + brightness + "%."); //AYAW MACALL NI APPNAME BWANAKANG
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println(appName + " color changed to " + color + ".");
    }

    public void control() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nControl Options for " + appName + ":");
        System.out.println("[1] Adjust Brightness");
        System.out.println("[2] Change Color");
        System.out.println("[3] Turn Off");

        System.out.print("Choose: ");
        int controlLight = scan.nextInt();

        switch (controlLight) {
            case 1:
                System.out.print("Enter new brightness level (from 0-100): ");
                int newBrightness = scan.nextInt();
                if (newBrightness >= 0 && newBrightness <= 100) {
                    adjustBrightness(newBrightness);
                    SmartHome.edit();
                } else {
                    System.out.println("Invalid brightness level. Please enter a value between 0 and 100.");
                    control();
                }
                break;
            case 2:
                System.out.println("Enter a new color: ");
                String newColor = scan.next();

                changeColor(newColor);
                SmartHome.edit();
                break;
            case 3:
                turnOff();
                SmartHome.edit();
                break;
            default:
                System.out.println("\nThe number you entered is invalid. Please select from (1-3).");
                control();
        }

    }
}
