package LettersCount;

import static org.mockito.Mockito.doNothing;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class MongoDBProcessorTest {

	final String CONSOLE_TYPE = "Console";

	@Test
	public void test() {
		
		String lineToBeProcessed = "Hello";
		List<Integer> counterList = new ArrayList<>();
		int vowels = 2;
		int consonants = 3;
		
		counterList.add(vowels);
		counterList.add(consonants);
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		LettersDTO lettersDTO = new LettersDTO();
		lettersDTO.setVowelsCountInLine(vowels);
		lettersDTO.setConsonantsCountInLine(consonants);
		lettersDTO.setReadedLine(lineToBeProcessed);
		lettersDTO.setTimestamp(timestamp);
		lettersDTO.setTypeOfInput(CONSOLE_TYPE);
		
		MongoDBProcessor mongoDBConnectionTEST = Mockito.mock(MongoDBProcessor.class);
		doNothing().when(mongoDBConnectionTEST).mongoDBConnection(ArgumentMatchers.any());
		mongoDBConnectionTEST.mongoDBConnection(lettersDTO);
	}

}
