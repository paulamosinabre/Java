  
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter storage size: ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        
        //input
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter a value: ");
            arr[i] = input.nextInt();
            
        }
        
        //process
        int[] posArray = new int[limit];
        int[] negArray = new int[arr.length];
        int posCount = 0, negCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                posArray[posCount] = arr[i];
                posCount++;
            } else {
                negArray[negCount] = arr[i];
                negCount++;
            }
        }
        
        //output
        System.out.print("\nOriginal Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
            
        }
        
        System.out.print("\nPositive Element: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(posArray[i] + "\t");
        }
        
        System.out.print("\nNegative Element: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(negArray[i] + "\t");
        }
    }
}
