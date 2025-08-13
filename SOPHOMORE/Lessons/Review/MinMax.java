// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter storage size: ");
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        int max = 0, min = 0;
      /*
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1-i; j++){
                if(arr[j] > arr[j + 1]){
                    max = arr[j];
                } 
                
                if(arr[j] < arr[j+1]){
                    min = arr[j];
                }
            }
        }
        */
      for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[0]){
                max = arr[i];
            }
            
            if(arr[i] < arr[0]){
                min = arr[i];
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}

