package com.xworkz.StringOverRide.internal;

public class Kind30 {
    private int number;
    private String name;
    private String brand;
    public Kind30(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }
}
