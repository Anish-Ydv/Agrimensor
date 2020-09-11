package co.lti.test;

import com.lti.code.Arithmetic;
import org.junit.Before;
import org.junit.Test;

public class TestArithmetic {
	private Arithmetic arth;
	
	@Before
	public void init() {
		arth = new Arithmetic();
	}
	
	@Test
	public void testSum() {
		assertEquals(10,arth.sum(4, 6));
	}
}
