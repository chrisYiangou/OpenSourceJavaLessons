package com.chris.lessonthree;

public class Iteration {

	// We have now gone over Conditionals
	// This includes IF, ELSE and SWITCH keywords
	// Now we need to understand how Iterative work

	// Iterative's work as loops (and often called loops)
	// There are two types of loop in Java, WHILE, DO-WHILE AND FOR

	// THE WHILE LOOP
	// While x is active, y will continuously happen
	// Lets see this in action

	public static void loopWithMe() {
		while (1 == 1) {
			System.out.println("Come Loop With MEEEEEE");
		}
	}

	// TASK: What will happen if I ran this loop
	// How would I fix it to only print five time
	
	
	public static void oneHundredPuppies() {
		int x = 1;
		boolean needMoreDogs = true;

		while (needMoreDogs == true) {
			System.out.println("WE NEED MORE PUPPIES");
			x++;

			if (x > 100) {
				needMoreDogs = false;
				System.out.println("Okay that's enough");
			}
		}

	}
	// Do - While loops
	// A Do-While loop is largely the same as a While loop
	
	// The feature that differentiates this loop from a regular 
	// While loop is that the block inside the loop block will always run once
	
	public void socialMediaAdd() {
		int friendCount = 0;
		boolean addMoreFriends = true;
		
		do {
			System.out.println("Another Friend Added");
			friendCount++;
			
			if (friendCount > 500) {
				addMoreFriends = false;
			} 
		}while(addMoreFriends);
			
			System.out.println("You Cannot Add Anymore Friends");
		
		}
	
	//FOR LOOP 
	// For loops are especially handy when you want a variable to act as a counter
	// What does a counter mean?
	
	public void forYourEyesOnly() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("What does the method title even mean?");
		}
	}
	
	

}
	
	
	
	


