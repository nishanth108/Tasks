package com.xworkz.StringOverRide.internal;

public class Key27 {
    private int number;
    private String name;
    private String brand;
    public Key27(int number,String name,String brnad) {
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
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Key27) {
                System.out.println("ref is beer, will compare...");
                Key27 key271 = this;
                Key27 key272 = (Key27) obj;
                if (key271.number == key272.number && key271.brand.equals(key272.brand) && key271.name.equals(key272.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
