package com.savings.account.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.savings.account.BankAccountList;
import com.savings.account.SavingsAccount;

/**
 * 
 * 1)Create a Class SavingAccount with field’s acc_balance, acc_ID,
 * accountHoldername, isSalaryAccount. Also add setter and getter methods with
 * business method like withdraw and deposit. a.Create 5 different object of
 * SavingAccount and add them into ArrayList, now interate the arraylist and
 * display all SavingAccount’s object one by one. b.Now save the ArrayList which
 * contains SavingAccount’s object into a file and read the file and display all
 * savingAccount Object one by one. c.Create class BankAccountList which will
 * maintain SavingAccount objects. Ensure that this class should not allow
 * duplicates as well as data should be displayed in sorted order. (as per
 * acc_ID)
 * 
 */
public class SavingsAccountTest {
	private SavingsAccount savingsAccount1;
	private SavingsAccount savingsAccount2;
	private SavingsAccount savingsAccount3;
	private SavingsAccount savingsAccount4;
	private SavingsAccount savingsAccount5;
	private BankAccountList bankAccountList;
	List<SavingsAccount> arrayList = new ArrayList<SavingsAccount>();

	@Before
	public void setUp() {
		savingsAccount1 = new SavingsAccount(101, "Poonam", 10000, true);
		savingsAccount2 = new SavingsAccount(102, "Archana", 20000, true);
		savingsAccount3 = new SavingsAccount(103, "Shital", 30000, true);
		savingsAccount4 = new SavingsAccount(104, "Yash", 40000, false);
		savingsAccount5 = new SavingsAccount(105, "Govind", 50000, true);

		arrayList.add(savingsAccount1);
		arrayList.add(savingsAccount2);
		arrayList.add(savingsAccount3);
		arrayList.add(savingsAccount4);
		arrayList.add(savingsAccount5);

	}

	@Test
	public void testForWritingObjectsFromArrayListInFile()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		for (SavingsAccount savingsAccount : arrayList) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(
							"C:\\Users\\pparaska\\Desktop\\BankAccountList.txt"));
			objectOutputStream.writeObject(savingsAccount);
			objectOutputStream.close();
		}
		for (SavingsAccount savingsAccount : arrayList) {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(
							"C:\\Users\\pparaska\\Desktop\\BankAccountList.txt"));
			SavingsAccount savingAccount = (SavingsAccount) objectInputStream
					.readObject();
			objectInputStream.close();
		}
	}

	@Test
	public void testObjectsThroughArrayList() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		bankAccountList = new BankAccountList();
		Set<SavingsAccount> set = bankAccountList.addAccounts(arrayList);
		String expected = "[SavingsAccount [accountBalance=10000.0, accountId=101, accountHolderName=Poonam, salaried=true], "
				+ "SavingsAccount [accountBalance=20000.0, accountId=102, accountHolderName=Archana, salaried=true], "
				+ "SavingsAccount [accountBalance=30000.0, accountId=103, accountHolderName=Shital, salaried=true], "
				+ "SavingsAccount [accountBalance=40000.0, accountId=104, accountHolderName=Yash, salaried=false], "
				+ "SavingsAccount [accountBalance=50000.0, accountId=105, accountHolderName=Govind, salaried=true]]";
		String actual = set.toString();
		assertEquals(expected, actual);
	}
}