package LettersCount;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsonantsTest {

	private Consonantsimpl consonantsTest;
	
	@Test
	public void test() {
		consonantsTest = new Consonantsimpl();
		String s = "Hello";
		assertEquals(3, consonantsTest.getNameLength(s), 0);
	}

	@Test
	public void test2() {
		consonantsTest = new Consonantsimpl();
		String s = "eo";
		assertEquals(0, consonantsTest.getNameLength(s), 0);
	}
	
}
