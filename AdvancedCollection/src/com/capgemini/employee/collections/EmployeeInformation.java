package com.capgemini.employee.collections;

/**
 * 
 * @author Poonam Paraskar Employee_information class will have fields empID,
 *         Employee_name, employee_designation , Employee_salary, employee_comm
 *         with that they will have setter getter methods
 */
public class EmployeeInformation {

	private int employeeID;
	private String employeeName;
	private String employeeDesignation;
	private double salary;
	private double commission;

	public EmployeeInformation(int employeeID, String employeeName,
			String employeeDesignation, double salary, double commission) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.salary = salary;
		this.commission = commission;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [employeeID=" + employeeID
				+ ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", salary=" + salary + ", commission="
				+ commission + "]";
	}

}
