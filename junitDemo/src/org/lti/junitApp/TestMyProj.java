package org.lti.junitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TestMyProj {

	

	@Test
	void testSolution1() {
		MyProj prj = new MyProj();
		int res=prj.solution("alexa");
		assertEquals(5,res);
	}
	@Test
	void testSolution2() {
		MyProj prj = new MyProj();
		int res=prj.solution("alexa jacob");
		assertEquals(11,res);
	}
	@Test
	void testSolution3() {
		MyProj prj = new MyProj();
		int res=prj.solution("");
		assertEquals(0,res);
	}
	
}
