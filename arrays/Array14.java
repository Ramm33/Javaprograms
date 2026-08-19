// Multiplying Corresponding ELements.

package com.arrays;
import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {

        int[] a1 = {2, 3, 4, 5};
        int[] a2 = {5, 6, 7, 8};

        int[] a3 = new int[a1.length];
        int[] a4 = new int[a2.length];
        


        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] * a2[i];
        }
        for(int j=0;j<a2.length;j++) {
        	a4[j]=a1[j]+a2[j];
        	
        }

        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));

    }
}