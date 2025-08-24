package com.mycompany.taskery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;

class Registration {

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

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }
}

// OOP Class: Task.java
class Task implements Serializable {

    private String task, category, priority, date;

    public Task(String task, String category, String priority, String date) {
        this.task = task;
        this.category = category;
        this.priority = priority;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public String getDate() {
        return date;
    }

    public void showDetails() {
        System.out.println("Task: " + task
                + "\nCategory: " + category
                + "\nPriority: " + priority
                + "\nDate: " + date);
    }

    @Override
    public String toString() {
        return task + " | " + category + " | " + priority + " | " + date;
    }
}

class PersonalTask extends Task {

    private String type;

    public PersonalTask(String task, String category, String priority, String date, String type) {
        super(task, category, priority, date);
        this.type = type;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Type: " + type);
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: " + type;
    }
}

class SchoolTask extends Task {

    private String subject;

    public SchoolTask(String task, String category, String priority, String date, String subject) {
        super(task, category, priority, date);
        this.subject = subject;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return super.toString() + " | Subject: " + subject;
    }
}

// OOP Class: TaskManager.java
class TaskManager {

    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}

// GUI: FrontPage.java
class FrontPage extends JFrame {

    public FrontPage() {
        JButton btnLogin = new JButton("Login");
        JButton btnSignup = new JButton("Sign Up");
        btnLogin.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });
        btnSignup.addActionListener(e -> {
            new SignUpPage().setVisible(true);
            dispose();
        });

        setLayout(new java.awt.FlowLayout());
        add(btnLogin);
        add(btnSignup);
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

// GUI: SignUpPage.java
class SignUpPage extends JFrame {

    private static ArrayList<Registration> users = new ArrayList<>();
    private JTextField emailField = new JTextField(15);
    private JTextField firstField = new JTextField(15);
    private JTextField lastField = new JTextField(15);
    private JTextField userField = new JTextField(15);
    private JPasswordField passField = new JPasswordField(15);

    public SignUpPage() {
        setLayout(new GridLayout(7, 2));
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("First Name:"));
        add(firstField);
        add(new JLabel("Last Name:"));
        add(lastField);
        add(new JLabel("Username:"));
        add(userField);
        add(new JLabel("Password:"));
        add(passField);

        JButton signUp = new JButton("Sign Up");
        signUp.addActionListener(e -> {
            Registration reg = new Registration(
                    emailField.getText(), firstField.getText(),
                    lastField.getText(), userField.getText(),
                    new String(passField.getPassword())
            );
            users.add(reg);
            JOptionPane.showMessageDialog(this, "Account Created! Login now.");
            new LoginPage().setVisible(true);
            dispose();
        });
        add(signUp);

        JButton back = new JButton("Back");
        back.addActionListener(e -> {
            new FrontPage().setVisible(true);
            dispose();
        });
        add(back);

        setTitle("Sign Up");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static ArrayList<Registration> getUsers() {
        return users;
    }
}

// GUI: LoginPage.java
class LoginPage extends JFrame {

    private JTextField userField = new JTextField(15);
    private JPasswordField passField = new JPasswordField(15);

    public LoginPage() {
        setLayout(new java.awt.GridLayout(4, 2));
        add(new JLabel("Username:"));
        add(userField);
        add(new JLabel("Password:"));
        add(passField);

        JButton login = new JButton("Login");
        login.addActionListener(e -> {
            for (Registration user : SignUpPage.getUsers()) {
                if (user.getUsername().equals(userField.getText())
                        && user.getPassword().equals(new String(passField.getPassword()))) {
                    new Home(user).setVisible(true);
                    dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Invalid credentials");
        });
        add(login);

        JButton back = new JButton("Back");
        back.addActionListener(e -> {
            new FrontPage().setVisible(true);
            dispose();
        });
        add(back);

        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Home extends JFrame {

    private Registration currentUser;
    private JPanel taskPanel;

    public Home(Registration user) {
        this.currentUser = user;

        JButton btnAdd = new JButton("Add Task");
        JButton btnAccount = new JButton("Account Page");
        JButton btnLogout = new JButton("Logout");

        btnAdd.addActionListener(e -> openTaskDialog(null));

        btnAccount.addActionListener(e -> {
            new AccountPage(currentUser).setVisible(true);
            dispose();
        });

        btnLogout.addActionListener(e -> {
            new FrontPage().setVisible(true);
            dispose();
        });

        // Top buttons
        JPanel topPanel = new JPanel();
        topPanel.add(btnAdd);
        topPanel.add(btnAccount);
        topPanel.add(btnLogout);

        // Task display panel
        taskPanel = new JPanel(new GridBagLayout()); // Use GridBagLayout for taskPanel
        refreshTaskList();

        JScrollPane scrollPane = new JScrollPane(taskPanel);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setTitle("Home");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void refreshTaskList() {
        taskPanel.removeAll();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.insets = new Insets(2, 2, 2, 2); // Small gap around tasks

        ArrayList<Task> tasks = currentUser.getTaskManager().getTasks();
        for (Task task : tasks) {
            JPanel taskRow = createTaskPanel(task);
            taskPanel.add(taskRow, gbc);
            gbc.gridy++; // Move to the next row
        }

        // Add a filler component to push tasks to the top
        gbc.weighty = 1.0;
        taskPanel.add(new JPanel(), gbc);

        taskPanel.revalidate();
        taskPanel.repaint();
    }

    private JPanel createTaskPanel(Task task) {
        JPanel taskRow = new JPanel(new GridBagLayout());
        taskRow.setBackground(Color.WHITE);

        JLabel taskLabel = new JLabel(task.toString());
        JButton optionsButton = new JButton("...");
        optionsButton.setPreferredSize(new Dimension(30, 20));

        GridBagConstraints gbcLabel = new GridBagConstraints();
        gbcLabel.gridx = 0;
        gbcLabel.gridy = 0;
        gbcLabel.weightx = 1.0;
        gbcLabel.fill = GridBagConstraints.HORIZONTAL;
        gbcLabel.anchor = GridBagConstraints.LINE_START;

        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.gridx = 1;
        gbcButton.gridy = 0;
        gbcButton.weightx = 0.0;
        gbcButton.anchor = GridBagConstraints.EAST;
        gbcButton.insets = new Insets(0, 5, 0, 0);

        optionsButton.addActionListener(e -> openTaskDialog(task));

        taskRow.add(taskLabel, gbcLabel);
        taskRow.add(optionsButton, gbcButton);

        return taskRow;
    }
    
    private void openTaskDialog(Task taskToEdit) {
        JPanel taskInputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        taskInputPanel.setBackground(new Color(245, 245, 245));

        JTextField taskField = new JTextField(10);
        JTextField dateField = new JTextField(7);
        JTextField extraField = new JTextField(8); // For type/subject

        String[] categories = {"Personal", "Work", "School"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        String[] priorities = {"Low", "Medium", "High"};
        JComboBox<String> priorityBox = new JComboBox<>(priorities);

        if (taskToEdit != null) {
            taskField.setText(taskToEdit.getTask());
            dateField.setText(taskToEdit.getDate());
            categoryBox.setSelectedItem(taskToEdit.getCategory());
            priorityBox.setSelectedItem(taskToEdit.getPriority());

            if (taskToEdit instanceof PersonalTask) {
                extraField.setText(((PersonalTask) taskToEdit).toString().split("Type: ")[1]);
            } else if (taskToEdit instanceof SchoolTask) {
                extraField.setText(((SchoolTask) taskToEdit).toString().split("Subject: ")[1]);
            }
        }

        taskInputPanel.add(new JLabel("Task:"));
        taskInputPanel.add(taskField);
        taskInputPanel.add(new JLabel("Date:"));
        taskInputPanel.add(dateField);
        taskInputPanel.add(new JLabel("Category:"));
        taskInputPanel.add(categoryBox);
        taskInputPanel.add(new JLabel("Priority:"));
        taskInputPanel.add(priorityBox);
        taskInputPanel.add(new JLabel("Type/Subject:"));
        taskInputPanel.add(extraField);

        taskPanel.add(taskInputPanel, 0);
        taskPanel.revalidate();
        taskPanel.repaint();

        // Define the save logic in a reusable method
        Runnable saveTask = () -> {
            String taskName = taskField.getText().trim();
            String date = dateField.getText().trim();
            String category = (String) categoryBox.getSelectedItem();
            String priority = (String) priorityBox.getSelectedItem();
            String extra = extraField.getText().trim();

            Task newTask;
            if ("Personal".equalsIgnoreCase(category)) {
                newTask = new PersonalTask(taskName, category, priority, date, extra);
            } else if ("School".equalsIgnoreCase(category)) {
                newTask = new SchoolTask(taskName, category, priority, date, extra);
            } else {
                newTask = new Task(taskName, category, priority, date);
            }

            if (taskToEdit != null) {
                currentUser.getTaskManager().removeTask(taskToEdit);
            }

            currentUser.getTaskManager().addTask(newTask);
            taskPanel.remove(taskInputPanel);
            refreshTaskList();
        };

        // Add key listener to each input field
        KeyAdapter enterKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveTask.run();
                }
            }
        };

        taskField.addKeyListener(enterKeyListener);
        dateField.addKeyListener(enterKeyListener);
        extraField.addKeyListener(enterKeyListener);
    }

}



class AccountPage extends JFrame {

    public AccountPage(Registration user) {
        setLayout(new java.awt.GridLayout(6, 1));
        add(new JLabel("Email: " + user.getEmail()));
        add(new JLabel("First Name: " + user.getFirstName()));
        add(new JLabel("Last Name: " + user.getLastName()));
        add(new JLabel("Username: " + user.getUsername()));

        JButton btnBack = new JButton("Back to Home");
        btnBack.addActionListener(e -> {
            new Home(user).setVisible(true);
            dispose();
        });
        add(btnBack);

        setTitle("Account Page");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

// OOP Class: TaskManagementSystem.java (Main Entry)
public class Taskery {

    public static void main(String[] args) {
        new FrontPage().setVisible(true);
    }
}
