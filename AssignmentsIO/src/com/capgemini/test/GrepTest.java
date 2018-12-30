package com.capgemini.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.Grep;

public class GrepTest {
	private Grep searchword;

	@Before
	public void setUp() {
		searchword = new Grep();
	}

	@Test
	public void testForsearchWord() throws IOException {
		String result = searchword.findingString("C:/Work/JavaFile.txt",
				"popular");
		String expected = "Line Number= 2, Java is very popular programming language.";
		assertEquals(expected, result);

	}

}