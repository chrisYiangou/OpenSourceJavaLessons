package com.chris.lessonfour.inheritance;

public class Animal /*SuperClass*/ {
	
	// Instead of having creating multiple class's all with the same 
	// variables we can have a SuperClass with the main 
	// instance variables and methods
	
	private String name;
	private int age;
	private boolean isCute;
	private int hunger; //Scale from 1-10 representing hunger

	public void makeNoise() {
		if (isCute == true) {
			System.out.println("Gwaarrr");
		} else {
			System.out.println("ROOOOOAAAAARRRR");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCute() {
		return isCute;
	}

	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


}
