package com.lti.test;

import com.lti.code.Arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {
	private Arithmetic arth;
	
	@Before
	public void init() {
		arth = new Arithmetic();
	}
	
	@Test
	public void testSum() {
		assertEquals(10,arth.sum(4, 6));
	}
	
	@Test
	public void testDifference() {
		assertEquals(2,arth.difference(6, 4));
	}
}