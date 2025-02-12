package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;

@DisplayName("Testing arithmetic ops")
class CalculatorTest {

	static Calculator c1;
	
	@BeforeAll
	static void createCalculator() {
		c1 = new Calculator();
		System.out.println("----Started-----");
	}
	
	@AfterAll
	static void removeCalculator() {
		c1 = null;
		System.out.println("----Ended-----");
	}
	
	@BeforeEach
	void xyz() {
		System.out.println("Before each testcase-----");
	}
	
	@AfterEach
	void abc() {
		System.out.println("After each testcase-----");
	}
	
	@Test
	@Disabled
	void test() {
		//fail("Not yet implemented");
		assertTrue(true);
		
	}
	@Test
	void testAdd() {
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not correct");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not correct");
		assertEquals(-10, c1.add(-30, 20), ()->"Sum result is not correct");
	}
	
	@Test
	void testDiv() {
		assertEquals(2, c1.div(10, 5), ()->"Wrong division answer");
		assertThrows(ArithmeticException.class, ()->c1.div(90, 0)); // Testing for exceptions
	}
	
	@Test
	@DisplayName("Testing Multiply Operation")
	void testMul() {
		System.out.println("Start of testMul method");
		assertAll(
				()->assertEquals(100, c1.mul(20, 5)),
				()->assertEquals(60, c1.mul(20, 3)),
				()->assertEquals(80, c1.mul(10, 8))
		);
		System.out.println("End of testMul");
	}

}
