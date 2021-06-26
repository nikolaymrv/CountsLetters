package LettersCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	public static void main(String args[]) throws Exception {
		
		int vCounter = 0;
		int cCounter = 0;
		final String EXIT = "Exit";
		
		String lineToBeProcessed = null;
		
		LineFromFileCommon lineFromFile = new LineFromFileCommon();
		LineFromFileJava7 lineFromFileJava7 = new LineFromFileJava7();
		LineFromFileJava8 lineFromFileJava8 = new LineFromFileJava8();
		LineFromFileJava82 lineFromFileJava11 = new LineFromFileJava82();
		LineFromConsole lineFromConsole = new LineFromConsole();
		
		Scanner scChoice = new Scanner(System.in);

		Choice choice = new Choice();
		int variants = choice.choice(scChoice);
		
		List<Integer> counterList = new ArrayList<>();
		 switch (variants) {
		 
		 case (1):
			 while (true) {
				 System.out.println("Enter the string");
				 Scanner sc = new Scanner (System.in);
				 lineToBeProcessed = sc.nextLine();
			        if (lineToBeProcessed.equals(EXIT)) {
			        	break;
			        }  
			        
			        counterList = lineFromConsole.processLineFrom(lineToBeProcessed);
			        vCounter += counterList.get(0);
			        cCounter += counterList.get(1);
			        
			 }
		 break;
		 
		 case (2):
			 
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 
				 Scanner sc = new Scanner(System.in);
				 lineToBeProcessed = sc.nextLine();
				 
				 if (lineToBeProcessed.equals(EXIT)) {
			        	break;
			     }
				 
				 else {
				 	counterList = lineFromFile.processLineFrom(lineToBeProcessed);
				 	 vCounter += counterList.get(0);
			        cCounter += counterList.get(1);
			       
				 }
			 }
		 
		 break;
		 //Java7
		 case (3):
			 //D:\Programs\Workspace\NameLength\lib\src\main\text.txt
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 
				 Scanner sc = new Scanner(System.in);
				 lineToBeProcessed = sc.nextLine();
				 
				 if (lineToBeProcessed.equals(EXIT)) {
			        	break;
			     }
				 
				 else {
				 	counterList = lineFromFileJava7.processLineFrom(lineToBeProcessed);
				 	 vCounter += counterList.get(0);
			        cCounter += counterList.get(1);
			 }
		 }
		 
		 break;
		 //Java 8
		 case (4):
			 //D:\Programs\Workspace\NameLength\lib\src\main\text.txt
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 
				 Scanner sc = new Scanner(System.in);
				 lineToBeProcessed = sc.nextLine();
				 
				 if (lineToBeProcessed.equals(EXIT)) {
			        	break;
			     }
				 
				 else {
				 	counterList = lineFromFileJava8.processLineFrom(lineToBeProcessed);
				 	 vCounter += counterList.get(0);
			        cCounter += counterList.get(1);
			 }
			 
		 }
		break;
		
		 case (5):
			 
			 while (true) {
				 System.out.println("Enter full path to file with the name of file (with .txt or other .type)");
				 
				 Scanner sc = new Scanner(System.in);
				 lineToBeProcessed = sc.nextLine();
				 
				 if (lineToBeProcessed.equals(EXIT)) {
			        	break;
			     }
				 
				 else {
				 	counterList = lineFromFileJava8.processLineFrom(lineToBeProcessed);
				 	 vCounter += counterList.get(0);
			        cCounter += counterList.get(1);
			 }
			 }
	}
		System.out.println("Vowels:" + " " + vCounter);
		System.out.println("Consonants:" + " " + cCounter);
		System.out.println("Goodbye");
		//D:\Programs\Workspace\NameLength\lib\src\main\text.txt
	}
}