package ifStatements;

import java.util.Scanner;

public class IfStatementsCode {
	
	public void run()
	{
		// The code for your program goes here...
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name please");
		
		// Read name from user
		String name = userInput.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("How old are you?");
		int age = userInput.nextInt();
		
		// If statements -- work the same way as in JavaScript
		// Fresher's party
		if(age < 18) {
			System.out.println("You cannot go to the Freshers' night out.");
		}
		else if (age >=25) {
			System.out.println("You are allowed to go, but should you, really?");
		}
		else {
			System.out.println("You can go to the Freshers' night out.");
		}
		
		// Doing things properly
		userInput.close();
		
	}

}
