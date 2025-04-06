package com.xworkz.inheritence.inner;

public class Car extends Vehicle {

    public Car() {
        super();
        System.out.println("Hello Car");
    }
    @Override
    public void color() {
        System.out.println("The color of the car is turned to blue");
    }
    @Override
    public void name() {
        System.out.println("The name of the car is RangeRover"); // Fixed spelling
    }
    @Override
    public void speed() {
        System.out.println("The Top speed of the car is 300 km/h");
    }
    @Override
    public void model() {
        System.out.println("This is the 2024  model");
    }

}
