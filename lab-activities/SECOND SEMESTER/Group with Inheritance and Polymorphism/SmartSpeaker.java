package com.mycompany.smarthome;

import java.util.Scanner;

public class SmartSpeaker extends Appliance {

    private int volume;

    public SmartSpeaker() {
        super("Smart Speaker");
        this.volume = 50;
    }

    public void adjustVolume(int level) {
        this.volume = level;
        System.out.println(appName + " volume set to " + volume + "%.");
    }

    public void control() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nControl Options for " + appName + ":");
        System.out.println("[1] Adjust Volume");
        System.out.println("[2] Turn Off");
        System.out.println("Choose:");
        int controlSpeaker = scan.nextInt();

        switch (controlSpeaker) {
            case 1:
                System.out.println("Enter new volume level (0 - 100): ");
                int newVolume = scan.nextInt();
                if (newVolume >= 0 && newVolume <= 100) {
                    adjustVolume(newVolume);
                    SmartHome.edit();
                } else {
                    System.out.println("INVALID VOLUME LEVEL! Please try again.");
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
