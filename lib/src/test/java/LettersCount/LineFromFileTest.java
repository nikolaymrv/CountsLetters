package LettersCount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class LineFromFileTest {
	
	private LineFromFileCommon stringFrFile;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws Exception {
		String s = "D:\\Programs\\Workspace\\NameLength\\lib\\src\\test\\resources\\testString.txt";
		int vCounterExpected=4;
		int cCounterExpected=9;

		stringFrFile = new LineFromFileCommon();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrFile.processLineFrom(s);
		
		List<Integer> lettersCountExpected = new ArrayList<>();
		
		lettersCountExpected.add(vCounterExpected);
        lettersCountExpected.add(cCounterExpected);
        		
		assertArrayEquals(lettersCountExpected.toArray(), countersList.toArray());
	}
	
	@Test
	public void test2() throws Exception {
		String s = "D:\\Programs\\Workspace\\NameLength\\lib\\src\\test\\resources\\testStringNthng.txt";
		int vCounterExpected=0;
		int cCounterExpected=0;

		stringFrFile = new LineFromFileCommon();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrFile.processLineFrom(s);
		
		List<Integer> lettersCountExpected = new ArrayList<>();
		
		lettersCountExpected.add(vCounterExpected);
        lettersCountExpected.add(cCounterExpected);
        		
		assertArrayEquals(lettersCountExpected.toArray(), countersList.toArray());
	}

}
