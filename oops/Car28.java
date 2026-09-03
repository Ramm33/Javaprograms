package com.oops;

class Car28 extends Vehicle27 {
    int speed = 100;

    @Override
    void display() {
        System.out.println("Car speed: " + speed);
    }

    public static void main(String[] args) {
        Vehicle27 ref = new Car28();

        System.out.println("speeed:"+ref.speed);
        ref.display();
    }
}