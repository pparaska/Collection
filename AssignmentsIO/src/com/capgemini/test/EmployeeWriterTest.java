package com.capgemini.test;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.EmployeeWriter;

public class EmployeeWriterTest{
	private  EmployeeWriter employee;
	@Before
	public void setUp(){
		employee = new EmployeeWriter(201,"Shyam",55000);
	}

	@Test
	public void writerTest() throws IOException{
		String details = employee.toString();
		FileWriter fw = new FileWriter("C:/Work/employee.txt");
		fw.write(details);
		fw.close();
	}
}
