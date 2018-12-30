package com.capgemini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * LineCount class takes path of file as an input from user and displays number
 * of lines in that file.
 * 
 * Poonam Paraskar
 */
public class LineCount {

	public boolean isFileExist(String path) {
		File file = new File(path);
		return file.exists();
	}

	public int countLineOfFile(String path) {
		File file = new File(path);
		int count = 0;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					file));
			while (bufferedReader.readLine() != null) {
				count++;
			}
			bufferedReader.close();
			return count;

		} catch (FileNotFoundException e) {
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
