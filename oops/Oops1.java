package com.oops;

public class Oops1 {

    private int eid;
    private String ename;
    private double salary;

    // Setter for Employee ID
    public void setEid(int eid) {
        this.eid = eid;
    }

    // Getter for Employee ID
    public int getEid() {
        return eid;
    }

    // Setter for Employee Name
    public void setEname(String ename) {
        this.ename = ename;
    }

    // Getter for Employee Name
    public String getEname() {
        return ename;
    }

    // Setter for Salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for Salary
    public double getSalary() {
        if (salary > 0) {
            return salary;
        } else {
            System.out.println("Invalid salary");
            return 0;
        }
    }
}