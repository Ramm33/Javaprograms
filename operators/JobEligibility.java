package com.operators;

import java.util.Scanner;

public class JobEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Degree Completed? (true/false): ");
        boolean degreeCompleted = sc.nextBoolean();

        System.out.print("Any Backlogs? (true/false): ");
        boolean backlogs = sc.nextBoolean();

        boolean ageCheck = age >= 18;
        boolean cgpaCheck = cgpa >= 7.0;
        boolean backlogCheck = !backlogs;

        boolean eligible = ageCheck && cgpaCheck && degreeCompleted && backlogCheck;

        System.out.println("\n========== JOB ELIGIBILITY ==========");
        System.out.println("Name             : " + name);
        System.out.println("Age Check        : " + ageCheck);
        System.out.println("CGPA Check       : " + cgpaCheck);
        System.out.println("Degree Check     : " + degreeCompleted);
        System.out.println("No Backlogs      : " + backlogCheck);
        System.out.println("-------------------------------------");
        System.out.println("Eligible         : " + eligible);

        sc.close();
    }
}