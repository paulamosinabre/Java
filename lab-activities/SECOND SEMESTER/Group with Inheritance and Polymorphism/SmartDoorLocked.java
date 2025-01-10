package com.mycompany.smarthome;

import java.util.Scanner;


public class SmartDoorLock extends Appliance {

    private boolean LockedBaIto;

    public SmartDoorLock() {
        super("Smart Door Lock");
        this.LockedBaIto = true;
    }

    public void unlock() {
        LockedBaIto = false; 
        System.out.println(appName + " is now unlocked.");
    }

    public void lock() {
        LockedBaIto = true;
        System.out.println(appName + " is now locked."); 
    }

    public void control() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nControl Options for " + appName + ":");
        System.out.println("[1] Lock");
        System.out.println("[2] Unlock");
        System.out.println("[3] Turn Off");
        
        System.out.println("Choose:");
            int controlDoorLock = scan.nextInt();
        
            switch(controlDoorLock){
            case 1: 
               lock();
               SmartHome.edit();
                break;
            case 2: 
                unlock();
                SmartHome.edit();
                break;
            case 3: 
                turnOff();
                SmartHome.edit();
                break;
            default:
                System.out.println("Invalid operator! Please choose between 1,2, and 3.");
                control();
            }
           
    }
}
