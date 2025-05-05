package com.mycompany.maintask;

public class PersonalTask extends Task {
    
    public PersonalTask(String title){
        this.title = title;
    }
    
    public void complete(){
        System.out.println("Task: " + title + " completed");
    }
}
