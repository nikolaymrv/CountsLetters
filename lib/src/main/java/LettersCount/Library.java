package LettersCount;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private static List<LettersDTO> lineParameters = new ArrayList<>();
	
	
	public static void main(String args[]) throws Exception {

		int vCounter = 0;
		int cCounter = 0;
		final String EXIT = "Exit";
		final String NO = "No";
		final String YES = "Yes";

		String lineToBeProcessed = null;

		LineFromFileCommon lineFromFile = new LineFromFileCommon();
		LineFromFileJava7 lineFromFileJava7 = new LineFromFileJava7();
		LineFromFileJava8 lineFromFileJava8 = new LineFromFileJava8();
		LineFromFileJava82 lineFromFileJava82 = new LineFromFileJava82();
		LineFromConsole lineFromConsole = new LineFromConsole();
		WorkingWithDB JDBCgetLine = new WorkingWithDB();
		WriteLineInBD writeLineInBD = new WriteLineInBD();

		Scanner scannerChoice = new Scanner(System.in);

		Choice choiceTypeOfInput = new Choice();
		int variants = choiceTypeOfInput.choice(scannerChoice);

		List<Integer> counterList = new ArrayList<>();
		switch (variants) {

		case (1):
			while (true) {
				
				
				System.out.println("Enter the string");
				Scanner scannerLineFromConsole = new Scanner(System.in);
				lineToBeProcessed = scannerLineFromConsole.nextLine();
				
				System.out.println("You wanna write this line in DB?");
				Scanner scannerLineFromDatabase = new Scanner(System.in);
				String choiceDB = scannerLineFromDatabase.nextLine();
				
				if(choiceDB.equals(YES)) {
					writeLineInBD.writeLineInDB(lineToBeProcessed);
					if (lineToBeProcessed.equals(EXIT)) {
						break;
					}
					
					counterList = lineFromConsole.processLineFrom(lineToBeProcessed);
					vCounter += counterList.get(0);
					cCounter += counterList.get(1);
				}
				
				else if (choiceDB.equals(NO)) {
				if (lineToBeProcessed.equals(EXIT)) {
					break;
				}
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				final String CONSOLE_TYPE = "Console";
				
				counterList = lineFromConsole.processLineFrom(lineToBeProcessed);
				LettersDTO lettersDTO = new LettersDTO();
				lettersDTO.setVowelsCountInLine(counterList.get(0));
				lettersDTO.setConsonantsCountInLine(counterList.get(1));
				lettersDTO.setReadedLine(lineToBeProcessed);
				lettersDTO.setTimestamp(timestamp);
				lettersDTO.setTypeOfInput(CONSOLE_TYPE);
				
				lineParameters.add(lettersDTO);
				
				vCounter += counterList.get(0);
				cCounter += counterList.get(1);
				}
			}
			break;

		case (2):

			while (true) {
				System.out.println("Enter full path to file with the name of file (with .txt or other .type)");

				Scanner scannerPathToFile = new Scanner(System.in);
				lineToBeProcessed = scannerPathToFile.nextLine();

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
		// Java7
		case (3):
			// D:\Programs\Workspace\NameLength\lib\src\main\text.txt
			while (true) {
				System.out.println("Enter full path to file with the name of file (with .txt or other .type)");

				Scanner scannerPathToFile = new Scanner(System.in);
				lineToBeProcessed = scannerPathToFile.nextLine();

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
		// Java 8
		case (4):
			// D:\Programs\Workspace\NameLength\lib\src\main\text.txt
			while (true) {
				System.out.println("Enter full path to file with the name of file (with .txt or other .type)");

				Scanner scannerPathToFile = new Scanner(System.in);
				lineToBeProcessed = scannerPathToFile.nextLine();

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

				Scanner scannerPathToFile = new Scanner(System.in);
				lineToBeProcessed = scannerPathToFile.nextLine();

				if (lineToBeProcessed.equals(NO)) {
					break;
				}

				else {
					counterList = lineFromFileJava82.processLineFrom(lineToBeProcessed);
					vCounter += counterList.get(0);
					cCounter += counterList.get(1);
				}
			}

		case (6):

			while (true) {
				System.out.println("Do you want to continue running the program? (Yes or No)");

				Scanner scannerChoiceYesNo = new Scanner(System.in);
				String choiceLine = scannerChoiceYesNo.nextLine();

				if (choiceLine.equals(NO)) {
					break;
				}

				else {
					counterList = JDBCgetLine.processLineFrom(null);
					vCounter += counterList.get(0);
					cCounter += counterList.get(1);
				}
			}

		}
		System.out.println("Vowels:" + " " + vCounter);
		System.out.println("Consonants:" + " " + cCounter);
		System.out.println("Goodbye");
		// D:\Programs\Workspace\NameLength\lib\src\main\text.txt
	}
}