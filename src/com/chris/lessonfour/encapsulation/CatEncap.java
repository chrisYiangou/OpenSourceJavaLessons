package com.chris.lessonfour.encapsulation;

public class CatEncap {

	// What do we need to do to properly encapsulate this object????

	String name;
	int age = 0;
	boolean isCute;

	public void meow(int age) {
		this.age = age;
		if (age < 5) {
			System.out.println("Meow");
		} else {
			System.out.println("Growl");
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
	// For age, we want to ensure that there is never a negative integer
	
	public void setAge(int age) {
		if (age >= 0) {
		this.age = age;
		}
	}
	public boolean isCute() {
		return isCute;
	}
	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}

}
