package com.xworkz.inheritence.inner;

public class RescueHelicopter extends Helicopter {
    public void quality() {
        System.out.println("Good quality of corporation is good");
    }
    @Override
    public void speed() {
        System.out.println("Its of 200km/h speed");
    }
    @Override
    public void size() {
        System.out.println("Its of Big size");
    }
    @Override
    public void space() {
        System.out.println("It comes with a big space");
    }
    @Override
    public void durability() {
        System.out.println("Its of Good Durability");
    }
}
