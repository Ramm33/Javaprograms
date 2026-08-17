package com.arrays;

import java.util.Arrays;

public class Array12 {

	public static void main(String[] args) {

		int[] a1 = { 3, 4, 5, 6 };
		int[] a2 = { 4, 6, 7, 8, 9, 10 };

		int len = 0;

		if (a1.length > a2.length) {
			len = a1.length;
		} else {
			len = a2.length;
		}

		int[] a3 = new int[len];

		for (int i = 0; i < len; i++) {

			if (i >= a1.length) {
				a3[i] = a2[i];

			} else if (i >= a2.length) {
				a3[i] = a1[i];

			} else {
				a3[i] = a1[i] + a2[i];
			}
		}

		System.out.print(Arrays.toString(a3));
	}
}