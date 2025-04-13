package com.xworkz.StringOverRide.internal;

public class Laptop {
    private int number;
    private String name;
    private String brand;
    public Laptop(int number,String name,String brnad) {
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
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("ref is beer, will compare...");
                Laptop laptop1 = this;
                Laptop laptop2 = (Laptop) obj;
                if (laptop1.number == laptop2.number && laptop1.brand.equals(laptop2.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
