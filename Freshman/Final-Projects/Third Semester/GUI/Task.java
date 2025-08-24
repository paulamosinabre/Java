
package com.mycompany.taskmanagementsystem;

public class Task {

    private String task, category, status, priority, date;

    public Task(String task, String category, String status, String priority, String date) {
        this.task = task;
        this.category = category;
        this.priority = priority;
        this.date = date;
    }

    public String getTask() { return task; }
    
    public String getCategory() { return category; }
    
    public String getStatus() { return status; }
    
    public String getPriority() { return priority; }
    
    public String getDate() { return date; }
    
    public String getTypeOrSubject(){
        return "";
    }

    public void setTask(String task) { this.task = task; }

    public void showDetails() {
        System.out.println("Task: " + task
                + "\nCategory: " + category
                + "\nPriority: " + priority
                + "\nDate: " + date); 
    }
    @Override
    public String toString() {
        return "               " + task + "          " + category + "         " + priority + "      " + date;
    }
}


