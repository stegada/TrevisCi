package it.trevisci.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FirstTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new Integer(2), FirstClass.due());
	}

	@Test
	public void test2() {
		assertEquals(new Integer(3), FirstClass.due());
	}

}
