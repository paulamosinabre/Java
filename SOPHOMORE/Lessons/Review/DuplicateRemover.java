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
        
        int noDupe[] = new int[size];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean checker = false;
            for(int j = 0; j < noDupe.length; j++){
                if(arr[i] == noDupe[j]){
                    checker = true;
                }
            }
            
            if(!checker){
                noDupe[count] = arr[i];
                count++;
            }
        }
        
        for(int i = 0; i < count; i++){
            System.out.print(noDupe[i] + " ");
        }
        
    }
}
