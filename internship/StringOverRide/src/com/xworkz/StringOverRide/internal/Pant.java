package com.xworkz.StringOverRide.internal;

public class Pant {
    private int number;
    private String name;
    private String brand;
    public Pant(int number,String name,String brnad) {
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
        return 73;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pant) {
                System.out.println("ref is beer, will compare...");
                Pant pant = this;
                Pant pant1 = (Pant) obj;
                if (pant.number == pant1.number && pant.brand.equals(pant1.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
