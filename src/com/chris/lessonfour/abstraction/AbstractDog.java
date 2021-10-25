package com.chris.lessonfour.abstraction;

abstract class Dog {
	
	private String breed;
	
	public void intimidate() {
		System.out.println("I'm scary");
	}	
	// The abstract method is not defined and is simply a requirement that other class's must then define
	// This helps us organise what a class must have 
	// All Dogs cry, but not all dogs cry the same
	public abstract void cry();
	
}

class Labradour extends Dog {
	// We are able to call the methods in the Dog class through the Laboratory class

	public void cry() {
		System.out.println("Crying");
	}
}

public class AbstractDog {
	
	public static void main(String[] args) {
	
	Labradour l = new Labradour();
	
	l.intimidate();
	l.cry();
	
	//within the main method we are able to call upon the class as normal
	}
}

