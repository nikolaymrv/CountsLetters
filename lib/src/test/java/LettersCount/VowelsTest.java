package LettersCount;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsTest {

	private Vowelsimpl vowelsTest;
	
	@Test
	public void test() {
		vowelsTest = new Vowelsimpl();
		String s = "Hello";
		assertEquals(2, vowelsTest.getNameLength(s), 0);
	}

	@Test
	public void test2() {
		vowelsTest = new Vowelsimpl();
		String s = "Hll";
		assertEquals(0, vowelsTest.getNameLength(s), 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void test3() {
		vowelsTest = new Vowelsimpl();
		String s = null;
		vowelsTest.getNameLength(s);
	}
}
