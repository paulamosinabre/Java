
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
        int max = arr[0], min = arr[0];
      
      for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}

