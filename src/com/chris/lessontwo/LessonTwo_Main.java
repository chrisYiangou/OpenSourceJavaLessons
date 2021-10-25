package com.chris.lessontwo;

public class LessonTwo_Main {


	public static void main(String[] args) {
		
		ClassMembers // We are calling the Class name ClassMembers
		student  // We are giving it a unique reference
		= // Is equal to 
		new // A new instantiation (or instance for short)
		ClassMembers(); // Of the ClassMembers Constructor.
		
		//This is another way of writing a initialisation.
		//Commonly written in this structure
		ClassMembers anotherStudent = new ClassMembers("Bob", "Bobson", 0);
		
		// In essence this is no different to an assembly line in a factory
	
		//We are able to change set the features - 
		//We will learn the best practise for this in later lessons
		student.eyes = 2;
		
		int a = student.addNumbers();
		
		System.out.println("The sum of the two numbers above is: " + a);
		
		Operators opps = new Operators();
		
		Conditionals con = new Conditionals();
		
		

	}

}
