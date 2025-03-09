
package com.mycompany.samplecodes;

import java.util.Scanner;
import java.util.ArrayList;

public class SampleCodes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList<>();
        
        while(true){
            int numList = scan.nextInt();
            
            num.add(numList);
            
            if(numList == 0){
                break;
            }
            
        }
        System.out.println(num.get(1) + num.get(2));
    }
}
