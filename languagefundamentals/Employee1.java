package com.languagefundamentals;

public class Employee1 {
	int Empid;
	String EmpName;
	double Salary;
	
	Employee1(int Empid,String EmpName,double Salary){
		this.Empid=Empid;
		this.EmpName=EmpName;
		this.Salary=Salary;
	}
	Employee1(Employee1 e1){
		this.Empid=Empid;
		this.EmpName=EmpName;
		this.Salary=Salary;
	}
	void display() {
		System.out.println("Empid:"+Empid);
		System.out.println("EmpName:"+EmpName);
		System.out.println("salary:"+Salary);
		
	}
	void increamentsalary(double amount) {
		Salary=Salary+amount;
		
	}
	
	public static void main(String[] args) {
		Employee1 Emp1=new Employee1(101,"krishna",50000);
		Employee1 Emp2=new Employee1(Emp1);
		Emp2.increamentsalary(10000);
		Emp2.EmpName="ravi";
		System.out.println("******************EMPLOYEE DETAILS**********");
		System.out.println("Employee1");
		Emp1.display();
		System.out.println("*************************************************");
		System.out.println("Employee2");
		Emp2.display();

	}

}
