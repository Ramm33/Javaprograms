package com.operators;

public class ReverseAlphabets {
    public static void main(String[] args) {

        System.out.println("Lowercase Alphabets from Z to A:");

        for (char ch = 'z'; ch >= 'a'; ch--) {
            System.out.print(ch + " ");
        }
    }
}