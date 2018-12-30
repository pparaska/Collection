package com.capgemini;

import java.io.Serializable;

public class EmployeeWriter implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String Name;
	private double salary;
	public EmployeeWriter(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
	}
	public EmployeeWriter() {
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary
				+ "]";
	}

	
}