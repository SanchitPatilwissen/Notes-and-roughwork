package junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@DisplayName("Testing arithmetic ops")
@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {

	static Calculator c1;
	static int x = 2;
	static boolean condition = false;
	
	CalculatorTest(){
		System.out.println("<==CalculatorTest Object Created==>");
	}
	
	@BeforeAll
	static void createCalculator() {
		c1 = new Calculator();
		if(x!=0) condition=true;
		System.out.println("----Started-----");
	}
	
	@AfterAll
	@Tag("Math")
	static void removeCalculator() {
		c1 = null;
		System.out.println("----Ended-----");
	}
	
	@BeforeEach
	@Tag("demo")
	void xyz() {
		System.out.println("Before each testcase-----");
	}
	
	@AfterEach
	@Tag("demo")
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
	@Tag("Math")
	void testAdd() {
		assertEquals(30, c1.add(10, 20), ()->"Sum result is not correct");
		assertEquals(50, c1.add(30, 20), ()->"Sum result is not correct");
		assertEquals(-10, c1.add(-30, 20), ()->"Sum result is not correct");
	}
	
	@Test
	@Tag("Math")
	void testDiv() {
		assertEquals(2, c1.div(10, 5), ()->"Wrong division answer");
		assertThrows(ArithmeticException.class, ()->c1.div(90, 0)); // Testing for exceptions
	}
	
	@Test
	@DisplayName("Testing Multiply Operation")
	@Tag("Math")
	void testMul() {
		System.out.println("Start of testMul method");
		assertAll(
				()->assertEquals(100, c1.mul(20, 5)),
				()->assertEquals(60, c1.mul(20, 3)),
				()->assertEquals(80, c1.mul(10, 8))
		);
		System.out.println("End of testMul");
	}
	
	@Test
	@Tag("Math")
	void testMod() {
		
		assertAll(
				()->assertEquals(1, c1.mod(22, 7)),
				()->assertEquals(6, c1.mod(22, 8)),
				()->assertEquals(7, c1.mod(19, 12))
		);
	}
	
	@Test
	@Tag("demo")
	void testDynamically() {
		System.out.println("Testing dynamically started");
		assertEquals(5, c1.div(10, x));
		assumeTrue(condition);
		assertEquals(15, c1.div(30, x));
		assertEquals(20, c1.div(40, x));
		
		System.out.println("Testing dynamically finished");
	}

}
