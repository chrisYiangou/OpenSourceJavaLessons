package com.chris.lessonfour.polymorphism;

public class Siamese extends Cat {

	
	// We have overriden the initial method and implemnted 
	// code specific to the Siamese Cat. This is known as dynamic polymorphism
	
	// PolyMorphism literally means the different forms, we are able to create 
	//
	
	@Override 
	// Best practise to put this @Override annotation
	//Not required, but helps the compiler to detect issues easier
	
	public void scratch() {
		System.out.println("I don't scratch");
}
}