package com.mycompany.maintask;

public class MainTask {

    public static void main(String[] args) {
      //instantiate using the child class constructor to set a title (polymorphism)
        Task task = new PersonalTask("Laundry");
        task.showTitle();
        task.complete();
    }
}
