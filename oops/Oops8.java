package com.oops;

public class Oops8 {

    int id;
    String name;

    // No-argument constructor
    Oops8() {
        id = 101;
        name = "Karthik";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Oops8))
            return false;

        Oops8 s = (Oops8) obj;

        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        Oops8 s = new Oops8();

        System.out.println("----- equals() -----");
        System.out.println(s.equals(s));

        System.out.println("\n----- getClass() -----");
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());

        System.out.println("\n----- hashCode() -----");
        System.out.println(s.hashCode());

        System.out.println("\n----- toString() -----");
        System.out.println(s);

        System.out.println("\n----- finalize() -----");
        s = null;
        System.gc();
    }
}