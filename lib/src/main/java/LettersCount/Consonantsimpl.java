package LettersCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consonantsimpl implements LettersCount{

	List<Character> consonants = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'j', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w', 'y'));
	
	@Override
	public int getNameLength(final String s) {
//		consonants.add('b');
//		consonants.add('c');
//		consonants.add('d');
//		consonants.add('f');
//		consonants.add('g');
//		consonants.add('j');
//		consonants.add('k');
//		consonants.add('l');
//		consonants.add('m');
//		consonants.add('n');
//		consonants.add('p');
//		consonants.add('q');
//		consonants.add('s');
//		consonants.add('t');
//		consonants.add('v');
//		consonants.add('x');
//		consonants.add('z');
//		consonants.add('h');
//		consonants.add('r');
//		consonants.add('w');
//		consonants.add('y');
		
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
