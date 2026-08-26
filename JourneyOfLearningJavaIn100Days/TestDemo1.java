package com.JourneyOfLearningJavaIn100Days;

import java.util.*;

public class TestDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Rows:");
		int n = sc.nextInt();

		System.out.println("Main method started");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}