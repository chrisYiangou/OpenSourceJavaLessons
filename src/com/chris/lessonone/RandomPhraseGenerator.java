package com.chris.lessonone;

public class RandomPhraseGenerator {
	
	public static void main(String[] args) {	

		String[] names = {"Chris", "Richard", "Trishia", "Michael", "Bob", "Ellie", "Sean",
							"Dylan", "Squirrel", "A Cat named Steve"};
		
		
		String[] verb = {"is feeling", "has created", "is crying", "is holding"};
		
		String[] pun = {"HEAT", "COLD", "RAGE", "COFFEE", "ENVY"};
		
		int randNames = (int)(Math.random() * names.length);
		int randVerb = (int)(Math.random() * verb.length);
		int randPun = (int)(Math.random() * pun.length);
		
		System.out.println(names[randNames] + " " + verb[randVerb] + " " 
							+ pun[randPun]);

	}

}
