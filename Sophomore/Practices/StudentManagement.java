package com.mycompany.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentManagement {

    static ArrayList<User> usersList = new ArrayList();
    static Manager manager = new Manager();

    public static void startPage(Scanner scan) {
        while (true) {
            System.out.println("\n============ Welcome to DNM University =========");
            System.out.println("1. Sign-up");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            System.out.println("================================================");

            System.out.print("\nChoose an action: ");
            int startAction = scan.nextInt();
            //for debugging purposes
            scan.nextLine();

            switch (startAction) {
                case 1:
                    signUp(scan);
                    break;
                case 2:
                    login(scan);
                    break;
                case 0:
                    System.out.println("Closing...");
                    scan.close();
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

    public static boolean thevalidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.endsWith("@gmail.com")
                || email.endsWith("@outlook.com")
                || email.endsWith("@dnmu.edu.ph");
    }

    public static boolean thevalidContactNumber(String number) {
        if (number == null || number.length() != 11) {
            return false;
        }
        return number.matches("\\d{11}");
    }

    public static boolean thevalidPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        return Pattern.matches(".*[A-Z].*", password)
                && Pattern.matches(".*[a-z].*", password)
                && Pattern.matches(".*[^a-zA-Z0-9\\\\s].*", password);
    }

    public static void signUp(Scanner scan) {
        System.out.println("\n=========== Registration ============");
        //checks if email ends with @gmail.com, outlook, and dnmu.edu.ph
        String email = "";
        boolean validEmail = false;
        while (!validEmail) {
            System.out.print("Enter your email: ");
            email = scan.nextLine().trim();

            if (thevalidEmail(email)) {
                validEmail = true;
            } else {
                System.out.println("Invalid email domain. Please re-enter and choose only between @gmail.com, @outlook.com, or @dnmu.edu.ph. Please try again.");
            }
        }

        //create a validation that it must be a number and it should contain exactly 11 numbers
        String contactNumber = "";
        boolean validNumber = false;
        while (!validNumber) {
            System.out.print("Enter your contact number: ");
            contactNumber = scan.nextLine();

            if (thevalidContactNumber(contactNumber)) {
                validNumber = true;
            } else {
                System.out.println("Must contain 11 digits only! Please try again");
            }
        }

        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        //create a validation that it should contain one special character, atleast one uppercase, atleast one lowercase
        String password = "";
        boolean validPassword = false;
        while (!validPassword) {
            System.out.print("Enter your password: ");
            password = scan.nextLine().trim();

            if (thevalidPassword(password)) {
                validPassword = true;
            } else {
                System.out.println("Invalid Password! Must contain one special character, one uppercase and lowercase letter. Please try again.");
            }

        }

        System.out.println("You have successfully created an account!");

        User user = new User(email, contactNumber, username, password);
        usersList.add(user);
        home(scan, user);
    }

    public static void login(Scanner scan) {
        System.out.println("\n=================== Log-in ======================");
        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        //create a validation that if the user is found, proceed to home, if not then login again
        boolean found = false;
        for (User user : usersList) {
            if (user.getUsername().equals(username)) {
                found = true;
                if (user.getPassword().equals(password)) {
                    System.out.println("\nWelcome back, " + username + "!");
                    System.out.println("================================================");
                    home(scan, user);
                } else {
                    System.out.println("Incorrect Password. Try Again");
                }
            }
        }

        if (!found) {
            System.out.println("Create an account first!");
            signUp(scan);
        }
    }

    public static String chooser(Scanner scan, String[] str, String label) {
        System.out.print("\n" + label);
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                System.out.println("\n" + (i + 1) + ". " + str[i]);
            } else {
                System.out.println((i + 1) + ". " + str[i]);
            }
        }

        System.out.print("Choose a " + label.toLowerCase() + ": ");
        int option = scan.nextInt();
        scan.nextLine();

        if (option >= 1 && option <= str.length) {
            return str[option - 1];
        } else {
            System.out.println("Invalid! number");
        }
        return " ";
    }

    public static void addStudent(Scanner scan) {
        System.out.print("\nEnter first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter middle name (leave blank if none): ");
        String middleName = scan.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scan.nextLine();

        String[] genders = {"Male", "Female"};
        String gender = chooser(scan, genders, "Gender");

        String[] courses = {"BSArch", "BSCE", "BSCpE", "BSIT-MWA", "BSCS-ML"};
        String course = chooser(scan, courses, "Course");

        String[] years = {"1st Year", "2nd Year", "3rd Year", "4th Year"};
        String year = chooser(scan, years, "Year");

        System.out.print("Enter GPA: ");
        double GPA = scan.nextDouble();

        //TO DO: GENERATE A RANDOM NUMBER FOR STUDENT ID
        String id = "2025-" + (1000000 + (int) (Math.random() * 1000000));

        //validation to check if middle name is empty or not
        if (middleName.isEmpty()) {
            manager.add(new Student(id, firstName, lastName, gender, course, year, GPA));
            System.out.println("Successfully Added!");
        } else {
            manager.add(new StudentFullName(id, firstName, middleName, lastName, gender, course, year, GPA));
            System.out.println("Successfully Added!");
        }

    }

    public static void updateStudent(Scanner scan) {
        manager.showDetails();
        System.out.print("\nEnter no. to update: ");
        int num = scan.nextInt();
        scan.nextLine();

        //check if index is valid
        if (!manager.isItInTheList(num)) {
            return;
        }

        System.out.println("\nUpdate: ");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Gender");
        System.out.println("4. Course");
        System.out.println("5. Year");
        System.out.println("6. GPA");
        System.out.print("\nChoose an option to update: ");
        int updateOption = scan.nextInt();
        scan.nextLine();
        switch (updateOption) {
            case 1:
                System.out.print("\nEnter first name: ");
                String firstName = scan.nextLine();
                manager.updateFirstName(firstName, num);
                break;
            case 2:
                System.out.print("\nEnter last name: ");
                String lastName = scan.nextLine();
                manager.updateLastName(lastName, num);
                break;
            case 3:
                String[] genders = {"Male", "Female"};
                String gender = chooser(scan, genders, "Gender");
                manager.updateGender(gender, num);
                break;
            case 4:
                String[] courses = {"BSArch", "BSCE", "BSCpE", "BSIT-MWA", "BSCS-ML"};
                String course = chooser(scan, courses, "Course");
                manager.updateCourse(course, num);
                break;
            case 5:
                String[] years = {"1st Year", "2nd Year", "3rd Year", "4th Year"};
                String year = chooser(scan, years, "Year");
                manager.updateYear(year, num);
                break;
            case 6:
                System.out.print("\nEnter GPA:");
                double GPA = scan.nextDouble();
                manager.updateGPA(GPA, num);
                break;
            default:
                System.out.println("Invalid number!");
        }

    }

    public static void sortStudent(Scanner scan) {
        System.out.println("\n==================== Sort ======================");
        System.out.println("1. Name (From A-Z)");
        System.out.println("2. Name (From Z-A)");
        System.out.println("3. GPA (From Lowest-Highest)");
        System.out.println("4. GPA (From Highest-Lowest)");
        System.out.println("5. Course");
        System.out.println("================================================");
        System.out.print("Sort by: ");
        int sortChooser = scan.nextInt();
        scan.nextLine();

        manager.sortBy(sortChooser);
    }

    public static void viewTotalNum(String category, String[] items) {
        
        System.out.println("\n" + category + ":");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + ": " + manager.totalStudents(category, items[i]));
        }
    }

    public static void home(Scanner scan, User user) {
        //pre-defined students
        Student student;
        manager.add(new Student("2022-1056789", "Alyssa Nicole", "Bacsal", "Female", "BSCE", "4th Year", 4.0));
        manager.add(new Student("2022-1089224", "Diane Nicole", "Mondejar", "Female", "BSArch", "4th Year", 3.99));
        manager.add(new Student("2025-1023756", "Paula Bianca", "Mosinabre", "Female", "BSIT-MWA", "1st Year", 4.00));
        manager.add(new Student("2023-1034257", "Samantha Lorin", "Hidalgo", "Female", "BSArch", "3rd Year", 3.97));
        manager.add(new Student("2023-1020951", "Jayma Marie", "Magsino", "Female", "BSArch", "3rd Year", 3.96));
        manager.add(new StudentFullName("2024-1070039", "John Laurenz", "Senita", "Obrador", "Male", "BSCS-ML", "2nd Year", 3.7));
        while (true) {
            System.out.println("\n================ DNM University ===============");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students");
            System.out.println("6. Display All Students");
            System.out.println("7. Show Top 3 students");
            System.out.println("8. View the Total No. of Students");
            System.out.println("9. View My Account");
            System.out.println("10. Log-out");
            System.out.println("0. Exit");
            System.out.println("================================================");

            System.out.print("\nEnter your choice: ");
            int action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 1:
                    addStudent(scan);
                    break;

                case 2:
                    updateStudent(scan);
                    manager.showDetails();
                    break;

                case 3:
                    manager.showDetails();
                    System.out.print("\nEnter a number to delete: ");
                    int num = scan.nextInt();

                    manager.delete(num);
                    break;

                case 4:
                    System.out.print("Search for: ");
                    String search = scan.nextLine();
                    manager.search(search);
                    break;

                case 5:
                    sortStudent(scan);
                    break;

                case 6:
                    manager.showDetails();
                    break;

                case 7:
                    manager.topStudents();
                    break;

                case 8:
                    String[] genders = {"Male", "Female"};
                    String[] courses = {"BSArch", "BSCE", "BSCpE", "BSIT-MWA", "BSCS-ML"};
                    String[] years = {"1st Year", "2nd Year", "3rd Year", "4th Year"};
                    System.out.println("\n--------------- No. of Students -----------------");
                    
                    viewTotalNum("Gender", genders);
                    viewTotalNum("Courses", courses);
                    viewTotalNum("Years", years);
                    System.out.println("------------------------------------------------");
                    break;
                case 9:
                    System.out.println("\n=============== My Information ================");
                    user.showDetails();
                    System.out.println("================================================");
                    break;

                case 10:
                    startPage(scan);
                    break;
                default:
                    System.out.println("Invalid number! Please type a number between 0-10.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        startPage(scan);
    }
}
