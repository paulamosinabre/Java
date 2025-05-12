package com.mycompany.taskmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManagement {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Login> users = new ArrayList<>();
    static String username;

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
        for (Login login : users) {
            
            if (login.getUsername().equals(user)) {
                found = true;
                if (pass.equals(login.getPassword())) {
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

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter your username: ");
        username = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        Login login = new Login(email, firstName, lastName, username, password);

        taskInterface();
    }

    public static void taskInterface() {
        Task task = new Task();
        while (true) {
            System.out.println("\n================== Menu ==================");
            System.out.println("Choose an option:\n"
                    + "1. Add list\n"
                    + "2. Remove\n"
                    + "3. Edit\n"
                    + "4. Search\n"
                    + "5. Show list\n"
                    + "6. Back \n"
                    + "7. Exit\n");

            System.out.print("\nEnter your choice: ");
            int chooseTask = scan.nextInt();
            scan.nextLine();

            switch (chooseTask) {
                case 1:
                    System.out.println("\n================== Add List ==================");
                    System.out.print("Enter your task: ");
                    String userTask = scan.nextLine();

                    System.out.print("Set a category: ");
                    String category = scan.nextLine();

                    System.out.print("Set date: ");
                    String date = scan.nextLine();

                    System.out.print("Set priority: ");
                    String priority = scan.nextLine();
                    task.add(userTask);
                    task.setCategory(category);
                    task.setDate(date);
                    task.setPriority(priority);

                    break;
                case 2:
                    System.out.println("\n================== Remove List ==================");
                    if (task.getTodoList() == null) {
                        System.out.println("Please create a to do list first!");
                    }
                    task.print();
                    System.out.print("\nChoose a number to remove: ");
                    int removeNum = scan.nextInt();
                    scan.nextLine();
                    task.remove(removeNum);

                    break;
                case 3:
                    System.out.println("\n================== Edit List ==================");
                    if (task.getTodoList() == null) {
                        System.out.println("Please create a to do list first!");
                    }
                    task.print();

                    System.out.print("Choose a number to edit: ");
                    int num = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter a new task: ");
                    String newTask = scan.nextLine();

                    task.edit(num, newTask);
                    break;
                case 4:
                    System.out.println("\n================== Search List ==================");
                    System.out.print("Search for: ");
                    String search = scan.nextLine();
                    task.search(search);
                    break;
                case 5:
                    System.out.println("\n================== " + username + "'s List ==================");
                    if (task.getTodoList() == null) {
                        System.out.println("Please create a to do list first!");
                    }
                    task.print();
                case 6:
                    start();
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number from 1-6.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("================== Welcome to Taskibidi ==================");
        start();
    }
}
