package com.xworkz.inheritence.inner;

public class Laptop extends Computer{
    @Override
    public void name() {
        System.out.println("This is an Laptop Device");
    }

    @Override
    public void warranty() {
        System.out.println("2 years of warrenty for Laptop");
    }
    @Override
    public void price() {
        System.out.println("This is an Electronic Device so pricr ranges from 120 - 6000 rs");
    }
    @Override
    public void quality() {
        System.out.println("Good quality of Devices");
    }

    public void move() {
        System.out.println("Can be moved");
    }


}
