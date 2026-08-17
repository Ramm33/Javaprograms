package com.JourneyOfLearningJavaIn100Days;

public class Employee{
	int id;
	String Name;
	double Salary;
	
	void display() {
		System.out.println(id);
		System.out.println(Name);
		System.out.println(Salary);
	}

	public static void main(String[] args) {
     Employee s1=new Employee();
     s1.id=101;
     s1.Name="Karthik";
     s1.Salary=100000;
     s1.display();
	}

}
