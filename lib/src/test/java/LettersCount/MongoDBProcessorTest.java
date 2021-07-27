package LettersCount;

import static org.mockito.Mockito.doNothing;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.mockito.ArgumentMatchers;

public class MongoDBProcessorTest {

	final String CONSOLE_TYPE = "Console";	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		
		String lineToBeProcessed = "Hello";
		List<Integer> counterList = new ArrayList<>();
		int vowels = 2;
		int consonants = 3;
		
		counterList.add(vowels, consonants);
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		LettersDTO lettersDTO = new LettersDTO();
		lettersDTO.setVowelsCountInLine(vowels);
		lettersDTO.setConsonantsCountInLine(consonants);
		lettersDTO.setReadedLine(lineToBeProcessed);
		lettersDTO.setTimestamp(timestamp);
		lettersDTO.setTypeOfInput(CONSOLE_TYPE);
		
		MongoDBProcessor mongoDBConnectionTEST = new MongoDBProcessor();
		doNothing().when(mongoDBConnectionTEST).mongoDBConnection(ArgumentMatchers.any());
		mongoDBConnectionTEST.mongoDBConnection(lettersDTO);
	}

}
