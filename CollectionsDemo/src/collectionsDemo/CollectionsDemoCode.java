package collectionsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CollectionsDemoCode {

	
	public void runDemo() {
	
		// Create a list of Strings
		ArrayList<String> listOfStrings = new ArrayList<String>();
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		
		// Create the scanner
		Scanner s = new Scanner(System.in);
		
		// Add some strings to the list
		listOfStrings.add("rabbit");
		listOfStrings.add("banana");
		listOfStrings.add("mouse");
		listOfStrings.add("hamster");
		
		// listName[index];   NO
		// listName.get(index);
		// listName.set(index, value);
		
		// Third item in the list
		System.out.println(listOfStrings.get(2));
		
		// The second is not an animal, let's change it!
		listOfStrings.set(1, "rat");
		
		// Insert an item
		listOfStrings.add(2, "gila monster");
		
		// Example of loop through the list: for loop
		for (int i=0; i < listOfStrings.size(); i++) {
			System.out.println(i + " - " + listOfStrings.get(i));
		}
	
		
		// While loop
		
		Boolean exit = false;
		
		while(!exit) {
			System.out.println("Enter a int or -1 to stop");
			int userInput = s.nextInt();
			
			if(userInput == -1) {
				exit = true;
			}
			else {
				listOfIntegers.add(userInput);
			}
		}
		
		// Same loop this time - for each
		for (int num : listOfIntegers) {
			System.out.println(num);
		}
		
		
		// Hash map - like a dictionary
		// Create a zoo
		// key: animal name (String)
		// value: count (Integer)
		
		HashMap<String, Integer> zoo = new HashMap<String, Integer> ();
		
		// Every animal in the list above is in the zoo
		for (int i =0; i<listOfStrings.size(); i++) {
			// Get the name of the animal from the list
			String animalName = listOfStrings.get(i);
			
			System.out.println("How many " + animalName + "s are in the zoo?");
			int animalCount = s.nextInt();
			
			zoo.put(animalName, animalCount);
		}
		
		// Display all the entries in the map
		// In order to iterate through the map we need
		// To go through the "Entry" objects
		// Entry follows the same <K,V> format as the HashMap itself
		
		for(Entry<String, Integer> item: zoo.entrySet()) {
			System.out.println("There are " + item.getValue() + " " + item.getKey() + "s in the zoo.");
		}
		
		s.close();
	}
	
}
