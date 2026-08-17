package com.Loops;

import java.util.Stack;

public class For5 {
    public static void main(String[] args) {

        int[] prices = {8, 4, 6, 2, 3};
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            int current = prices[i];

            while (!stack.isEmpty() && stack.peek() > current) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                prices[i] = current - stack.peek();
            }

            stack.push(current); 
        }

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}