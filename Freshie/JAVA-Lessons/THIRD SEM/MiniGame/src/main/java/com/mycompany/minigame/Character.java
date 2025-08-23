
package com.mycompany.minigame;

public class Character {
    
    private String name;
    private String classType;
    private int level;
    
    Character(String name, String classType, int level){
        this.name = name;
        this.classType = classType;
        this.level = level;
    }
    
    public String getName(){
        return name;
    }
    
    public String getClassType(){
        return classType;
    }
    
    public int getLevel(){
        return level;
    }
    
    public void levelUp(){
        this.level += 1; 
        System.out.println("Congratulations! " + getName() + " has leveled up to Level " + getLevel() + "!");
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name + "\nClass: " + classType + "\nLevel: " + level);
    }
}
