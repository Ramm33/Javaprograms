//*Java*-
//
//1.Write a Java program to perform the following operations on a 3 × 3 integer matrix:
//Reverse the elements of every even-indexed row (rows 0 and 2).
//Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
//Square all the elements on the main (left) diagonal.
//Display the modified matrix.
// Input
//1 2 3
//4 5 6
//7 8 9
// Output
//9   2   1
//8  25   12
//9   8  49
package com.arrays;
import java.util.Scanner;
public class Array28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[3][3];

		System.out.println("Enter 3x3 matrix:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i += 2) {
			int temp = a[i][0];
			a[i][0] = a[i][2];
			a[i][2] = temp;
		}

		for (int j = 0; j < 3; j++) {
			if (j != 1) {
				a[1][j] = a[1][j] * 2;
			}
		}

		for (int i = 0; i < 3; i++) {
			a[i][i] = a[i][i] * a[i][i];
		}

		System.out.println("Modified Matrix:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
}