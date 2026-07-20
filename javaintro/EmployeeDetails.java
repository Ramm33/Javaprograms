package com.javaintro;

public class EmployeeDetails {
	

	public static void main(String[] args) {
		
		int employeeID = 101;
	    char employeeGrade = 'A';
	    double employeeSalary = 55000.75;
	    boolean isPermanentEmployee = true;
	    int employeeExperience = 5;
	    int workingDays = 26;
	    long phoneNumber = 9876543210L;
	    double bonusAmount = 10000.50;
	    
	    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	    System.out.println("main method started");
		
		System.out.println("========= Employee Details =========");
        System.out.println("Employee ID           : " + employeeID);
        System.out.println("Employee Grade        : " + employeeGrade);
        System.out.println("Employee Salary       : ₹" + employeeSalary);
        System.out.println("Permanent Employee    : " + isPermanentEmployee);
        System.out.println("Experience (Years)    : " + employeeExperience);
        System.out.println("Working Days          : " + workingDays);
        System.out.println("Phone Number          : " + phoneNumber);
        System.out.println("Bonus Amount          : ₹" + bonusAmount);

	}

}
