package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.FileExist;

public class FileExistTest {

	@Test
	public void testForFilePresent() {
		FileExist file = new FileExist("C:/Work/JavaFile.txt");
		boolean actual = file.isFileExists(file);
		boolean expected = true;
		assertTrue(actual == expected);
	}

	@Test
	public void testForFileNotPresent() {
		FileExist file = new FileExist("C:/Work/Java.txt");
		boolean actual = file.isFileExists(file);
		boolean expected = false;
		assertFalse(actual == expected);

	}

}
