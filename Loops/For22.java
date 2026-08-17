//1.Print the First N Prime Numbers
//Input : 10
//Output : 2 3 5 7 11 13 17 19 23 29

package com.Loops;

import java.util.Scanner;

public class For22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {

            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}