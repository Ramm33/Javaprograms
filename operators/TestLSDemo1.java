package com.operators;

//1.Write a Java program to create a simple calculator using the ternary operator. The program should accept two numbers and an operator. If the operator is '+', perform addition; otherwise, perform subtraction.

//Sample Input 1:
//Enter first number: 10
//Enter second number: 5
//Enter operator (+ or -): +
//Sample Output 1:
//Result: 15
import java.util.Scanner;


public class TestLSDemo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+ or - or = or * or /): ");
        char op = sc.next().charAt(0);

        int result = (op == '+') ? (num1 + num2) : (num1 - num2);

        System.out.println("Result: " + result);

        sc.close();
    }
}