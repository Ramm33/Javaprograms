//1.Check if a Number is an Automorphic Number.
//Definition:
//A number is called an Automorphic Number if the square of the number ends with the same number.
//Input:25 =>25 × 25 = 625
//                   625 ends with 25
//Output : Automorphic Number
//1. Find the Second Largest Digit in a Number.
//Definition:
//Given a number, find the second largest distinct digit present in it.
//Input : 987654
//Output : 8

package com.arrays;

import java.util.Scanner;

public class Array21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            n = n / 10;
        }

        if (secondLargest == -1) {
            System.out.println("Second largest distinct digit does not exist");
        } else {
            System.out.println("Second Largest Digit: " + secondLargest);
        }
    }
}