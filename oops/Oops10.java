package com.oops;


public class Oops10 {

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