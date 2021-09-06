package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalciTest {

	@Test
	public void testAdd() {
		calci c =new calci();
		int res=c.add(10, 20);
		assertEquals(30, res);
		
	}

}
