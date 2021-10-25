package com.chris.lessontwo;

public class ClassMembers {

	// Within this lesson, we are going to understand how to
	// initialise a class (essentially bring it to life)
	
	// Java is an Object-Orientated Language. 
	// A Java object is a combination of data and procedures working on the available data.
	// An object could be anything that you decide it to be, you could design a cat, dog, chair, etc?

	// A Class can be compared to a real life blueprint
	// It has all the details and requirements to build
	// However to bring it to life we need more than just the blueprint...

	// Within this class we are going to create some students and bring them
	// to life through the Main method

	// What variables do students have?

	String firstName;
	String surname;
	int eyes;
	boolean highIQ;
	String subjectStudying;
	char firstNameInitial;
	
	// TASK: ADD MORE

	// Students have more than just variables - Students have actions
	// We create actions in java through methods

	// Remember that a variable is like an attribute and a method is the action
	// For example, a student has two eyes (int eyes = 2), this is a description
	// A student will use their eyes to study - this is a method

	public void study() {
		System.out.println("I'm studying, leave me alone");
	}
	
	// So far we have only covered methods that have returned void
	// Lets look at an example 
	
	
	public void addNumbers(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	public int addNumbers() {
		int x = 3;
		int y = 10;
		int z = x + y;
		return z;
	}
	
	
	// So here we have a student, they are able to study and add two numbers together
	// Great, Now what?
	// To be able to set values uniquely each time to create individual students
	// We do this through the use of the CONSTRUCTOR
	
	
	//Is there anything different with this method??? Please write it down in the comments
	
	
	public ClassMembers() {
		
	}
	
	public ClassMembers (String firstName, String surname, int eyes) {
		this.firstName = firstName;
		this.surname = surname;
		this.eyes = eyes;
	}
	
	//What we have just demonstrated in this example is method OverLoading - do not worry about this 
	//for now, this is a large topic and needs its own lesson
	
	// But just know that methods can have the same name, but be considered unique by the Compiler
	// due to the arguments passing through it
	

	}
	

