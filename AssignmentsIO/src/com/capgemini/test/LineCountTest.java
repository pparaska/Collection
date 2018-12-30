package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.LineCount;

public class LineCountTest {

	@Test
	public void testForFileExist() {
		LineCount lineCount = new LineCount();
		String path = "C:/Work/JavaFile.txt";
		boolean actual = lineCount.isFileExist(path);
		assertEquals(true, actual);
	}

	@Test
	public void testToCheckFileDoesNotExists() {
		LineCount lineCount = new LineCount();
		String path = "C:/Work/JavaFile.txt";
		boolean actual = lineCount.isFileExist(path);
		assertEquals(true, actual);
	}

	@Test
	public void testForLineCount() {
		LineCount lineCount = new LineCount();
		String path = "C:/Work/JavaFile.txt";
		int actual = lineCount.countLineOfFile(path);
		assertEquals(3, actual);
		System.out.println("File has "+actual+" number of lines");

	}

}