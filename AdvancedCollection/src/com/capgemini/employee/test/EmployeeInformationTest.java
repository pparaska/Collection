package com.capgemini.employee.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.collections.EmployeeAccountRelation;
import com.capgemini.employee.collections.EmployeeInformation;
import com.capgemini.employee.collections.MMSavingsAccount;

public class EmployeeInformationTest {

	private EmployeeInformation employeeInformation1;
	private EmployeeInformation employeeInformation2;
	private EmployeeInformation employeeInformation3;
	private EmployeeInformation employeeInformation4;
	private EmployeeInformation employeeInformation5;

	private MMSavingsAccount mmSavingsAccount1;
	private MMSavingsAccount mmSavingsAccount2;
	private MMSavingsAccount mmSavingsAccount3;
	private MMSavingsAccount mmSavingsAccount4;
	private MMSavingsAccount mmSavingsAccount5;

	@Before
	public void setUp() {
		employeeInformation1 = new EmployeeInformation(101, "Poonam",
				"Developer", 15000, 500);
		employeeInformation2 = new EmployeeInformation(102, "Archana",
				"Manager", 50000, 0);
		employeeInformation3 = new EmployeeInformation(103, "Amir", "Engineer",
				35000, 2000);
		employeeInformation4 = new EmployeeInformation(104, "Shital",
				"Trainer", 45000, 0);
		employeeInformation5 = new EmployeeInformation(105, "Yash", "Clerk",
				30000, 3000);

		mmSavingsAccount1 = new MMSavingsAccount(12345, "Poonam", 20000, true);
		mmSavingsAccount2 = new MMSavingsAccount(25461, "Archana", 60000, true);
		mmSavingsAccount3 = new MMSavingsAccount(55124, "Amir", 50000, true);
		mmSavingsAccount4 = new MMSavingsAccount(25631, "Shital", 55000, true);
		mmSavingsAccount5 = new MMSavingsAccount(59741, "Yash", 45000, true);

	}

	@Test
	public void testForCheckRelationBetweenEmployeeAndBank() {
		HashMap<String, EmployeeAccountRelation> hashMap = new HashMap<String, EmployeeAccountRelation>();
		hashMap.put("Poonam", new EmployeeAccountRelation(employeeInformation1,
				mmSavingsAccount1));
		hashMap.put("Archana", new EmployeeAccountRelation(
				employeeInformation2, mmSavingsAccount2));
		hashMap.put("Amir", new EmployeeAccountRelation(employeeInformation3,
				mmSavingsAccount3));
		hashMap.put("Shital", new EmployeeAccountRelation(employeeInformation4,
				mmSavingsAccount4));
		hashMap.put("Yash", new EmployeeAccountRelation(employeeInformation5,
				mmSavingsAccount5));

		String actual = hashMap.get("Poonam").toString();
		String expected = "EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeID=101, employeeName=Poonam, employeeDesignation=Developer, salary=15000.0, commission=500.0], "
				+ "mmSavingsAccount=MMSavingsAccount [accountID=12345, accountHolderName=Poonam, accountBalance=20000.0, isSalary=true]]";
		assertEquals(expected, actual);
	}

}
