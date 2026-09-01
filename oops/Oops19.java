package com.oops;

public class Oops19 {

	private int MobileNumber;
	private double balance;

	public void setMobileNumber(int MobileNumber) {
		this.MobileNumber = MobileNumber;
	}

	public int getMobileNumber() {
		return MobileNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getbalance() {
		return balance;
	}

	public void recharge(double amount) {
		balance = balance + amount;
	}

	public void makeCall(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public double getBalance() {
		return balance;
	}

}