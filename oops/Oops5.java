package com.oops;
//
class BankAccount {

    private long accountNo;
    private String accountHolder;
    private double balance;

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        if (balance >= 0) {
            return balance;
        } else {
            System.out.println("Invalid Balance");
            return 0;
        }
    }
}