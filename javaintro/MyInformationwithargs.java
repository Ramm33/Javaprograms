package com.javaintro;

public class MyInformationwithargs {

	    // No Return Type + With Arguments

	    void getName(String name) {
	        System.out.println("Name : " + name);
	    }

	    void getNumber(long mobileNumber) {
	        System.out.println("Mobile Number : " + mobileNumber);
	    }

	    void getAge(int age) {
	        System.out.println("Age : " + age);
	    }

	    void getCity(String city) {
	        System.out.println("City : " + city);
	    }

	    void getQualification(String qualification) {
	        System.out.println("Qualification : " + qualification);
	    }

	    void getBranch(String branch) {
	        System.out.println("Branch : " + branch);
	    }

	    void getCollege(String college) {
	        System.out.println("College : " + college);
	    }

	    void getSkills(String skills) {
	        System.out.println("Skills : " + skills);
	    }


	    public static void main(String[] args) {

	        // Object creation
	    	MyInformationwithargs obj = new MyInformationwithargs();

	        // Method Initialization / Calling with Arguments
	        obj.getName("Karthik Babu Kondru");
	        obj.getNumber(9876543210L);
	        obj.getAge(22);
	        obj.getCity("Andhra Pradesh");
	        obj.getQualification("B.Tech");
	        obj.getBranch("Computer Science and Engineering");
	        obj.getCollege("Seshadri Rao Gudlavalleru Engineering College");
	        obj.getSkills("Java, Python, SQL, MERN Stack");
	    }
	}

	