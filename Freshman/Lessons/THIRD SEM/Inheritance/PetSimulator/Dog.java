
package com.mycompany.petsimulator;

public class Dog extends Pet{
    private String breed;
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    @Override
    public void speak(){
        System.out.println("\nwoof! woof!");
    }
    
    public void fetch(){
        System.out.println("\n" + super.getName() + " is fetching");
    }
    
    @Override
    public void getInfo(){
        System.out.println("\nName: " + super.getName() +
                "\nAge: " + super.getAge() +
                "\nBreed: " + this.breed);
    }
}
