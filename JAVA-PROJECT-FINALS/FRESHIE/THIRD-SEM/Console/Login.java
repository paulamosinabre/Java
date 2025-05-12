
package com.mycompany.taskmanagement;

public class Login {
    
    private String email, firstName, lastName, username, password;
    
    public Login(String email, String firstName, String lastName, String username, String password){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void showInformation(){
        System.out.println("E-mail: " + email + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nUsername: " + username);
    }

}

