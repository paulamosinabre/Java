import java.util.Scanner;

class Main {
    static String passcode;
    static Calculator calc = new Calculator();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter a passcode: ");
		passcode = scan.nextLine();
		calc.setPasscode(passcode);
		System.out.println("Access Granted!");
		calculate();
	}

	public static void calculate(){
	    
		while(true){
		System.out.print("\nEnter the first number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("\nChoose an operation: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.println("5 - Power");
		System.out.println("6 - Stop");
		
		System.out.print("Enter your choice: ");
		int op = scan.nextInt();
		scan.nextLine();
		
	    switch(op){
			case 1:
				System.out.println("\nResult: " + num1 + " + " + num2 + " = " + calc.addition(num1, num2));
				break;
			
			case 2:
				System.out.println("\nResult: " + num1 + " - " + num2 + " = " + calc.subtraction(num1, num2));
				break;

			case 3:
				System.out.println("\nResult: " + num1 + " * " + num2 + " = " + calc.multiplication(num1, num2));
				break;
			
			case 4:
				System.out.println("\nResult: " + num1 + " / " + num2 + " = " + calc.division(num1, num2));
				break;
			case 5:
				System.out.print("\nEnter the passcode to unlock the secret operation: ");
				String pass = scan.nextLine();
				
				if(calc.unlockSecret(pass)){
					System.out.println("Correct password!");
					System.out.println("\nResult: " + num1 + " ** " + num2 + " = " +calc.division(num1, num2));
				} else {
					System.out.println("Access denied! You can only try the basic operations");
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Please choose a number between 1-6");
			}
		}
	}
}

class Calculator{
	private boolean isSecretUnlocked;
	private String passcode;

	public Calculator(){
	this.isSecretUnlocked = false;
	}

	public void setPasscode(String passcode){ this.passcode = passcode; }
	
	public String getPasscode() { return this.passcode; }

	public double addition(double num1, double num2){
		return num1 + num2;
	}
	
	public double subtraction(double num1, double num2){
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2){
		return num1 * num2;
	}

	public double division(double num1, double num2){
		return num1 / num2;
	}

	public double power(double num1, double num2){
		return Math.pow(num1, num2);
	}

	public boolean unlockSecret(String passcode){
	    if(getPasscode().equals(passcode)){
	        isSecretUnlocked = true;
	        return true;
	    }
		return false;
	}
}
