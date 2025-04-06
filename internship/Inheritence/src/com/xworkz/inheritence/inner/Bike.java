package com.xworkz.inheritence.inner;



public class Bike extends Vehicle{

    public Bike() {
        super();
        System.out.println("The Default color of the car is blue");
    }


    @Override
    public void color() {
        System.out.println("The color of the car is turned to yellow");
    }


    @Override
    public void name() {
        System.out.println("The name of the car is Bugatti"); // Fixed spelling
    }


    @Override
    public void speed() {
        System.out.println("The Top speed of the car is 360 km/h");
    }


    @Override
    public void model() {
        System.out.println("This is the 1990 model");
    }

}
