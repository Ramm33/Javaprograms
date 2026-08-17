package com.Loops;

import java.util.Scanner;

public class For7{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        for (; n > 0; n = n / 10) {

            int digit = n % 10;

            sum = sum + (digit * digit * digit);
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}

