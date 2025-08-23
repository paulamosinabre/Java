
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
        System.out.print("Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(num[i] + " ");
            
        }
        System.out.print("\nPositive Element: ");
        for(int i = 0; i < size; i++){
            if(num[i] > 0){
                System.out.print(num[i] + " ");
            } 
        }
        System.out.print("\nNegative Element: ");
        for(int i = 0; i < size; i++){
            if(num[i] < 0){
                System.out.print(num[i] + " ");
            } 
        }
    }
}
