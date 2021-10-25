package com.chris.lessonsix;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCatching {

	public static void main(String[] args) {
		
		/*
		 * Mistakes are bound to happen in life - the same rule applies in Programming
		 * Sometimes you will create methods that you cannot guarantee will run
		 * 
		 * Exceptions should not be confused with an Error - An Error is
		 */

		// Now lets see this in action by looking at some exceptions that can occur....

		// Show Studetents what happens
		//int lookWhatHappens = "Fifty five";

		// Show students what happens
		//String[] movies = { "The Hangover", "Iron Man", "Harry Potter" };

		//ArrayList<String> list = new ArrayList<String>();
		//list.get(0);

		/*
		 * There are five keywords you should become familiar with while Exception
		 * Catching
		 * 
		 * TRY ---- When we identify that a method may give rise to an exception we
		 * contain it within what we call a "Try Block"
		 * 
		 * CATCH ---- Once the exception has been detected from within the TRY block, it
		 * needs to be caught by the system and this is done through CATCH Block. A
		 * CATCH must always be used in conjunction with a TRY
		 * 
		 * FINALLY ---- Sometimes we will have a function that needs to be run
		 * irrespective of whether or not the exception is thrown The Finally Block
		 * follows the try-catch block
		 * 
		 * So it we have a trilogy --- try-catch-finally
		 */
		
		// Lets see this with the use of a Scanner
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		try {
	
		int n = scanner.nextInt();
		System.out.println("Thank you for entering: " + n);
		} catch(InputMismatchException e) {
			System.out.println("Error " + e + "\nNumbers only please");
		} finally {
			System.out.println("Thank you for your input regardless");
		}
		
		
		
		
		
	}
}