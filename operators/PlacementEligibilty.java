package com.operators;
public class PlacementEligibilty {
    public static void main(String[] args) {

        String name = "Karthik";

        double cgpa = 8.2;
        double attendance = 82;
        int backlogs = 0;

        boolean noBacklogs = !(backlogs > 0);

        boolean condition1 =cgpa >= 7.0 && attendance >= 75 && noBacklogs;

        boolean condition2 =cgpa >= 8.5 &&noBacklogs;
        boolean placementEligible = condition1 || condition2;

        System.out.println("===== PLACEMENT DETAILS =====");

        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Attendance : " + attendance);
        System.out.println("Backlogs   : " + backlogs);

        System.out.println("\n===== CONDITIONS =====");

        System.out.println("No Backlogs : " + noBacklogs);
        System.out.println("Condition 1 : " + condition1);
        System.out.println("Condition 2 : " + condition2);

        System.out.println("----------------------------");
        System.out.println("Placement Eligible : "
                + placementEligible);
    }
}