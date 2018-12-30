package com.capgemini;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public class EmployeeReader {
		public String displayEmployee(FileReader fw) throws IOException{
			String line ="";
			String storeLine="";
			BufferedReader br = new BufferedReader(fw);
			while((storeLine = br.readLine())!= null){
			line+=storeLine;
			}
			return line;
			}
	}


