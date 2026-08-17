package com.operators;
public class MultipleOfTen {
    public static void main(String[] args) {
        int num = 755;

        String result = (num % 10 == 0)
                ? "Multiple of 10"
                : "Not a Multiple of 10";

        System.out.println(result);
    }
}