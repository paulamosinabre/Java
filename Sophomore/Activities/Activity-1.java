package com.mycompany.main;

import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the storage size: ");
        int size = scan.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element value: ");
            arr[i] = scan.nextInt();
        }
        
        //Output
        System.out.println("Original Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(" ");
        
        //sorting
        System.out.println("Sorted Array: ");
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(" ");   
        
        //searching
        System.out.print("Search element: ");
        int target = scan.nextInt();
        
        boolean found = false;
         
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                found = true;
            }
        }
        
        if(!found){
            System.out.println("Result: Element " + target + " not found.");    
        } else {
            System.out.println("Result: Element " + target + " found.");
        }
        
    }
}
