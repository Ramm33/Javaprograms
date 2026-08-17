// Find the minimum value at each index

package com.arrays;
import java.util.Arrays;

public class Array15 {

    public static void main(String[] args) {

        int[] a1 = {3, 8, 5, 10};
        int[] a2 = {6, 4, 9, 7};

        int[] a3 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {

            if (a1[i] < a2[i]) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[i];
            }
        }

        System.out.println(Arrays.toString(a3));
    }
}