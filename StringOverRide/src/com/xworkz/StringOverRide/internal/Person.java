package com.xworkz.StringOverRide.internal;

public class Person {
    private int number;
    private String name;
    private String brand;
    public Person(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }
}
