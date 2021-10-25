package com.chris.lessonfour.inheritance;

public class InheritanceMain {
	
	public static void main(String[] args) {
		
		CatInheritance cat = new CatInheritance();
		DogInheritance dog = new DogInheritance();
		
		cat.setAge(10);
		dog.setCute(true);
		
		System.out.println("The cat is " + cat.getAge() + " years old");
		System.out.println("The dog is cute: " + dog.isCute());
		
		dog.makeNoise();
		
		dog.intimidate();
		
	
		
		
	}

}
