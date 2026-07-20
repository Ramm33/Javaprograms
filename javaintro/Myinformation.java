package com.javaintro;

public class Myinformation {
	 // Instance Variable(initializing the variables 

	String name = "Karthik Babu Kondru";
    long mobileNumber = 9876543210L;
    int age = 22;
    String city = "Andhra Pradesh";
    String qualification = "B.Tech";
    String branch = "Computer Science and Engineering";
    String college = "Seshadri Rao Gudlavalleru Engineering College";
    int graduationYear = 2026;
    String email = "karthik@example.com";
    String skills = "Java, Python, SQL, MERN Stack, Machine Learning";
    String hobbies = "Reading Books, Listening Music";
    String experience = "Fresher";
    String goal = "Become a Software Developer";
    String project = "Stroke Prediction ML, LearnHub MERN Application";
    String certification = "Microsoft AI, Infosys Springboard, TCS iON";
    
 // Methods (No Return Type + No Arguments)
    
    void getName() {
        System.out.println("Name : " + name);
    }

    void getNumber() {
        System.out.println("Mobile Number : " + mobileNumber);
    }

    void getAge() {
        System.out.println("Age : " + age);
    }

    void getCity() {
        System.out.println("City : " + city);
    }

    void getQualification() {
        System.out.println("Qualification : " + qualification);
    }

    void getBranch() {
        System.out.println("Branch : " + branch);
    }

    void getCollege() {
        System.out.println("College : " + college);
    }

    void getGraduationYear() {
        System.out.println("Graduation Year : " + graduationYear);
    }

    void getEmail() {
        System.out.println("Email : " + email);
    }

    void getSkills() {
        System.out.println("Skills : " + skills);
    }

    void getHobbies() {
        System.out.println("Hobbies : " + hobbies);
    }

    void getExperience() {
        System.out.println("Experience : " + experience);
    }

    void getGoal() {
        System.out.println("Career Goal : " + goal);
    }

    void getProject() {
        System.out.println("Projects : " + project);
    }

    void getCertification() {
        System.out.println("Certifications : " + certification);
    }

    
	public static void main(String[] args) {
		Myinformation obj = new Myinformation();

        System.out.println("++----- My Information -----++");

        obj.getName();
        obj.getNumber();
        obj.getAge();
        obj.getCity();
        obj.getQualification();
        obj.getBranch();
        obj.getCollege();
        obj.getGraduationYear();
        obj.getEmail();
        obj.getSkills();
        obj.getHobbies();
        obj.getExperience();
        obj.getGoal();
        obj.getProject();
        obj.getCertification();

	}

}
