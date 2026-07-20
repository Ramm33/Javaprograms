package com.javaintro;

import java.util.Scanner;

public class LoanInterest {
	double calculateInterest(double principal,double rate,int time) {
		return(principal*rate*time)/100;
	}
	

	 void main(String[] args) {
		 System.out.println("main method started:");
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the principal amount :");
		 double principal =sc.nextDouble();
		 System.out.println("Enter the  Interest rate:");
		 double rate =sc.nextDouble();
		 System.out.println("Enter the time:");
		 int time =sc.nextInt();
		 
		 double interest = calculateInterest(principal,rate,time);
		 System.out.println("simple Interest ="+interest);
		 
		 
			

	}

}
