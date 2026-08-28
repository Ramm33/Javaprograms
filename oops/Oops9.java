package com.oops;

//concept used for : 
//Encapsulation the employee variables are private ,
//and they are accessing through getters and  Setters

public class Oops9 {

	private int eid;
	private String ename;
	private String Company;
	private String Role;
	private  String Password;
	private double salary;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}

	public String getCompany() {
		return Company;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}

	public String getRole() {
		return Role;
	}
	public void setPassword( String Password) {
		this.Password = Password;
	}

	public String getPassword() {
		return Password;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		if (salary > 0) {
			return salary;
		} else {
			System.out.println("Invalid salary");
			return 0;
		}
	}
	public static void main(String[] args) {

        Oops9 emp = new Oops9();

        emp.setEid(4);
        emp.setEname("KARTHIK");
        emp.setCompany("AMAZON");
        emp.setRole("JAVA DEVELOPER");
        emp.setPassword("KARTHIK123");
        emp.setSalary(180000);  
        System.out.println("Employee ID: " + emp.getEid());
        System.out.println("Employee Name: " + emp.getEname());
        System.out.println("Company: " + emp.getCompany());
        System.out.println("Role: " + emp.getRole());
        System.out.println("Password: " + emp.getPassword());
        System.out.println("Salary: " + emp.getSalary());
    }
}
