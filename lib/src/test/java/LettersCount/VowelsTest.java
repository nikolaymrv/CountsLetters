package LettersCount;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsTest {

	private VowelsCounter vowelsTest;
	
	@Test
	public void test() {
		vowelsTest = new VowelsCounter();
		String s = "Hello";
		assertEquals(2, vowelsTest.getLettersCount(s), 0);
	}

	@Test
	public void test2() {
		vowelsTest = new VowelsCounter();
		String s = "Hll";
		assertEquals(0, vowelsTest.getLettersCount(s), 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void test3() {
		vowelsTest = new VowelsCounter();
		String s = null;
		vowelsTest.getLettersCount(s);
	}
}
