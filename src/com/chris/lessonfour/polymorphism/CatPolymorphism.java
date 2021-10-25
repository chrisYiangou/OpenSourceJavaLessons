package com.chris.lessonfour.polymorphism;

public class CatPolymorphism {
	//We use polymorphism to create 'universal solutions'
	public static void main(String[] args) {
	
		Cat c = new Cat();
		Persian p = new Persian();
		Siamese s = new Siamese(); 
		
		c.scratch();
		p.scratch();
		s.scratch();
		
		int add1 = c.catAdd(1, 20);
		
		int add2 = c.catAdd(1, 3, 5);
		
		System.out.println(add1 + add2);
		
		
		
	}
}
