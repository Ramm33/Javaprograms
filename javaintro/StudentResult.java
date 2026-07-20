package com.javaintro;
import java.util.Scanner;

public class StudentResult {
	static void displayStudent(String Name) {
		System.out.println("studentName:"+Name);
		
	}
	
	 static void calculateTotal(int m1,int m2,int m3) {
		int total=m1+m2+m3;
		System.out.println("totalmark:"+total);
		
    }
	
	static void calculateAverage(int m1,int m2,int m3) {
		double Average=(m1+m2+m3)/3.0;
		System.out.println("average:"+Average);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String n= sc.nextLine();
		System.out.println("Enter Marks in Subject m1:");
		int m1 =sc.nextInt();
		System.out.println("Enter Marks in Subject m2:");
		int m2 =sc.nextInt();
		System.out.println("Enter Marks in Subject m3:");
		int m3 =sc.nextInt();
		
		System.out.println("-------studentResult-------");
		
		displayStudent(n);
		calculateTotal( m1, m2,m3);
		calculateAverage(m1,m2,m3);
		sc.close();
		
		
	}

}
