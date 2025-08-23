

package com.mycompany.main;


import java.util.Scanner;

public class Main{

	static double num1, num2;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		numberChooser();	
	}

	public static void numberChooser(){
		while(true){
			try{
				System.out.println("\n=======Choose a number=======");
				System.out.print("Enter the first number: ");
				num1 = scan.nextDouble();

				System.out.print("Enter the second number: ");
				num2 = scan.nextDouble();
				scan.nextLine();
				calculate();

			} catch (Exception e) {
				System.out.println("Please type a number!");
				scan.nextLine();
			}

		}
	}

	public static void calculate(){
		System.out.println("\n=========Calculator=========");
		System.out.println("Choose an action: ");
		System.out.println("1 - Add ");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide ");
		System.out.println("5 - Stop");
		
		System.out.print("\nEnter your choice: ");
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
				numberChooser();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("\nPlease choose between 1-5");
				break;
			
		}
		
	}

}

class Calculator {
	private double num1, num2;

	public Calculator(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1(){ return num1; }
	public double getNum2(){ return num2; }

	public void getResult(){
		System.out.println("");
	}
}

class Addition extends Calculator {
	
	public Addition(double num1, double num2){
		super(num1, num2);
	}
	
	public void getResult(){
		System.out.println("Result: " + (getNum1() + getNum2()));
	}
}

class Subtraction extends Calculator {

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
		System.out.println("Result: "  + (getNum1() * getNum2()));

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
