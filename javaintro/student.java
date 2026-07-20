package com.javaintro;

public class student {
	int Sid = 100;
	int age = 22;
	String Sname = "ram";
	
	static int collegeid = 33;
	static String collegeName = "VIT";
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Student information from Vignan!");
		student ram = new student();
		collegeid = 02;
		collegeName = "VIT";
		System.out.println("College ID : " + collegeid);
		System.out.println("College Name : " + collegeName);
		ram.Sid = 123;
		ram.Sname = "Karthik Ram";
		ram.age = 22;
		System.out.println("Student ID : " + ram.Sid);
		System.out.println("Student name: " + ram.Sname);
		System.out.println("Student age: " + ram.age);

	}
	
}
