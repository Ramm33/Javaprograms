package com.operators;

public class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("A = " + b);
        System.out.println("B = " + b);

        a = a + b;
        a = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}