package com.JourneyOfLearningJavaIn100Days;

public class Student {
	int id;
	String Name;
	int Marks;
	String Grade;
	
	void display() {
		System.out.println(id);
		System.out.println(Name);
        System.out.println(Marks);	
        System.out.println(Grade);
	}

	public static void main(String[] args) {
		Student S1=new Student();
		
		S1.id=10;
		S1.Name="karthik";
		S1.Marks=90;
		S1.Grade="First Class";
		
		S1.display();
		

	}

}
