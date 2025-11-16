
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        while (true){
            System.out.print("Enter a number: ");
            int num =scan.nextInt();
            
            if (num <= 0) break;
            
            int factorial = 1;
            for(int i = num; i >= 1; i--){
                
                factorial *= i;
                if(i > 1)
                    System.out.print(i + " * ");
                else
                    System.out.print(i + " = " + factorial);
            }
            System.out.println("");
        }
    }
}
