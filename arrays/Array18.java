//Combine two arrays
//a1 = {1, 2, 3}
//a2 = {4, 5, 6, 7}
//
//a3 = {1, 2, 3, 4, 5, 6, 7}

package com.arrays;
import java.util.Arrays;

public class Array18 {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6, 7};

        int[] a3 = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {
            a3[a1.length + i] = a2[i];
        }

        System.out.println(Arrays.toString(a3));
    }
}