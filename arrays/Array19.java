//Find the difference between two arrays
//
//a1 = {10, 20, 30, 40}
//a2 = {2, 4, 6, 8}
//
//a3 = {8, 16, 24, 32}


package com.arrays;

import java.util.Arrays;

public class Array19 {

    public static void main(String[] args) {

        int[] a1 = {10, 20, 30, 40};
        int[] a2 = {2, 4, 6, 8};

        int[] a3 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] - a2[i];
        }

        System.out.println(Arrays.toString(a3));
    }
}