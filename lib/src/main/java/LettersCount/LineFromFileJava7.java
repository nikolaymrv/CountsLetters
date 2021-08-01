package LettersCount;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LineFromFileJava7 extends LineFromFileCommon {

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		final String EXIT = "Exit";
		int vCounter = 0;
		int cCounter = 0;
		int countConsonants = 0;
		int countVowels = 0;

		ConsonantsCounter consonantsCounter = new ConsonantsCounter();
		VowelsCounter vowelsCounter = new VowelsCounter();
		MongoDBProcessor mongoDBProcessor = new MongoDBProcessor();

		List<Integer> letterCount = new ArrayList<>();

		int i = 1;

		List<String> linesFromFile = Files.readAllLines(Paths.get(input), StandardCharsets.UTF_8);

		for (String lineFromFile : linesFromFile) {

			if (lineFromFile.equals(EXIT)) {
				break;
			}

			else {
				System.out.println("Line" + " " + i + " " + ":" + lineFromFile);

				countVowels = vowelsCounter.getLettersCount(lineFromFile);
				countConsonants = consonantsCounter.getLettersCount(lineFromFile);

				vCounter += countVowels;
				cCounter += countConsonants;

				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				final String FROM_FILE_TYPE = "From file";

				LettersDTO lettersDTO = new LettersDTO();
				lettersDTO.setVowelsCountInLine(countVowels);
				lettersDTO.setConsonantsCountInLine(countConsonants);
				lettersDTO.setReadedLine(lineFromFile);
				lettersDTO.setTimestamp(timestamp);
				lettersDTO.setTypeOfInput(FROM_FILE_TYPE);

				mongoDBProcessor.mongoDBConnection(lettersDTO);

				System.out.println("Vowels in array" + " " + countVowels);
				System.out.println("Consonants in array" + " " + countConsonants);

				i++;
			}
		}

		letterCount.add(vCounter); // 0
		letterCount.add(cCounter); // 1

		return letterCount;
	}
}
