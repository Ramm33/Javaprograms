package com.oops;

public class Oops2 {

    public static void main(String[] args) {

        Oops1 emp = new Oops1();

        emp.setEid(4);
        emp.setEname("Karthik ");
        emp.setSalary(180000);  

        System.out.println(emp.getEid());
        System.out.println(emp.getEname());
        System.out.println(emp.getSalary());
    }
}