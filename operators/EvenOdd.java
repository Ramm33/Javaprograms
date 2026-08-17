//Even And Odd Number
package com.operators;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 18;

        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println("Number = " + num);
        System.out.println(result);
    }
}