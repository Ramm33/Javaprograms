// Multiplying Corresponding ELements.

package com.arrays;
import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {

        int[] a1 = {2, 3, 4, 5};
        int[] a2 = {5, 6, 7, 8};

        int[] a3 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] * a2[i];
        }

        System.out.println(Arrays.toString(a3));
    }
}