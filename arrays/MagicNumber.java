package com.arrays;

import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        while (n > 9) {

            int sum = 0;

            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
    }
}   