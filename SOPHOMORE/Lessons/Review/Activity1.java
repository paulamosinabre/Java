package com.mycompany.ccdatrcl.activity1;

import java.util.Arrays;
import java.util.Scanner;

public class CCDATRCLActivity1 {

    public static void main(String[] args) {
        /*
        Enter array size: 5
        Enter elements: 1 2 3 4 5
        Enter rotation count: 2
        Rotated array: 4 5 1 2 3
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter elements: ");
            num[i] = scan.nextInt();
        }

        System.out.print("Enter rotation: ");
        int rotation = scan.nextInt();
        int[] rotated = new int[size];

        // Step 5: Place elements in new positions
        for (int i = 0; i < num.length; i++) {
            int newIndex = (i + rotation) % size; // shifting right
            rotated[newIndex] = num[i];
        }

        // Step 6: Print rotated array
        System.out.print("Rotated array: ");
        for (int numbers : rotated) {
            System.out.print(numbers + " ");
        }
    }
}
