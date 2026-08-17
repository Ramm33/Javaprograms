package com.JourneyOfLearningJavaIn100Days;

import java.util.Scanner;

public class Student1 {

    int id;
    String Name;
    int Marks;
    String Grade;

    void display() {
        System.out.println(id);
        System.out.println(Name);
        System.out.println(Marks);
        System.out.println(Grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student S1 = new Student();

        System.out.println("Enter Student ID:");
        S1.id = sc.nextInt();

        System.out.println("Enter Student Name:");
        S1.Name = sc.next();

        System.out.println("Enter Marks:");
        S1.Marks = sc.nextInt();

        System.out.println("Enter Grade:");
        S1.Grade = sc.next();

        S1.display();

        sc.close();
    }
}