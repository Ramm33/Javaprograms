package com.languagefundamentals;

public class Employee {
	int EmpId;
	String EmpName;
	String Dept;
	double salary;
	
	Employee(int EmpId,String EmpName,String Dept,double salary){
		this.EmpId=EmpId;
		this.Dept=Dept;
		this.EmpName=EmpName;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("EmpId:"+EmpId);
		System.out.println("EmpName:"+EmpName);
		System.out.println("Dept:"+Dept);
		System.out.println("salary:"+salary);
	}

	public static void main(String[] args) {
		Employee e1= new Employee(101,"karthik","Accounts",50000.0);
		Employee e2= new Employee(102,"harsha","saleman",30000.0);
		Employee e3= new Employee(103,"Abhi","clerk",25000.0);
		Employee e4= new Employee(104,"Vikram","manager",60000.0);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		

	}

}
