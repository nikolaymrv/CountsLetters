package LettersCount;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LineFromFileJava82 extends LineFromFileCommon {

	@Override
	public List<Integer> processLineFrom(String input) throws Exception {
		int vCounter = 0;
		int cCounter = 0;

		ConsonantsCounter consonantsCounter = new ConsonantsCounter();
		VowelsCounter vowelsCounter = new VowelsCounter();

		List<Integer> letterCount = new ArrayList<>();

		try (Stream<String> streamFromFiles = Files.lines(Paths.get(input));) {
			// List<String> lineFromFile = streamFromFiles.collect(Collectors.toList());
		 
			streamFromFiles.forEach(line -> {
				vowelsCounter.getLettersCount(line);
				consonantsCounter.getLettersCount(line);
			});
		}
		letterCount.add(vCounter); // 0
		letterCount.add(cCounter); // 1

		return letterCount;
	}
}
// D:\Programs\Workspace\strings.txt
