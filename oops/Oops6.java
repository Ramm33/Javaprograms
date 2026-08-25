package com.oops;

public class Oops6 {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNo(123456789);
        b.setAccountHolder("Karthik");
        b.setBalance(25000);

        System.out.println(b.getAccountNo());
        System.out.println(b.getAccountHolder());
        System.out.println(b.getBalance());
    }
}