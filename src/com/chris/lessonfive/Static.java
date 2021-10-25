package com.chris.lessonfive;

public class Static {

	// The Static Keyword is one that you would have seen quite a bit up till now

	// In its simplest form it allows us to use a method without having to create an
	// instance of the class
	
	// Where have we seen a global method before 
	// - TASK let the students think about some global methods 
	// and describe why they are useful
	
	// One global method 

	// Lets have a look at an example of a Class with a non static method and a
	// static method

	// To make things simple lets create an Otter

	// OTTER CLASS

	private String name;
	private static String[] languages;
	private int age;
	private int eyes;
	private boolean isCute;
	private boolean canSwim;
	private static boolean canBark;

	
 
	//Here we have a static method -
	// TASK - What happens when you insert a non-static variable into a static method?
	// Is this also true for methods
	
	public static void bark() {

		if (canBark == false) {
			System.out.println("I'm not a dog dude");
		} else {
			System.out.println("Woof");
		}
	}
	
	public void swimOrDrown() {

		while (canSwim == true) {
			if (age <= 10) {
				System.out.println("I love swim");
				age++;
			} else {
				System.out.println("I ded now");
				canSwim = false;
			}
		}
	}

	//A USE CASE FOR A STATIC METHOD
	//Lets say that we want to counter each time we construct a duck
	//If we tried creating an instance variable this wouldnt work 
	//once constructed it the variable would start at its default!!!
	
	// So how do we get around this?
	// by creating a static method we would be able to save the 
	// number and share it between all instances of the class
	
	
	public Static() {
		super();
	}

	public Static(int age, boolean canSwim) {
		super();
		this.age = age;
		this.canSwim = canSwim;
	}
	
	

	public Static(String name, int age, int eyes, boolean isCute, boolean canSwim) {
		super();
		this.name = name;
		this.age = age;
		this.eyes = eyes;
		this.isCute = isCute;
		this.canSwim = canSwim;
	}

//Getters and Setters
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

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public boolean isCute() {
		return isCute;
	}

	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public static boolean isCanBark() {
		return canBark;
	}

	public static void setCanBark(boolean canBark) {
		Static.canBark = canBark;
	}

}
