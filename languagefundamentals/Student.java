package com.languagefundamentals;

public class Student {
	int Id;
	String Name;
	double marks;
	
	Student(int StudentId,String StudentName,int marks){
		this.Id=Id;
		this.Name=Name;
		this.marks=marks;
		
	}
	void show() {
		System.out.println("Studentid:"+Id);
		System.out.println("StudentName:"+Name);
		System.out.println("Marks:"+marks);
	}

	public static void main(String[] args) {
		Student s1 =new Student(101,"karthik",92);
		Student s2 =new Student(102,"Satvik",80);
		Student s3 =new Student(103,"Vikram",90);
		
		s1.show();
		s2.show();
		s3.show();

	}

}
