package com.languagefundamentals;

class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}