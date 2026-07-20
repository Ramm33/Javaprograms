package com.languagefundamentals;

import java.util.Scanner;

public class Calculator {

    static void add(double a, double b) {
        System.out.println("Addition = " + (a + b));
    }

    static void subtract(double a, double b) {
        System.out.println("Subtraction = " + (a - b));
    }

    static void multiply(double a, double b) {
        System.out.println("Multiplication = " + (a * b));
    }

    static void divide(double a, double b) {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextInt();

        System.out.print("Enter second number: ");
        double b = sc.nextInt();

        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);

        sc.close();
    }
}