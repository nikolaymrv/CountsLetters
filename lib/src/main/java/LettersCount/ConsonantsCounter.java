package LettersCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//rename
public class ConsonantsCounter implements LettersCounter {

	List<Character> consonants = new ArrayList<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'j', 'j', 'k', 'l', 'm', 'n',
			'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w', 'y'));

	@Override
	public int getLettersCount(final String line) {
		int countConsonants = 0;

		char[] LineToChars = line.toLowerCase().toCharArray();

		for (int i = 0; i < line.length(); i++) {
			if (consonants.contains(LineToChars[i])) {
				countConsonants++;
			}

		}

		return countConsonants;
	}

}
