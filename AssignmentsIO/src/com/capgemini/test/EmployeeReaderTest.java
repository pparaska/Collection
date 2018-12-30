package com.capgemini.test;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.EmployeeReader;

public class EmployeeReaderTest {

	private EmployeeReader employeeReader;

	@Before
	public void setUp() {
		employeeReader = new EmployeeReader();
	}

	@Test
	public void readerTest() throws IOException {
		FileReader fw = new FileReader("C:/Work/employee.txt");
		String actual = employeeReader.displayEmployee(fw);
		String expected = "Employee [id=201, Name=Shyam, salary=55000.0]";
		assertEquals(expected, actual);
	}
}
