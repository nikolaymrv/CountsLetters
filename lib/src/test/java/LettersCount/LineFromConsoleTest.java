package LettersCount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class LineFromConsoleTest {

	private LineFromConsole stringFrConsole;
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		String line = "Hello im a string";
		int vCounterExpected=5;
		int cCounterExpected=9;
		
		stringFrConsole = new LineFromConsole();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrConsole.processLineFrom(line);
		
		List<Integer> lettersCountExpected = new ArrayList<>();
		
		lettersCountExpected.add(vCounterExpected);
        lettersCountExpected.add(cCounterExpected);
		
		assertArrayEquals(lettersCountExpected.toArray(), countersList.toArray());
	}
	
	@Test
	public void test2() {
		String line = " ";
		int vCounterExpected=0;
		int cCounterExpected=0;
		
		stringFrConsole = new LineFromConsole();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrConsole.processLineFrom(line);
		
		List<Integer> lettersCountExpected = new ArrayList<>();
		
		lettersCountExpected.add(vCounterExpected);
        lettersCountExpected.add(cCounterExpected);
		
		assertArrayEquals(lettersCountExpected.toArray(), countersList.toArray());
	}

}
