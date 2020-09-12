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
		assertEquals(11,arth.sum(4, 6));
	}
}