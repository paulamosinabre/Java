package com.mycompany.maintask;

abstract public class Task {
    String title;

  //create an abstract method which allows the child class to override 
  public abstract void complete(); 

    public void showTitle() {
        System.out.println("Task: " + title);
    }

}
