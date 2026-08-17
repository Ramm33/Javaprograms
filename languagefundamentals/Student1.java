package com.languagefundamentals;
	class Student1
	{
	    int id;
		String name;
	    int age;

	    Student1() {
	    	    id=1;
	        name = "Unknown";
	        age = 0;
	    }

	    Student1(String n) {
	    	    id=2;
	        name = n;
	        age = 0;
	    }

	    Student1(String n, int a) {
	    	    id=3;
	        name = n;
	        age = a;
	    }

	    void display() {
	    	System.out.println("id:"+id);
	        System.out.println("Name: " + name);
	        System.out.println("Age:"+age);
	        
	    }

	    public static void main(String[] args) {
	        Student1 s1 = new Student1();
	        Student1 s2 = new Student1("Harsha",120);
	        Student1 s3 = new Student1("Abhi", 18);

	        s1.display();
	        s2.display();
	        s3.display();
	    }
	}