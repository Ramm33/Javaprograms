package com.operators;

import java.util.Scanner;

public class StudentEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter Attendance: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Number of Backlogs: ");
        int backlogs = sc.nextInt();

        boolean ageEligible = age >= 18;
        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean noBacklogs = backlogs == 0;

        boolean eligible =
                ageEligible &&
                marksEligible &&
                attendanceEligible &&
                noBacklogs;

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Marks      : " + marks);
        System.out.println("Attendance : " + attendance);
        System.out.println("Backlogs   : " + backlogs);

        System.out.println("\nAge Eligible        : " + ageEligible);
        System.out.println("Marks Eligible      : " + marksEligible);
        System.out.println("Attendance Eligible : " + attendanceEligible);
        System.out.println("No Backlogs         : " + noBacklogs);

        System.out.println("\nFinal Eligibility   : " + eligible);

        sc.close();
    }
}