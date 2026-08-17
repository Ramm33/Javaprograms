package com.languagefundamentals;

public class Student2 {
	int id;
	String Name;
	String Course;
	Student2(){
		System.out.println("No arg-Constructor");
		this(1);
	}
	Student2(int id){
		this(1,"sai");
	}
	Student2(int id,String Name){
		this(1,"sai","cse");
	}
	Student2(int id,String Name,String Course){
		this.id=id;
		this.Name=Name;
		this.Course=Course;
	}
	void display() {
		System.out.println("id:"+id);
		System.out.println("Name:"+Name);
		System.out.println("Course:"+Course);
	}


	public static void main(String[] args) {
		System.out.println("*******Details********");
		Student2 S1=new Student2();
		S1.display();

	}

}
