package com.chris.lessonthree;

public class FizzBuzzSolution {
	
	public static void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	public static void fizzBuzzWhile() {
		int i = 1;
		while (i <= 100) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			i++;

		}
	}
	

}
