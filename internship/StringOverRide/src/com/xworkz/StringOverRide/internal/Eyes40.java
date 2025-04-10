package com.xworkz.StringOverRide.internal;

public class Eyes40 {
    private int number;
    private String name;
    private String brand;
    public Eyes40(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }
    @Override
    public int hashCode() {
        System.out.println("The original hashCode :"+super.hashCode());
        return 53;
    }
}
