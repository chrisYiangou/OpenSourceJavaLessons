package com.chris.lessonfour.inheritance;

public class CatInheritance extends Animal {
	
	// This class may look empty, but its has all the instance variables 
	// and methods of the Animal class
	
	boolean hasClaws;
	
	@Override
	public void makeNoise() {
		if (hasClaws == true) {
			System.out.println("Gwaarrr");
		} else {
			System.out.println("I'm a Classy Cat");
		}

}
}
