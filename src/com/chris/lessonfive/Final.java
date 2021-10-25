package com.chris.lessonfive;

public class Final {

	/* We have gone through Access Modifiers and should be familiar with public 
	 * and private class's
	 * 
	 * The Final keyword is  used with variables, methods and classes*/
	
	//Variables - We use the final keyword to create constants. 
	//Once initialised it will never change 
	
	public static final String CONSTANT = "You can't change me";
	public static final double PI = 3.141592653589793; 
	
	//Static Initialiser
	public static final double EXPONENTIAL;
	
	
	/*A static initializer is a block of code that runs when a class is loaded, 
	 * before any other code can use the class,
	 *  so it’s a great place to initialize a static final variable */
	
	static {
		EXPONENTIAL = 2.71828;
	}
	
	
	/*This String will always be set to "You can't change me", we can not use methods such as the 
	 * setters we created to change this
	 * 
	 * Pi is a set number - it will never change and we should make sure it doesnt change 
	 * the final keyword is the best preventitive feature to ensure that the pi constant is not changed 
	 * during our time coding 
	 * 
	 *Also notice the naming convention - if you are to use constants remember to make sure that 
	 *the variable name is all uppercase
	 * 
	 * 
	 * As this is now a constant, it if often common place to add the static keyword to a 'constant*/
	
	
	
	//Method - To prevent Method Overriding
	
	/* We have previously learnt that we can Override method in our Polymorphism lesson 
	 * when we declare a class final, we can not override this 
	 * 
	 * Lets Create a method - TASK CREATE A FINAL METHOD */
	
	public static final void noOverridingHere() {
		int x = 10; 
		while (x >= 0) {
			System.out.println("Countdown: " + x);
			x--;	
			}
		}
	}

//Classes -A final class means you can not extend the class, this prohibits inheritence

final class ThisIsAFinalClass {
	
	//Anything in here is cannot be therefore not inheritable
}

