package com.languagefundamentals;
import java.util.Scanner;

public class SalaryslipGenerator {

    static void salarySlip(String employeeName, double basicSalary) {
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        salarySlip(employeeName, basicSalary);
    }
}