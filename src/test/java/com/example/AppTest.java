package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private Addition addition;

	/** * Initialization */
	@Before
	public void setUp() {
		addition = new Addition();
	}

	/** * Test case for add method */
	@Test
	public void test() {
		int i = addition.addTwoInt(3, 7);
		
		assertEquals(10, i);
		System.out.println("Passed Test");
	}
	@Test
	public void test2() {
		int j = addition.addTwoInt(5, 5);
		
		assertEquals(10, j);
		System.out.println("Passed 2nd Test");
	}

	/** * destroy the object */
	@After
	public void tearDown() {
		addition = null;
	}
}


