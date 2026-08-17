package com.Loops;

import java.util.*;

public class ZigZagNonPrime {

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n; i++) {

			ArrayList<Integer> list = new ArrayList<>();

			while (list.size() < i) {
				if (!isPrime(num))
					list.add(num);
				num++;
			}

			if (i % 2 == 0) {
				Collections.reverse(list);
			}

			for (int x : list)
				System.out.print(x + " ");

			System.out.println();
		}
	}
}