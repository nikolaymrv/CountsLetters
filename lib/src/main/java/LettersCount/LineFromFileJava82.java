package LettersCount;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
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
		MongoDBProcessor mongoDBProcessor = new MongoDBProcessor();

		List<Integer> letterCount = new ArrayList<>();

		try (Stream<String> streamFromFiles = Files.lines(Paths.get(input));) {
			
		 
			streamFromFiles.forEach(line -> {
				vowelsCounter.getLettersCount(line);
				consonantsCounter.getLettersCount(line);
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				final String FROM_FILE_TYPE = "From file";
				
				 LettersDTO lettersDTO = new LettersDTO();
					lettersDTO.setVowelsCountInLine(vCounter);
					lettersDTO.setConsonantsCountInLine(cCounter);
					lettersDTO.setReadedLine(line);
					lettersDTO.setTimestamp(timestamp);
					lettersDTO.setTypeOfInput(FROM_FILE_TYPE);
					
					mongoDBProcessor.mongoDBConnection(lettersDTO);
			});
		}
		letterCount.add(vCounter); // 0
		letterCount.add(cCounter); // 1

		return letterCount;
	}
}
// D:\Programs\Workspace\strings.txt
