package LettersCount;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineFromFileJava8 extends LineFromFileCommon{

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		
		ConsonantsCounter consonantsCounter = new ConsonantsCounter();
		VowelsCounter vowelsCounter = new VowelsCounter();
		
		List<Integer> letterCount = new ArrayList<>();		
		
		Scanner scRead = new Scanner (new FileInputStream(input));
		String lineFromFile = null;
		int i = 1;
		
		while (scRead.hasNextLine()) {
			lineFromFile = scRead.nextLine();
				System.out.println("Line" + " " + i + " " + ":" + lineFromFile);					
					countVowels = vowelsCounter.getLettersCount(lineFromFile);
					 countConsonants = consonantsCounter.getLettersCount(lineFromFile);
				       
				      vCounter += countVowels;
				      cCounter += countConsonants;
				        	        
				      System.out.println("Vowels in array" + " " + countVowels);
				      System.out.println("Consonants in array" + " " + countConsonants);
				        	
					i++;
		}
		
		letterCount.add(vCounter); //0
		letterCount.add(cCounter); //1
		
		return letterCount;
	}
	
}
