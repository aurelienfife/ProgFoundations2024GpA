package FileHandlingDemo;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileHandlingCode {

	// Main code for the demo
	public void run() {
		
		// Create a file reference
		File f = new File("temperatures.csv");
		
		try {
			// This is unsafe code that Java won't allow
			// on its own.
			Scanner s = new Scanner(f);
			
			// Every line is a String
			// While a next line is available in the file
			while(s.hasNextLine()) {
				// nextLine() is an iterator pattern
				// It provides you with the next line
				// And moves our current in the stream accordingly
				String currentLine = s.nextLine();
				
				System.out.println(currentLine);
			}
			
			// No longer needed: close file
			s.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file hasn't been found. Quitting.");
			e.printStackTrace();
		}
		
	}
}
