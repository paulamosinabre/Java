import java.util.Scanner;

class Main{
	static Scanner scan = new Scanner(System.in);
	static String password;
	static double num1, num2;
	static Calculator calc = new Calculator(num1, num2);

	public static void main(String[] args){
		System.out.print("Enter a password: ");
		password = scan.nextLine();
		calc.setPasscode(password);
		System.out.println("Access Granted!");	
		numberChooser();
	}
	
	public static void numberChooser(){
		while(true){
			try {
			System.out.print("\nEnter the first number: ");
			num1 = scan.nextDouble();
			
			System.out.print("Enter the second number: ");
			num2 = scan.nextDouble();
			scan.nextLine();
			calculate();

			} catch (Exception e) {
			System.out.print("Please type a number.");
			scan.nextLine();
			}
		}
	}
	public static void calculate(){
		try {

			System.out.println("\nChoose an action:");
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Multiply");
			System.out.println("4 - Divide");
			System.out.println("5 - Power");
			System.out.println("6 - Stop");
			System.out.print("Enter your choice:");
			int actionChooser = scan.nextInt();
			scan.nextLine();
			
			switch(actionChooser){
				case 1: 
					Calculator add = new Addition(num1, num2);
					add.getResult();
					numberChooser();
					break;
				case 2: 
					Calculator sub = new Subtraction(num1, num2);
					sub.getResult();
					numberChooser();
					break;
				case 3: 
					Calculator multiply = new Multiplication(num1, num2);
					multiply.getResult();
					numberChooser();
					break;
				case 4: 
					Calculator divide = new Division(num1, num2);
					divide.getResult();
					break;
				case 5: 
					System.out.print("\nEnter your password to unlock the operation: ");
					String pass = scan.nextLine();
		
					if(calc.unlockSecret(pass)){
						System.out.println("Access Granted!");
						Calculator power = new Power (num1, num2);
						power.getResult();
					} else {
						System.out.println("Access Denied!");
					}
					numberChooser();
					break;
				case 6: 
					System.exit(0);
				default:
					System.out.println("Please choose a number between 1-6 only");
					numberChooser();
			}
		} catch(Exception e){
			System.out.println("Please choose a number!");
			numberChooser();
		}	
	}
	
}

class Calculator {
	private double num1, num2;
	private String passcode;
	private boolean isSecretUnlocked;

	public Calculator(double num1, double num2){
	this.num1 = num1;
	this.num2 = num2;
	this.isSecretUnlocked = false;
	}
	
	public double getNum1(){ return num1; }
	public double getNum2(){ return num2; }
    public void getResult() { System.out.println(""); }
	public void setPasscode(String passcode){
		this.passcode = passcode;
	}

	public String getPasscode(){
		return passcode;
	}

	public boolean unlockSecret(String passcode){
		if(getPasscode().equals(passcode)){
			isSecretUnlocked = true;
			return true;
		}
		return false;
	}

}

class Addition extends Calculator{
	
	public Addition(double num1, double num2){
		super(num1, num2);
	}

	public void getResult(){
		System.out.println("Result: " + (getNum1() + getNum2()));
	}
}

class Subtraction extends Calculator{
	public Subtraction(double num1, double num2){
		super(num1, num2);
	}

	public void getResult(){
		System.out.println("Result: " + (getNum1() - getNum2()));
	}
}

class Multiplication extends Calculator{
	public Multiplication(double num1, double num2){
		super(num1, num2);
	}

	public void getResult(){
		System.out.println("Result: " + (getNum1() * getNum2()));
	}
}

class Division extends Calculator{
	public Division(double num1, double num2){
		super(num1, num2);
	}

	public void getResult(){
		System.out.println("Result: " + (getNum1() / getNum2()));
	}
}

class Power extends Calculator{
	public Power (double num1, double num2){
		super(num1, num2);
	}

	public void getResult(){
		System.out.println("Result: " + Math.pow(getNum1(), getNum2()));
	}
}

