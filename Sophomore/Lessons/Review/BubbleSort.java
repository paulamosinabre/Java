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
        
        //process
        int pos[] = new int[size];
        int neg[] = new int[size];
        int posCount = 0, negCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                pos[posCount] = arr[i];
                posCount++;
            } else {
                neg[negCount] = arr[i];
                negCount++;
            }
        }
        // sorting
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        //reverse
        
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        //output
        System.out.println("\nArray: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nPositive: ");
        for(int i = 0; i < posCount; i++){
            System.out.print(pos[i] + " ");
        }
        
        System.out.println("\nNegative: ");
        for(int i = 0; i < negCount; i++){
            System.out.print(neg[i] + " ");
        }
        
    }
}
