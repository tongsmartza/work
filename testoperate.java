package work;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testoperate {
	private operate opper;
	
	@Before
	public void setup() {
		opper = new operate();
	}

	@Test
	public void test() {
		
		assertEquals(10,opper.adder(5, 5),0.001);
		assertEquals(5,opper.adder(5, 0),0.001);
		assertEquals(5,opper.adder(0, 5),0.001);
		assertEquals(-10,opper.adder(-5, -5),0.001);
		assertEquals(5,opper.adder(10, -5),0.001);
		
		assertEquals(5,opper.subtracter(10, 5),0.001);
		assertEquals(5,opper.subtracter(5, 0),0.001);
		assertEquals(-5,opper.subtracter(0, 5),0.001);
		assertEquals(0,opper.subtracter(-5, -5),0.001);
		assertEquals(10,opper.subtracter(5, -5),0.001);
		
		assertEquals(18,opper.multiplier(9, 2),0.001);
		assertEquals(0,opper.multiplier(5, 0),0.001);
		assertEquals(0,opper.multiplier(0, 5),0.001);
		assertEquals(-18,opper.multiplier(9, -2),0.001);
		assertEquals(-18,opper.multiplier(-2, 9),0.001);
		
		assertEquals(5,opper.divider(20, 4),0.001);
		assertEquals(5,opper.divider(5, 1),0.001);
		assertEquals(5,opper.divider(1, 5),0.001);
		assertEquals(-5,opper.divider(-20, 4),0.001);
		assertEquals(1,opper.divider(5, 5),0.001);
		
	}

}