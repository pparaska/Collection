package com.capgemini.employee.collections;

/**
 * 
 * @author pparaska b. MMASaving Account class will have fields accountID,
 *         accountholder_name, account_balance, isSalaryAccount with that they
 *         will have setter and getter methods
 */

public class MMSavingsAccount {

	private int accountID;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalary;

	public MMSavingsAccount(int accountID, String accountHolderName,
			double accountBalance, boolean isSalary) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalary = isSalary;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
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

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "MMSavingsAccount [accountID=" + accountID
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalary="
				+ isSalary + "]";
	}

}
