package LettersCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowelsimpl implements LettersCount{
	List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
//		vowels.add('a');
//		vowels.add('e');
//		vowels.add('i');
//		vowels.add('o');
//		vowels.add('u');
			

	@Override
	public int getNameLength(final String s) {
		
		
		
		int countVowels = 0;
		
		char[] sCharArray = s.toLowerCase().toCharArray();
		
		for (int i=0; i<s.length(); i++) {
        	if (vowels.contains(sCharArray[i])) {
        		countVowels++;
        	}
        	
        }
		return countVowels; 
	}

}
