package com.xworkz.inheritence.inner;

public class Car extends Vehicle {

    public Car() {
        super();
        System.out.println("Hello Car");
    }

    public void info() {
        color();
        name();
        speed();
        model();
    }
}
