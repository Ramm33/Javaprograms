package com.operators;

public class GreaterNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;

        int greater = (a > b) ? a : b;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Greater Number = " + greater);
    }
}