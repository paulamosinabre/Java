package com.mycompany.smarthome;
import java.awt.BorderLayout;
import  java.util.Scanner;
public class SmartThermostat extends Appliance {

    private double temperature;
    private String mode;

    public SmartThermostat() {
        super("Smart Thermostat");
        this.temperature = 20.0;
        this.mode = "Cold";
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(appName + " temperature set to " + temperature + "C.");
    }
    
    public void changeMode(String mode){
        
    }
    //Override
    public void control() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nControl Options for " + appName + ":");
        System.out.println("[1] Set Temperature");
        System.out.println("[2] Turn Off");
        
        System.out.println("Choose:");
        int controlThermo = scan.nextInt();
        
        switch(controlThermo){
            case 1: 
                System.out.println("Enter new temperature level (0C - 25C): ");
                int newTemperature = scan.nextInt();
                if(newTemperature >=0 && newTemperature <=25){
                    setTemperature(newTemperature);
                    SmartHome.edit();
                }
                else{
                    System.out.println("Invalid temperature level.Please try again.");
                    control();
                }
                break;
            case 2: 
                turnOff();
                SmartHome.edit();
                break;
            default:
                System.out.println("Invalid operator! Please choose between 1 and 2.");
                control();
        }
        
    }
}

    
