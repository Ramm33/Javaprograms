package com.operators;
////1.Check whether a number is positive or negative using the ternary operator.

public class Numbers {
    public static void main(String[] args) {
        int num = -15;

        String result = (num >= 0) ? "Positive Number" : "Negative Number";

        System.out.println("Number = " + num);
        System.out.println(result);
    }
}