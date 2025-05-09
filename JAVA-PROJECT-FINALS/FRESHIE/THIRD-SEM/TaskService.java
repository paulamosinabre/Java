package com.mycompany.taskmanagement;

import java.util.ArrayList;

public class TaskService {

    /*
    addTask(AbstractTask task)
removeTask(UUID id)
updateTask(UUID id, AbstractTask updatedTask)
searchTasks(String keyword)
listTasksByStatus(TaskStatus status)
listTasksByCategory(String category)
getAllTasks()

     */
    
    private ArrayList<String> taskList;
    
    public TaskService(){
        this.taskList = new ArrayList<>();
    }
    public void addTask(String task) {
        this.taskList.add(task);
    }

    public void removeTask() {
        
    }

    public void updateTask() {

    }

    public void searchTask() {

    }

    public void listTasksByStatus() {

    }
    
    public void listTasksByCategory(){
    }
    
    public void getAllTasks(){
        
    }
}
