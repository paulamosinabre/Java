package com.mycompany.taskmanagement;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> list;

    public TaskManager() {
        this.list = new ArrayList<>();
    }

    public void add(Task task) {
        this.list.add(task);
    }

    public void remove(int index) {
        if (index - 1 >= 0 && index - 1 < list.size()) {
            this.list.remove(index-1);
            System.out.println("Successfully removed.");
        } else {
            System.out.println("Invalid number!");
        }
    }

    public void edit(int index, String updatedTask) {
        if (index - 1 >= 0 && index - 1 < list.size()) {
            System.out.println("You successfully edited! from " + this.list.get(index-1).getTask() + " to " + updatedTask);
            this.list.get(index-1).setTask(updatedTask);  
        } else {
            System.out.println("Invalid number!");
        }
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ": " + list.get(i) + "\n");
            }
    }

    public void search(String search) {
        boolean found = false;
        
        for(Task task: list){
            if(task.getTask().equals(search)){
                System.out.println("Found: " + task);
                found = true;
            }
        }
        
        if(!found){
            System.out.println("Not found!");
        }
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
}
