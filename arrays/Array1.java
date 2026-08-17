
package com.arrays;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        System.out.println("Main method started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        String binValue = DecimalBinary(n);
        System.out.println("The Binary value: " + binValue);
    }

    static String DecimalBinary(int n) {
        int r;
        String binValue = "";
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            r = n % 2;          
            binValue = r + binValue;  
            n = n / 2;           
        }
        return binValue;
    }
}