package com.mycompany.samplecodes;

import java.util.Scanner;
import java.util.ArrayList;

public class SampleCodes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        
        while(true){
            String nameList = scan.nextLine();
            
            names.add(nameList);
            if(nameList.equals("")){
                System.out.println(names.get(2));
                break;
            }
        }

    }
}
