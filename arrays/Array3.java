package com.arrays;
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 23, 89, 5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number: " + min);
    }
}