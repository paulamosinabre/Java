
package com.mycompany.taskmanagement;

import java.util.UUID;

abstract public class Task {
    String id, title, dueDate, status, category, priority;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void updateTask() {
        System.out.println("Updated: ");
    }
    
    public void markAsDone(){
        System.out.println("Done!");
    }
    
    abstract void executeTask();
   
}
