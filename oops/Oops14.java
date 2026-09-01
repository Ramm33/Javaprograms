package com.oops;

import java.util.Scanner;

public class Oops14{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Oops13 b = new Oops13();
		System.out.println("Enter AccountNumber:");
		b.setAccountNumber(sc.nextInt());
		System.out.println("Enter HolderName:");
		b.setAchName(sc.next());
		System.out.println("Enter Balance:");
		b.setBalance(sc.nextDouble());

		System.out.println("AccountNumber: " + b.getAccountNumber());
		System.out.println("AchName:" + b.getAchName());
		System.out.println("Balance :" + b.getBalance());
		b.deposit(5000.0);
		System.out.println("Balance :" + b.getBalance());
		b.widthraw(150000);
		System.out.println("Balance :" + b.getBalance());
		b.deposit(-5000);
		System.out.println("Balance :" + b.getBalance());


	}
}