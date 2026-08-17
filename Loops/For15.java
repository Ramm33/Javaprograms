package com.Loops;

import java.util.Scanner;

public class For15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isprime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        boolean status = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                status = false;
                break;
            }
        }

        return status;
    }
}