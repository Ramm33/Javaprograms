package com.oops;

import java.util.Scanner;

public class TestDriver29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("HELLO WELCOME TO VCUBE UNIVERSITY :");
        System.out.println("1. Engineering Student");
        System.out.println("2. Medical Student");
        System.out.println("3. Management Student");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student29 student;

        switch (choice) {
            case 1:
                student = new EngineeringStudent();
                break;

            case 2:
                student = new MedicalStudent();
                break;

            case 3:
                student = new ManagementStudent();
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        student.calculateGrade(marks);

        sc.close();
    }
}

