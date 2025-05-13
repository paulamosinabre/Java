package com.mycompany.taskmanagement;

import java.util.ArrayList;

public class Task {

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
    
    public void setTask(String task){
        this.task = task;
    }
    @Override
    public String toString() {
        return "Task: " + task
                + "\nCategory: " + category
                + "\nPriority: " + priority
                + "\nDate: " + date;
    }
}
