package LettersCount;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsonantsTest {

	private ConsonantsCounter consonantsTest;
	
	@Test
	public void test() {
		consonantsTest = new ConsonantsCounter();
		String s = "Hello";
		assertEquals(3, consonantsTest.getLettersCount(s), 0);
	}

	@Test
	public void test2() {
		consonantsTest = new ConsonantsCounter();
		String s = "eo";
		assertEquals(0, consonantsTest.getLettersCount(s), 0);
	}
	
}
