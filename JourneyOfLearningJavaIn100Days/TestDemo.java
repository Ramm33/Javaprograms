package com.JourneyOfLearningJavaIn100Days;

public class TestDemo {
	int id;
	String Name;
	double Salary;
	
	void display() {
		System.out.println(id);
		System.out.println(Name);
		System.out.println(Salary);
	}

	public static void main(String[] args) {
		TestDemo n=new TestDemo();
		n.id=10;
		n.Name="karthik";
		n.Salary=100000;
		n.display();

	}

}
