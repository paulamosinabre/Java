package com.mycompany.stack;

class Stack {
    final static int MAXSIZE = 8;
    
    public static int stack[] = new int[MAXSIZE];
    
    //keeps track of the last pushed element
    public static int top = -1;
    
    public static int isempty(){
        if(top == -1){
            return -1;
        } else 
            return 0;
    }
    
    public static int isfull(){
        if(top == MAXSIZE)
            return 1;
        else 
            return 0;
    }
    
    public static int push(int data){
        if(isfull() !=1 ){
            top = top + 1;
            stack[top] = data;
        } else {
            System.out.print("Could not insert data. Stack is already full!");
        }
        return data;
    }
    
    public static int pop(){
        int data = 0;
        if(isempty() != 1){
            data = stack[top];
            top = top - 1;
            return data;
        } else {
            System.out.println("Could not retrieve data");
        }
        return data;
    }
    public static void main(String[] args) {
        push (44);
        push (10);
        push (62);
        push (123);
        push (15);
        
        System.out.println("Stack Elements: ");
        for(int i = 0; i < MAXSIZE; i++){
            System.out.print(stack[i] + " ");
        }
        
        System.out.println("Stack Elements: ");
        for(int i = 0; i < MAXSIZE; i++){
            System.out.print(stack[i] + " ");
        }
        
        System.out.println("\nElements popped: ");
        while(isempty() != 1) {
            int data = pop();
            System.out.print(data + " ");
        }
    }
}
