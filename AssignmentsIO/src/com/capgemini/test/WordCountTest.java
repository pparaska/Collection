package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.WordCount;

public class WordCountTest {
	private WordCount wordCount;

	@Before
	public void setUp() {
		wordCount = new WordCount();
	}

	@Test
	public void testToCheckNumberOfWordsInFile() {
		int actual = wordCount.getWordsCount();
		assertEquals(15, actual);
	}
}
