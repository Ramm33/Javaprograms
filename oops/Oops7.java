//the Object class is the root class of all Java classes. It provides commonly used methods such as 
//toString()
//equals()
//hashCode()
//getClass()
//clone()
//wait()
//notify()
//notifyAll()
package com.oops;

public class Oops7 {

    int id;
    String name;

    Oops7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {

        Oops7 s = (Oops7) obj;

        return this.id == s.id && this.name.equals(s.name);
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {

        Oops7 s1 = new Oops7(101, "Karthik");
        Oops7 s2 = new Oops7(101, "Karthik");
        Oops7 s3 = new Oops7(102, "Rahul");

        // 1. toString()
        System.out.println("toString():");
        System.out.println(s1);

        // 2. equals()
        System.out.println("\nequals():");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // 3. hashCode()
        System.out.println("\nhashCode():");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 4. getClass()
        System.out.println("\ngetClass():");
        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());
    }
}