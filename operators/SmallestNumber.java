package com.operators;

public class SmallestNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;

        int smaller = (a < b) ? a : b;

        System.out.println("Smaller Number = " + smaller);
    }
}