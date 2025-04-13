package com.xworkz.StringOverRide.internal;

public class Chakka {
    private int number;
    private String name;
    private String brand;
    public Chakka(int number,String name,String brnad) {
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
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chakka) {
                System.out.println("ref is beer, will compare...");
                Chakka chakka = this;
                Chakka chakka2 = (Chakka) obj;
                if (chakka.number == chakka2.number && chakka.brand.equals(chakka2.brand) && chakka.name.equals(chakka2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
