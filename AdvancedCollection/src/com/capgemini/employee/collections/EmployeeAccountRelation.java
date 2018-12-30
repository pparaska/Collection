package com.capgemini.employee.collections;

public class EmployeeAccountRelation {

	private EmployeeInformation employeeInformation;
	private MMSavingsAccount mmSavingsAccount;
	
	public EmployeeAccountRelation(EmployeeInformation employeeInformation,
			MMSavingsAccount mmSavingsAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmSavingsAccount = mmSavingsAccount;
	}

	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public void setEmployeeInformation(EmployeeInformation employeeInformation) {
		this.employeeInformation = employeeInformation;
	}

	public MMSavingsAccount getMmSavingsAccount() {
		return mmSavingsAccount;
	}

	public void setMmSavingsAccount(MMSavingsAccount mmSavingsAccount) {
		this.mmSavingsAccount = mmSavingsAccount;
	}

	@Override
	public String toString() {
		return "EmployeeAccountRelation [employeeInformation="
				+ employeeInformation + ", mmSavingsAccount="
				+ mmSavingsAccount + "]";
	}
	
	
	
	
	
}
