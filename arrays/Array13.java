package com.arrays;
import java.util.Arrays;

public class Array13{

    public static void main(String[] args) {

        int[] a1 = {3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};

        int len=0;

        if (a1.length > a2.length) {
            len = a1.length;
        } else {
            len = a2.length;
        }

        int[] a3 = new int[len];

        for (int i = 0; i < len; i++) {

            int n1 = 0;
            int n2 = 0;

            if (i < a1.length) {
                n1 = a1[i];
            }

            if (i < a2.length) {
                n2 = a2[i];
            }

            a3[i] = n1 + n2;
        }

        System.out.println(Arrays.toString(a3));
    }
}