package com.xworkz.StringOverRide.internal;

public class Charger33 {
    private int number;
    private String name;
    private String brand;
    public Charger33(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }
}
