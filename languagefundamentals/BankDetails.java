package com.languagefundamentals;

public class BankDetails {
	static int count = 10012010;
	    int accountNumber;
	    String ifscCode;
	    String holderName;
	    double balance;
	    String bankName;

	    BankDetails(String ifscCode, String holderName, double balance, String bankName) {
	        accountNumber = count++;
	        this.ifscCode = ifscCode;
	        this.holderName = holderName;
	        this.balance = balance;
	        this.bankName = bankName;
	    }

	    void display() {
	        System.out.println("*********BankDetails******");
	        System.out.println("Account Number : " + accountNumber);
	        System.out.println("IFSC Code      : " + ifscCode);
	        System.out.println("Holder Name    : " + holderName);
	        System.out.println("Balance        : " + balance);
	        System.out.println("Bank Name      : " + bankName);
	    }

	    public static void main(String[] args) {

	        BankDetails b1 = new BankDetails("SBIN0001234", "Ram", 50000, "SBI");
	        BankDetails b2 = new BankDetails("HDFC0005678", "Ravi", 60000, "HDFC");
	        BankDetails b3 = new BankDetails("ICIC0009012", "Sita", 70000, "ICICI");

	        b1.display();
	        b2.display();
	        b3.display();
	    }
	}