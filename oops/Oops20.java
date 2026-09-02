package com.oops;

import java.util.*;

public class Oops20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Oops19 m = new Oops19();

        System.out.print("Enter Mobile Number: ");
        m.setMobileNumber(sc.nextInt());

        System.out.print("Enter Initial Balance: ");
        m.setBalance(sc.nextDouble());

        System.out.print("Enter Recharge Amount: ");
        double recharge = sc.nextDouble();
        m.recharge(recharge);

        System.out.print("Enter Call Amount: ");
        double call = sc.nextDouble();
        m.makeCall(call);

        System.out.println("Mobile Number: " + m.getMobileNumber());
        System.out.println("Final Balance: ₹" + m.getBalance());

        sc.close();
    }
}

