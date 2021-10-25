package com.chris.lessonone;

public class DfEExercise1 {

	public static void main(String[] args) {
		
		boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
		
		int weight = 20; // Creating an intger named weight and assigning it value 20
		String name = "Billy Bob"; // Creating a String named name and assigning it a String "Billy Bob
		Dog goodBoy = new Dog(name, weight); //Object is being created called goodBoy and assigning it values created above
		int x = weight - 10; // Creating an intger called x with value weight - 10
		if (x < 15) goodBoy.bark(); // If the Value of x is true Goddboy barks
		
		while (x < 3) {
			goodBoy.play();
		}                  // If x less than 3, then goodBoy will play
		
		int[] numList = {1,2,3,4,5,6}; //Creating an array named NumList and entering nums
		System.out.println("How are you"); // Printing out how are you
		System.out.println("My " + name + " is doing great"
				+ " how's yours"); // Prints a statement with the name variable
		String num = "305"; //String named num called 305
		int z = Integer.parseInt(num); // New variable called z and coverts it into an integer
	
		
	}

		
	}


