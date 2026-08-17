package com.Loops;
import java.util.Scanner;
public class For9{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}