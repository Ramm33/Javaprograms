package com.arrays;

import java.util.Scanner;

public class Array26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter Array Elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Leader Elemnets:");
		int max = arr[n - 1];
		System.out.println(max + "");
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(max + "");

			}
			sc.close();
		}
	}
}