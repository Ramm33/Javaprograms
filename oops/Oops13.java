package com.oops;

public class Oops13 {

	private int AccountNumber;
	private String AchName;
	private double Balance;
	private double BankAccount;

	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAchName(String AchName) {
		this.AchName = AchName;
	}
	public void setBankAccount(double balance) {
		this.Balance=5000.0;
	}

	public String getAchName() {
		return AchName;
	}

	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	public double getBalance() {
		return Balance;
	}
 
	void deposit(double amount) {
		if(amount>0) {
			Balance+=amount;
		}else {
			System.out.println("Invalid amount");
		}
		
	}
	void widthraw(int amount) {
		Balance-=amount;
		
	}

	public double getBankAccount() {
		return BankAccount;
	}
	
}