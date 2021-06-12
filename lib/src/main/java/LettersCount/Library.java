package LettersCount;

import java.util.Scanner;

public class Library {
	public static void main(String args[]) throws Exception {
		
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		String Exit = "Exit";
		String s = null;
		
		Consonantsimpl consonants = new Consonantsimpl();
		Vowelsimpl vowels = new Vowelsimpl();
		StrFromFile lineFileStr = new StrFromFile();
		StrFromConsole lineConsoleStr = new StrFromConsole();
		
		Scanner scChoice = new Scanner(System.in);

		Choice choice = new Choice();
		int variants = choice.choice(scChoice);
		 switch (variants) {
		 
		 case (1):
			 while (true) {
//			        if (s.isEmpty()) {
//			        	System.out.println("NullPointerException!");
//						System.out.println("It's not a string! Enter string again...");
//			        }
				 lineConsoleStr.getLineFromConsole();
				 s = lineConsoleStr.consoleLine;
			        if (s.equals(Exit)) {
			        	break;
			        }     
			        
			       
			        countConsonants = consonants.getNameLength(s);
			               
			        countVowels = vowels.getNameLength(s);
			        
			        vCounter += countVowels;
			        cCounter += countConsonants;
			        
			        System.out.println("Consonants in array" + " " + countConsonants);
			        System.out.println("Vowels in array" + " " + countVowels);		
			 }
		 break;
		 
		 case (2):
			 while (true) {
				 lineFileStr.getLineFromFile();
				 s = lineFileStr.fileLine;
				 if (s.equals(Exit)) {
			        	break;
			        }
				 
				 countConsonants = consonants.getNameLength(s);
	               
			        countVowels = vowels.getNameLength(s);
			        
			        vCounter += countVowels;
			        cCounter += countConsonants;
			        
			        System.out.println("Consonants in array" + " " + countConsonants);
			        System.out.println("Vowels in array" + " " + countVowels);		
			 }
		 
		 }
		 
		
		System.out.println("Consonants:" + " " + cCounter);
		System.out.println("Vowels:" + " " + vCounter);
		System.out.println("Goodbye");
	}
}
