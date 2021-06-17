package LettersCount;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;

public class stringFrConsTest {

	private StrFromConsole stringFrConsole;
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		String s = "Hello im a string";
		int vCounterTest=5;
		int cCounterTest=9;
		
		int vCounter=0;
		int cCounter=0;
		
		stringFrConsole = new StrFromConsole();
		
		List<Integer> countersList = new ArrayList<>();
		countersList = stringFrConsole.getLineFromConsole(s);
		
		List<Integer> paramListTest = new ArrayList<>();
		
		paramListTest.add(vCounterTest);
        paramListTest.add(cCounterTest);
        
        vCounter += countersList.get(0);
        cCounter += countersList.get(1);
		
		assertArrayEquals(paramListTest.toArray(), countersList.toArray());
	}

}
