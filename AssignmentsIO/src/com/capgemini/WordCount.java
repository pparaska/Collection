package com.capgemini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Poonam Paraskar WordCount class counts the words number of words of
 *         file.
 */

public class WordCount {
	private int words = 0;
	private int line = 0;

	public int getWordsCount() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("C:/Work/JavaFile.txt");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fileReader);

		String string1 = "";
		String string2 = "";
		try {
			while ((string1 = br.readLine()) != null) {
				string2 += string1 + " ";
				line++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		StringTokenizer stringTokenizer = new StringTokenizer(string2);
		while (stringTokenizer.hasMoreTokens()) {
			String s = stringTokenizer.nextToken();
			words++;

		}
		System.out.println("Given File has " + words + " number of words");
		return words;
	}
}