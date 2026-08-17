package com.languagefundamentals;

import java.util.Scanner;

public class PatientBill {
	String PatientName;
	int Age;
	double ChargePerDay;
	int daysAdmitted;
	PatientBill(String PatientName,int Age,double ChargePerDay,int daysAdmitted){
		this.PatientName=PatientName;
		this.Age=Age;
		this.ChargePerDay=ChargePerDay;
		this.daysAdmitted=daysAdmitted;
		
	}
		
	void display() {
		double Totalbill=ChargePerDay*daysAdmitted;
		System.out.println("PatientName:"+PatientName);
		System.out.println("Age:"+Age);
		System.out.println("ChargePerDay:"+ChargePerDay);
		System.out.println("daysAdmitted:"+daysAdmitted);
		System.out.println("Totalbill:"+Totalbill);
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter patientName:");
		String Name=sc.nextLine();
		System.out.println("Enter patient age:");
		int Age=sc.nextInt();
		System.out.println("Enter ChargePerDay:");
		double Charges=sc.nextDouble();
		System.out.println("Enter No of DaysAdmitted");
		int days=sc.nextInt();
		PatientBill p= new PatientBill(Name,Age,Charges,days);
		p.display();
		
	

	}

}
