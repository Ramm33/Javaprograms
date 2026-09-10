package com.oops;

class Student29 {
    void calculateGrade(int marks) {
        System.out.println("Grade calculation");
    }
}

class EngineeringStudent extends Student29 {
    @Override
    void calculateGrade(int marks) {
        if (marks >= 90)
            System.out.println("Engineering Grade: A");
        else if (marks >= 75)
            System.out.println("Engineering Grade: B");
        else
            System.out.println("Engineering Grade: C");
    }
}

class MedicalStudent extends Student29 {
    @Override
    void calculateGrade(int marks) {
        if (marks >= 90)
            System.out.println("Medical Grade: A");
        else if (marks >= 75)
            System.out.println("Medical Grade: B");
        else
            System.out.println("Medical Grade: C");
    }
}

class ManagementStudent extends Student29{
    @Override
    void calculateGrade(int marks) {
        if (marks >= 90)
            System.out.println("Management Grade: A");
        else if (marks >= 75)
            System.out.println("Management Grade: B");
        else
            System.out.println("Management Grade: C");
    }
}

