package com.arrays;

public class Array10 {

	public static void main(String[] args) {

		int[] a1 = { 3, 4, 5 };
		int[] a2 = { 6, 7, 8, 9, 10, 10 };

		int len = a1.length > a2.length ? a1.length : a2.length;

		int[] a3 = new int[len];

		for (int i = 0; i < a3.length; i++) {

			a3[i] = (i < a1.length ? a1[i] : 0) + (i < a2.length ? a2[i] : 0);
		}

		System.out.println("A3 Array:");

		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
	}
}