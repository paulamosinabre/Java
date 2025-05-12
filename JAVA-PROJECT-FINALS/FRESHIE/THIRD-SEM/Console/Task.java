
package com.mycompany.taskmanagement;

import java.util.ArrayList;


public class Task {
    private ArrayList<String> taskList;  
    private ArrayList<String> categoryList;
    private ArrayList<String> priorityList;
    private ArrayList<String> dateList;
    
    public Task(){
        taskList = new ArrayList<>();
        categoryList = new ArrayList<>();
        priorityList = new ArrayList<>();
        dateList = new ArrayList<>();    
    }
    
    public void add(String task){
        this.taskList.add(task);
    }
    
    public ArrayList getTodoList(){
        return taskList;
    }
    public void print() {
        for (int i = 0; i < this.taskList.size(); i++) {
            System.out.println((i + 1) + ": " + this.taskList.get(i) + 
                    "Category: " + this.categoryList.get(i) + 
                    "Priority: " + this.priorityList.get(i) + 
                    "Date: " + this.dateList.get(i));
        }
    }
 
    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.taskList.size()) {
            return;
        }
 
        this.taskList.remove(index);
    }
    
    public void edit(int index, String updatedTask){
        if (index - 1< 0 || index - 1 >= this.taskList.size()) {
            return;
        }
        this.taskList.set(index, updatedTask);
    }
    
    public void setCategory(String category){
        this.categoryList.add(category);
    }
    
    public void setPriority(String priority){
        if (priority.equalsIgnoreCase("low") || priority.equalsIgnoreCase("medium") || priority.equalsIgnoreCase("high")){
            return;
        }
        
        this.priorityList.add(priority);
    }
    
    public void setDate(String date){
        this.dateList.add(date);
    }
    
    public void search(String search){
        if(this.taskList.contains(search)){
            int index = this.taskList.indexOf(search);
            System.out.println(("Found! " + 
                    "\nTask: " + this.taskList.get(index)) +
                    "\nCategory: " + this.categoryList.get(index) +
                    "\nPriority: " + this.priorityList.get(index) +
                    "\nDate: " + this.dateList.get(index));
        } else {
            System.out.println("There are no task " + search);
        }
    }
}
