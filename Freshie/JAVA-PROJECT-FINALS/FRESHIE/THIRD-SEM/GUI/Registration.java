package com.mycompany.taskmanagementsystem;

import java.util.ArrayList;

public class Registration {
    private String email, firstName, lastName, username, password;
    private TaskManager taskManager;

    public Registration(String email, String firstName, String lastName, String username, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.taskManager = new TaskManager();
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }
    
    public String getFirstName(){
        return this.username;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public TaskManager getTaskManager() {
        return this.taskManager;
    }

    public void showInformation() {
        System.out.println("E-mail: " + email + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nUsername: " + username);
    }

}
