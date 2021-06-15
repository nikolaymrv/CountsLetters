package LettersCount;

import java.util.Scanner;

public class Library {
	public static void main(String args[]) throws Exception {
		
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		final String EXIT = "Exit";
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
				 lineConsoleStr.getLineFromConsole();
				 s = lineConsoleStr.consoleLine;
			        if (s.equals(EXIT)) {
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
		//D:\Programs\Workspace\strings.txt
		 case (2):
			 
		 	
		 	 
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 Scanner sc = new Scanner(System.in);
				 s = sc.toString();
				 
				 if (s.equals(EXIT)) {
			        	break;
			        }
				 
				 lineFileStr.getLineFromFile(s);
			        
			        	
			 }
		 
		 }
		 
		
		System.out.println("Consonants:" + " " + cCounter);
		System.out.println("Vowels:" + " " + vCounter);
		System.out.println("Goodbye");
	}
}
