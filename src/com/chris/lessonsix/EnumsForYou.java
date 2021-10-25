package com.chris.lessonsix;

enum DaysOfWeek {
	//Unlike the Array we created before Enums do not take in Data Types
	//So putting in the String below will not work
	
	//Instead they take in Stickers and are used like this 
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private final int number;
	
	DaysOfWeek(int number) {
		this.number = number;
	}
	
	public int dayMath() {
		return 5 + number; 
	}
	
	public int getNumber() {
		return number;
	}
}


public class EnumsForYou {
	
	// So far we have covered the static keyword and the global keyword - 
	// Enums are like if the two had a baby.
	
	//We can either have Enums within or outside of an existing class.
	
	// Though it is possible to have a list like below 
	
	public static void main(String[] args) {
	
	String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday",
							 "Thursday", "Friday", "Saturday", "Sunday"};
	
	System.out.println(daysOfTheWeek[2]);
	
	DaysOfWeek m = DaysOfWeek.MONDAY;
	
	//Creating a variable with our enum method 
	
	int enumMath = 5 + m.dayMath();

	
	// Example of a switch 
	switch(m) {
	
	case FRIDAY:
	case SATURDAY:
	case SUNDAY:
		System.out.println("Today is a good day" + m.getNumber());
		break;
	default: 
		System.out.println("Today is not a good day, Day Number: " + m.getNumber());	
		
		
		
	//Example of a for loop
		
	for (DaysOfWeek day : DaysOfWeek.values()) {
		System.out.println(day);
		

	}
	}

}
}
