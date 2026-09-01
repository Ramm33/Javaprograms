
package com.oops;

import java.util.*;

public class Oops18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Oops17 e = new Oops17();

        System.out.print("Enter Employee ID: ");
        e.setId(sc.nextInt());

        System.out.print("Enter Employee Name: ");
        e.setName(sc.next());

        System.out.print("Enter Salary: ");
        e.setsalary(sc.nextDouble());

        System.out.print("Enter Salary Increase: ");
        double increase = sc.nextDouble();
        e.increaseSalary(increase);

        System.out.print("Enter Salary Decrease: ");
        double decrease = sc.nextDouble();
        e.decreaseSalary(decrease);

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Final Salary: ₹" + e.getsalary());

        sc.close();
    }
}

