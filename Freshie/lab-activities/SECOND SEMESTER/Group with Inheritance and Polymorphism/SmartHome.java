
package com.mycompany.smarthome;
import java.util.Scanner;

public class SmartHome {
    
    // HomePage()
    public static void welcome(){
        System.out.println("\nWelcome to your Smart Home Control Panel.");
        
        System.out.println("\nHere are your Available Devices: ");
        System.out.println("[1] Smart Light");
        System.out.println("[2] Smart Thermostat");
        System.out.println("[3] Smart Speaker");
        System.out.println("[4] Smart Door Lock");
    }
    
    public static void chooseDevice(){
        Scanner input = new Scanner(System.in);
        Appliance light = new SmartLight("SmartLight");
        Appliance thermo = new SmartThermostat();
        Appliance speaker = new SmartSpeaker();
        Appliance doorLock = new SmartDoorLock();
        
        System.out.print("\nSelect a device to control (1-4) or enter 0 to exit: ");
         int chooseDev = input.nextInt();
        
        
        switch(chooseDev){
        
            case 0: 
                System.out.println("\nExiting the system. Goodbye!");
                return;
            case 1: 
                light.control();
                break;
            case 2: 
                thermo.control();
                break;
                
            case 3: 
                speaker.control();
                break;   
            case 4: 
                doorLock.control();
                break;    
            default: 
                System.out.println("\nThe number you entered is invalid. Please select from (1-4).");
                chooseDevice();      
    }
        edit();

    }
    public static void edit(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nWould you like to edit more? (y/n): ");
        String eeditkapa = input.next();

        if (eeditkapa.equalsIgnoreCase("y")) {
            chooseDevice(); 
        } else {
            System.out.println("Exiting the system. Goodbye!");
            System.exit(0);
        }
        
    }

    public static void main(String[] args) {
        
        Appliance[] devices = {
            
            new SmartThermostat(),
            new SmartSpeaker(),
            new SmartDoorLock(),
            new SmartLight("SmartLight")
        };
        
        // Call Welcome and chooseDevice method 
        welcome();
        chooseDevice();
        
    }
}
