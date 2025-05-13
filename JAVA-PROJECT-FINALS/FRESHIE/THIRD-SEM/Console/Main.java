package com.mycompany.taskmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagement {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Login> users = new ArrayList<>();
    static String username, userTask, category, priority, date;
    static Login login;

    public static void start() {
        System.out.println("\nChoose an option: ");
        System.out.println("1. Login\n"
                + "2. Sign-up\n"
                + "3. Exit");

        System.out.print("\nEnter your choice: ");
        int registration = scan.nextInt();
        scan.nextLine();

        switch (registration) {
            case 1:
                login();
                break;
            case 2:
                signup();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please choose a number from 1-3.");
                break;
        }
    }

    public static void login() {
        System.out.println("\n================== Log-in ==================");
        System.out.print("Enter your username: ");
        String user = scan.nextLine();

        System.out.print("Enter your password: ");
        String pass = scan.nextLine();

        boolean found = false;
        for (Login userObj : users) {
            if (userObj.getUsername().equals(user)) {
                found = true;
                if (pass.equals(userObj.getPassword())) {
                    login = userObj;
                    taskInterface();
                } else {
                    System.out.println("Incorrect password!");
                    start();
                }
            }
        }
        if (!found) {
            System.out.println("Create an account first!");
            start();
        }

    }

    public static void signup() {
        System.out.println("\n================== Sign Up ==================");

        System.out.print("Enter your email: ");
        String email = scan.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter your username: ");
        username = scan.nextLine();

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        login = new Login(email, firstName, lastName, username, password);
        users.add(login);

        taskInterface();
    }

    public static void taskInterface() {
        TaskManager manager = login.getTaskManager();
        while (true) {
            System.out.println("\n================== Menu ==================");
            System.out.println("Choose an option:\n"
                    + "1. Add list\n"
                    + "2. Remove\n"
                    + "3. Edit\n"
                    + "4. Search\n"
                    + "5. Show list\n"
                    + "6. Show account details \n"
                    + "7. Back \n"
                    + "8. Exit");

            System.out.print("\nEnter your choice: ");
            int chooseTask = scan.nextInt();
            scan.nextLine();

            switch (chooseTask) {
                case 1:
                    System.out.println("\n================== Add List ==================");
                    System.out.print("Enter your task: ");
                    userTask = scan.nextLine();

                    System.out.print("Set a category: ");
                    category = scan.nextLine();

                    System.out.print("Set date: ");
                    date = scan.nextLine();

                    System.out.print("Set priority: ");
                    priority = scan.nextLine();
                    Task task = new Task(userTask, category, priority, date);
                    manager.add(task);

                    break;
                case 2:
                    System.out.println("\n================== Remove List ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to do list first!");
                        break;
                    }
                    manager.print();
                    System.out.print("\nChoose a number to remove: ");
                    int removeNum = scan.nextInt();
                    scan.nextLine();
                    manager.remove(removeNum);

                    break;
                case 3:
                    System.out.println("\n================== Edit List ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to do list first!");
                        break;
                    }
                    manager.print();

                    System.out.print("Choose a number to edit: ");
                    int num = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter a new task: ");
                    String newTask = scan.nextLine();

                    manager.edit(num, newTask);
                    break;
                case 4:
                    System.out.println("\n================== Search List ==================");
                    System.out.print("Search for: ");
                    String search = scan.nextLine();
                    manager.search(search);
                    break;
                case 5:
                    System.out.println("\n================== " + username + "'s List ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to do list first!");
                        break;
                    }
                    manager.print();
                    break;
                case 6:
                    System.out.println("\n================== " + username + "'s Account ==================");
                    login.showInformation();
                    break;
                case 7:
                    start();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number from 1-6.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("================== Welcome to Taskibidi ==================");
        start();
    }
}
