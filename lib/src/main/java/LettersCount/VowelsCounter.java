package LettersCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsCounter implements LettersCounter {
	List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	@Override
	public int getLettersCount(final String s) {

		int vowelsCount = 0;

		char[] lineToChars = s.toLowerCase().toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (vowels.contains(lineToChars[i])) {
				vowelsCount++;
			}

		}
		return vowelsCount;
	}

}
