package com.savings.account;

import java.io.Serializable;

import com.savings.account.InsufficientFundsException;
import com.savings.account.InvalidInputException;

/**
 * 
 * @author Poonam Paraskar 1. Create a Class SavingAccount with field’s
 *         acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add
 *         setter and getter methods with business method like withdraw and
 *         deposit. a. Create 5 different object of SavingAccount and add them
 *         into ArrayList, now interate the arraylist and display all
 *         SavingAccount’s object one by one. b. Now save the ArrayList which
 *         contains SavingAccount’s object into a file and read the file and
 *         display all savingAccount Object one by one. c. Create class
 *         BankAccountList which will maintain SavingAccount objects. Ensure
 *         that this class should not allow duplicates as well as data should be
 *         displayed in sorted order. (as per acc_ID)
 */

public class SavingsAccount implements Serializable, Comparable<SavingsAccount> {

	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean salaried;

	public SavingsAccount(int accountId, String accountHolderName,
			double accountBalance, boolean salaried) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.salaried = salaried;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result + accountId;
		result = prime * result + (salaried ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double
				.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountId != other.accountId)
			return false;
		if (salaried != other.salaried)
			return false;
		return true;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}

	@Override
	public int compareTo(SavingsAccount a) {
		if (a.accountId == this.accountId)
			return 0;
		else if (a.accountId > this.accountId)
			return -1;
		else
			return 1;
	}

	public void deposit(double amount) throws Exception {
		if (amount <= 0) {
			throw new InvalidInputException("Invalid Input");
		} else
			accountBalance = accountBalance + amount;
	}

	public void withdraw(double amount) throws Exception {
		if (amount <= 0) {
			throw new InvalidInputException("Invalid Input");
		} else if (amount > accountBalance) {
			throw new InsufficientFundsException("Insufficient Funds");
		} else
			accountBalance = accountBalance - amount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountBalance=" + accountBalance
				+ ", accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", salaried=" + salaried + "]";
	}

}