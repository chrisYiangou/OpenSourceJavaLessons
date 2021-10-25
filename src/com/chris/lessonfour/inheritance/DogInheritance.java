package com.chris.lessonfour.inheritance;

public class DogInheritance extends Animal {

	private String breed;
	
	public void intimidate() {
		System.out.println("I'm scary");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
