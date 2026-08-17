package com.Loops;

public class For2 {
    public static void main(String[] args) {

        int[] price = {8, 4, 6, 2, 3};
        int n = price.length;
        int[] discount = new int[n];

        for (int i = 0; i < n; i++) {
            discount[i] = price[i];

            for (int j = i + 1; j < n; j++) {
                if (price[j] <= price[i]) {
                    discount[i] = price[i] - price[j];
                    break;
                }
            }
        }

        // Print the final prices
        for (int i = 0; i < n; i++) {
            System.out.print(discount[i] + " ");
        }
    }
}