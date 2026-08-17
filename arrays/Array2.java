package com.arrays;
public class Array2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 23, 89, 5,100};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number: " + max);
    }
}