package com.xworkz.StringOverRide.internal;

public class Car41 {
    private int number;
    private String name;
    private String brand;
    public Car41(int number,String name,String brnad) {
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
        return 111;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Car41) {
                System.out.println("ref is beer, will compare...");
                Car41 car411 = this;
                Car41 car412 = (Car41) obj;
                if (car411.number == car412.number && car411.brand.equals(car412.brand) && car411.name.equals(car412.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
