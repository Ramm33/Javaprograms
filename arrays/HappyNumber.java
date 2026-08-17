package com.arrays;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num;

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is Not a Happy Number");
        }

        sc.close();
    }
}