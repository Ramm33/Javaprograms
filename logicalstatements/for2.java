package com.logicalstatements;

import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for2 obj = new for2();
        long result = obj.findFactorial(n);

        System.out.println("Factorial of " + n + " is: " + result);

        sc.close();
    }

    long findFactorial(int n) {
        long fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }
}