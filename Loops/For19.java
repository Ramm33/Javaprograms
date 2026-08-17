package com.Loops;

import java.util.Scanner;

public class For19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 100:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i < n) {

            if (n % i == 0) {
                sum = sum + i;
            }

            i++;
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is Not a Perfect Number");
        }

        sc.close();
    }
}