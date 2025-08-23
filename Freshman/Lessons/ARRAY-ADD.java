
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            
            numbers[i] = num;
        }
        System.out.print("The numbers in array are " + Arrays.toString(numbers));
        
    }
}
