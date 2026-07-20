package com.javaintro;

public class Employee {
	static String companyname;
	static String location;
	
	String employeename;
	int salary;
	
	static {
		companyname = "Google";
		location = "Hyderabad";		
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.employeename="karthik";
		e1.salary=700000;
		Employee e2=new Employee();
		e2.employeename="karthik babu";
		e2.salary=800000;
		
		
		System.out.println("Employee1 Details:");
		System.out.println("------------------------------------------------------------");
		System.out.println("Employee Name="+e1.employeename);
		System.out.println("Employee Salary="+e1.salary);
		System.out.println("Company Name:"+companyname);
		System.out.println("Location:"+location);
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Employee2 Details:");
		System.out.println("------------------------------------------------------------");
		System.out.println("Employee Name="+e2.employeename);
		System.out.println("Employee Salary="+e2.salary);
		System.out.println("Company Name:"+companyname);
		System.out.println("Location:"+location);
		System.out.println("------------------------------------------------------------");
		

	}

}
