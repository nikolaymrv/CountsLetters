package LettersCount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class stringFrFileTest {
	
	private StrFromFile stringFrFile;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws Exception {
		String s = "D:\\Programs\\Workspace\\NameLength\\lib\\src\\test\\resources\\testString.txt";
		int vCounterTest=4;
		int cCounterTest=9;
		
		int vCounter=0;
		int cCounter=0;
		
		stringFrFile = new StrFromFile();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrFile.getLineFromFile(s);
		
		List<Integer> paramListTest = new ArrayList<>();
		
		paramListTest.add(vCounterTest);
        paramListTest.add(cCounterTest);
        
        vCounter += countersList.get(0);
        cCounter += countersList.get(1);
		
		assertArrayEquals(paramListTest.toArray(), countersList.toArray());
	}

}
