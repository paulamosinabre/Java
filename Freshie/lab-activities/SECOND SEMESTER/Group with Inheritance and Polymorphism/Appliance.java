package com.mycompany.smarthome;

 public abstract class Appliance {
    public String appName;
    private boolean button;
    

    public Appliance(String appName) {
        this.appName = appName;
        this.button = false; 
    }

    public String appName() {
        return appName;
    }

    public boolean isButton() {
        return button;
    }

    public void turnOn() {
        button = true;
        System.out.println(appName + " is now ON.");
    }

    public void turnOff() {
        button = false;
        System.out.println(appName + " is now OFF.");
    }

    public abstract void control();
}
