
package com.mycompany.petsimulator;

public class Cat extends Pet{
    private String color;
    
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public void speak(){
        System.out.println("\nmeow"); 
    }
    
    public void scratch(){
        System.out.println("\n" + super.getName() + " is scratching the couch!");
    }
    
    @Override
    public void getInfo(){
        System.out.println("\nName: " + super.getName() +
                "\nAge: " + super.getAge() +
                "\nColor: " + this.color);
                
    }
}
