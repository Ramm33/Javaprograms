package com.oops;

public class Oops8 {

    int id;
    String name;

    Oops8(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 1. equals()
    @Override
    public boolean equals(Object obj) {

        Oops7 s = (Oops7) obj;

        return this.id == s.id && this.name.equals(s.name);
    }

    // 2. finalize()
    @Override
    protected void finalize() throws Throwable {

        System.out.println("finalize() method called");
    }

    // 3. getClass()
    // No need to override getClass()
    // It is directly inherited from Object

    // 4. hashCode()
    @Override
    public int hashCode() {

        return id;
    }

    // 5. toString()
    @Override
    public String toString() {

        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        Oops7 s1 = new Oops7(101, "Karthik");
        Oops7 s2 = new Oops7(101, "Ram");
        Oops7 s3 = new Oops7(102, "Nandhan");

        // 1. equals()
        System.out.println("----- equals() -----");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        // 2. getClass()
        System.out.println("\n----- getClass() -----");

        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());


        // 3. hashCode()
        System.out.println("\n----- hashCode() -----");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


        // 4. toString()
        System.out.println("\n----- toString() -----");

        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s3.toString());


        // 5. finalize()
        System.out.println("\n----- finalize() -----");

        s1 = null;

        System.gc();
    }
}