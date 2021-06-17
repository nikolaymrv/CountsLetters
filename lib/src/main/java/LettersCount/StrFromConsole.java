package LettersCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrFromConsole implements ReadFromConsole{

	public String consoleLine;

	@Override
	public List<Integer> getLineFromConsole(String s) {
		final String EXIT = "Exit";
		List<Integer> paramList = new ArrayList<>();
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;
		Consonantsimpl consonants = new Consonantsimpl();
		Vowelsimpl vowels = new Vowelsimpl();
			
				
			 countConsonants = consonants.getNameLength(s);      
		     countVowels = vowels.getNameLength(s);
		        
		        vCounter += countVowels;
		        cCounter += countConsonants;
		        
		        paramList.add(vCounter);
		        paramList.add(cCounter);
		        
		        System.out.println("Vowels in array" + " " + countVowels);
		        System.out.println("Consonants in array" + " " + countConsonants);
		        
		
		        
			
			return paramList;
	}

		
}
