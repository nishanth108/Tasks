package com.xworkz.StringOverRide.internal;

public class Earings {
    private int number;
    private String name;
    private String brand;
    public Earings(int number,String name,String brnad) {
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
        return 51;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Earings) {
                System.out.println("ref is beer, will compare...");
                Earings earing1 = this;
                Earings earing2 = (Earings) obj;
                if (earing1.number == earing2.number && earing1.brand.equals(earing2.brand) && earing1.name.equals(earing2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
