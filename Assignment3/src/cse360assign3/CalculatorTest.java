package cse360assign3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void totalTest() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		calc.add(5);
		
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		
		assertEquals(-5, calc.getTotal());
	}
	
	@Test
	public void multTest() {
		Calculator calc = new Calculator();
		calc.multiply(5);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void historyTest() {
		Calculator calc = new Calculator();
		assertEquals("", calc.getHistory());
	}
}
