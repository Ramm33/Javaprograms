//Reverse an array into another array
//a1 = {10, 20, 30, 40, 50}
//a2 = {50, 40, 30, 20, 10}

package com.arrays;
import java.util.Arrays;
public class Array17 {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30, 40, 50 };

		int[] a2 = new int[a1.length];

		int j = 0;

		for (int i = a1.length - 1; i >= 0; i--) {

			a2[j] = a1[i];

			j++;
		}

		System.out.println(Arrays.toString(a2));
	}
}