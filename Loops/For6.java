package com.Loops;
import java.util.Scanner;

public class For6{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 2; i <= n; i++) {

            int l = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    l++;
                }
            }

            if (l == 2) {
                count++;
            }
        }

        System.out.println("Count of prime numbers between 0 and " + n + " = " + count);

        sc.close();
    }
}

