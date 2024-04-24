package Functions;

import java.util.Scanner;

public class FunctionsDemo {
	// Class level variables - visible by all the
	// Methods
	// Class-level scanner
	private Scanner s = new Scanner(System.in);
	
	// Class-level variables
	private String name = "";
	
	
	// Signature: public/private, return type, name(param)
	public void hello() {
		System.out.println("What is your name?");
		name = s.nextLine();
		System.out.println("How old are you?");
		int age = s.nextInt();
		
		// Check under/over 18 without return
		ageCheck(age);
		
		System.out.println("let's add two integers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = add(a,b);
		System.out.println(c);
		
		System.out.println("let's add two doubles");
		double a1 = s.nextDouble();
		double b1 = s.nextDouble();
		double c1 = add(a1,b1);
		System.out.println(c1);
	}

	
	// Check over/under 18 (no return)
	public void ageCheck(int userAge) {
		
		System.out.println("Hello, " + name);
		
		if (userAge >= 18) {
			System.out.println("You can vote in the general election.");
		}
		else
		{
			System.out.println("You cannot vote in the general election.");
		}
	}
	
	
	// Add two numbers and return the result
	// This takes two integers in and returns an integer
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// Function overloading
	public double add(double num1, double num2) {
		return num1 + num2;
	}
}
