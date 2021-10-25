package com.chris.lessonfour.polymorphism;

public class Cat {

	public void scratch() {
		System.out.println("I scratched my owner");
	}
	
	
	
	// This is an example of static polymorphism, we have overloaded the 
	// method 
	
	public int catAdd(int x, int y) {
		return x + y;
	}
	
	public int catAdd(int x, int y, int z) {
		return z + y + z;
	}
}
