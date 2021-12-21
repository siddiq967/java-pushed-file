package org.lti.junitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestExampleFail {

	
	@Test
	void test1() {
		int res= new ExampleFail().devideNumbers(10,2);
		assertEquals(5,res);
	}
	@Test
	void test2() {
		try {
			int res= new ExampleFail().devideNumbers(10,0);
			assertEquals(-9,res);
		}
		catch(Exception e) {
			fail();
		}
	
	}


}
