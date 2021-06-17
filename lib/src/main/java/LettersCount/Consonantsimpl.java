package LettersCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consonantsimpl implements LettersCount{

	List<Character> consonants = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'j', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w', 'y'));
	
	@Override
	public int getNameLength(final String s) {

		
		int countConsonants = 0;
		
		char[] sCharArray = s.toLowerCase().toCharArray();
		
		for (int i=0; i<s.length(); i++) {
       	if (consonants.contains(sCharArray[i])) {
        		countConsonants++;
        	}
       	
        }
		
		return countConsonants;
	}

}
