/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author NUD-Student
 */

import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        scan.nextLine();
        
        int[] num = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a number: ");
            num[i] = scan.nextInt();
            
        }
        
        System.out.print("\nOriginal Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(num[i] + "\t");
            
        }
        
        int[] posArray = new int[size];
        int[] negArray = new int[num.length];
        int posCount = 0, negCount = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                posArray[posCount] = num[i];
                posCount++;
            } else {
                negArray[negCount] = num[i];
                negCount++;
            }
        }
        System.out.print("\nPositive Element: ");
        for(int i = 0; i < posCount; i++){
            System.out.print(posArray[i] + "\t");
        }
        System.out.print("\nNegative Element: ");
        for(int i = 0; i < negCount; i++){
            System.out.print(negArray[i] + "\t");
        }
    }
}
