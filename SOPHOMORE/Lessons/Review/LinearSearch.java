
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
        System.out.print("Search for? ");
        int search = scan.nextInt();
        
        boolean found = false;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(search == arr[i]){
                found = true;
                index = i;
            } 
        }
        
        if(found){
            System.out.println(search + " is found at index " + index);
        } else {
            System.out.println(search + " is not in the array");
        }
        
        
    }
}
