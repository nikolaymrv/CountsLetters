package LettersCount;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LineFromFileJava82 extends LineFromFileCommon {

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;

		ConsonantsCounter consonantsCounter = new ConsonantsCounter();
		VowelsCounter vowelsCounter = new VowelsCounter();

		List<Integer> letterCount = new ArrayList<>();

		try (Stream<String> streamFromFiles = Files.lines(Paths.get(input));) {
			// List<String> lineFromFile = streamFromFiles.collect(Collectors.toList());
			int i = 0;
			streamFromFiles.forEach(line -> {
				vowelsCounter.getLettersCount(line);
			});
		}

//		while (i < lineFromFile.size()) {
//			System.out.println("Line" + " " + i + " " + ":" + lineFromFile.get(i));
//
//			countVowels = vowelsCounter.getLettersCount(lineFromFile.get(i));
//			countConsonants = consonantsCounter.getLettersCount(lineFromFile.get(i));
//
//			vCounter += countVowels;
//			cCounter += countConsonants;
//
//			System.out.println("Vowels in array" + " " + countVowels);
//			System.out.println("Consonants in array" + " " + countConsonants);
//
//			i++;
//		}
//		streamFromFiles.close();
		letterCount.add(vCounter); // 0
		letterCount.add(cCounter); // 1

		return letterCount;
	}
}
// D:\Programs\Workspace\strings.txt
