
package com.mycompany.taskmanagementsystem;

import java.util.ArrayList;

public class UserManager {
    private static UserManager instance = null;
    private ArrayList<Registration> users = new ArrayList<>();
    private Registration currentUser;

    private UserManager() {}

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(Registration user) {
        users.add(user);
    }

    public ArrayList<Registration> getUsers() {
        return users;
    }

    public void setCurrentUser(Registration user) {
        this.currentUser = user;
    }

    public Registration getCurrentUser() {
        return this.currentUser;
    }
}
