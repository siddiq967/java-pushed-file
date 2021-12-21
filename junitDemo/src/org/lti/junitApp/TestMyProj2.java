package org.lti.junitApp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMyProj2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before the test class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after the test class");
	}
	

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before the test method:opening file");
		fst=new FileInputStream("")
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after the test method:closing file");
	}

	@Test
	void test1() {
		MyProj obj = new MyProj();
		String res = obj.solution(fst);
		
		assertEquals("hello",res);
	}
	


}
