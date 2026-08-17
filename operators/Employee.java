package com.operators;

public class Employee {
    public static void main(String[] args) {

        String employeeName = "Karthik";

        int experience = 4;
        double performance = 85;
        boolean warning = false;

        boolean experienceCheck = experience >= 3;
        boolean performanceCheck = performance >= 80;
        boolean noWarning = !warning;

        boolean eligible = experienceCheck && performanceCheck && noWarning;

        System.out.println("===== EMPLOYEE DETAILS =====");

        System.out.println("Employee Name : " + employeeName);
        System.out.println("Experience    : " + experience);
        System.out.println("Performance   : " + performance);
        System.out.println("Warning       : " + warning);

        System.out.println("\n===== PROMOTION CHECK =====");
        System.out.println("Experience >= 3 : "+ experienceCheck);
        System.out.println("Performance >= 80 : "+ performanceCheck);
        System.out.println("No Warning : "+ noWarning);
        System.out.println("----------------------------");
        System.out.println("Promotion Eligible : "+ eligible);
    }
}