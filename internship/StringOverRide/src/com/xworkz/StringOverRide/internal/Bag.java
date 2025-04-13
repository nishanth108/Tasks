package com.xworkz.StringOverRide.internal;

public class Bag {
    private int number;
    private String name;
    private String brand;
    public Bag(int number,String name,String brnad) {
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
        return 110;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bag) {
                System.out.println("ref is beer, will compare...");
                Bag bag1 = this;
                Bag bag2 = (Bag) obj;
                if (bag1.number == bag2.number && bag1.brand.equals(bag2.brand) && bag1.name.equals(bag2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
