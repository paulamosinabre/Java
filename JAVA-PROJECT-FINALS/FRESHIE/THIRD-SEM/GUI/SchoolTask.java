package com.mycompany.taskmanagementsystem;

public class SchoolTask extends Task {

    private String subject;

    public SchoolTask(String task, String category, String status, String priority, String date, String subject) {
        super(task, category, status, priority, date);
        this.subject = subject;
    }

    @Override
    public String getTypeOrSubject() {
        return subject;
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

