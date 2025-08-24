
package com.mycompany.practice;

import java.util.Scanner;
public class Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a size: ");
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter an element: ");
            arr[i] = scan.nextInt();
        }
        
        //odd or even
        int odd[] = new int[size];
        int even[] = new int[size];
        int oddCount = 0, evenCount =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even[evenCount] = arr[i];
                evenCount++;
            } else {
                odd[oddCount] = arr[i];
                oddCount++;
            }
        }
        
        System.out.println("\nEven");
        
        for(int i = 0; i < evenCount; i++){
            System.out.print(even[i] + " ");
        }
        System.out.println("\nOdd");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
