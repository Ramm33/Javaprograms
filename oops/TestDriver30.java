package com.oops;


interface attendance {

    void markattendance();
}

class Developer implements attendance {

    @Override
    public void markattendance() {
        System.out.println("Developer attendance marked successfully.");
    }
}

class Tester implements attendance {

    @Override
    public void markattendance() {
        System.out.println("Tester attendance marked successfully.");
    }
}

class Manager implements attendance {

    @Override
    public void markattendance() {
        System.out.println("Manager attendance marked successfully.");
    }
}

public class TestDriver30 {

    public static void main(String[] args) {

        attendance employee;

        System.out.println("Employee Attendance:");

        employee = new Developer();
        employee.markattendance();

        employee = new Tester();
        employee.markattendance();

        employee = new Manager();
        employee.markattendance();
    }
}