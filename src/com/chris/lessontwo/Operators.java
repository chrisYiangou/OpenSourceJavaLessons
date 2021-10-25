package com.chris.lessontwo;

public class Operators {

	// As we have seen, Java is capable of Mathematical Computations
	// Why do Math when Java can it for you (am I right, or am I right)?

	// The operators that Java contain are pretty similar to the Math's that we
	// already know

	// This includes:

	// = -- Assign Value
	// + -- Addition (Plus)
	// - -- Minus
	// / -- Divide
	// * -- Multiply
	// % -- Modulus (This is basically a remainder, for example 4 % 2 = 0
	// because 4 is a multiple for 2)

	// So lets go over how these are useful:

	// = -- Assign Value

	String luckyCharm = "I'm so lucky";
	int num = 2;

	// + -- Addition (Plus)

	int num2 = 3 + num;

	public void add() {
		int z = num + num2;
		System.out.println(z);
	}

	// - -- Minus

	int num3 = num2 - num;

	public void minus() {
		int z = num2 - num3;
		System.out.println(z);
	}

	// / -- Divide

	int num4 = num3 / num;

	public void divide() {
		int z = num4 / num3;
		System.out.println(z);
	}

	// * -- Multiply

	int num5 = num4 / num;

	public void multiply() {
		int z = num4 / num3;
		System.out.println(z);
	}
	
	// % -- Modulus

	public void remainder(int x, int y) {
		int z = x % y;
		System.out.println("The Modulus of " + x + " and " +
							y + " is: " + z);
	}
	

	// This is a constructor - if we have not covered this do not worry for now...
	// EXTRA TASK - Run your operator methods through a constructor in main
	public Operators() {

	}

}
