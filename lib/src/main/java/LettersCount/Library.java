package LettersCount;

import java.util.ArrayList;
import java.util.List;
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
		List<Integer> countersList = new ArrayList<>();
		 switch (variants) {
		 
		 case (1):
			 while (true) {
				 System.out.println("Enter the string");
				 Scanner sc = new Scanner (System.in);
				 s = sc.nextLine();
			        if (s.equals(EXIT)) {
			        	break;
			        }  
			        
			        countersList = lineConsoleStr.getLineFromConsole(s);
			        vCounter += countersList.get(0);
			        cCounter += countersList.get(1);
			        
			 }
		 break;
		//D:\Programs\Workspace\strings.txt
		 case (2):
			 
		 	
		 	 
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 Scanner sc = new Scanner(System.in);
				 s = sc.nextLine();
				 
				 if (s.equals(EXIT)) {
			        	break;
			        }
				 else {
				 	countersList =	 lineFileStr.getLineFromFile(s);
				 	 vCounter += countersList.get(0);
			        cCounter += countersList.get(1);
			       
				 }
			 }
		 
		 }
		 
		System.out.println("Vowels:" + " " + vCounter);
		System.out.println("Consonants:" + " " + cCounter);
		
		
		System.out.println("Goodbye");
	}
}
