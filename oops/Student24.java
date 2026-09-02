package com.oops;

public class Student24 extends Person23 {

    String collegeName;

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {

        Student24 s = new Student24();

        s.name = "Karthik";
        s.age = 22;
        s.collegeName = "SRGEC";

        s.displayStudent();
    }
}