package com.xworkz.StringOverRide.internal;

public class Iphone {
    private int number;
    private String name;
    private String brand;
    public Iphone(int number,String name,String brnad) {
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
        return 60;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Iphone) {
                System.out.println("ref is beer, will compare...");
                Iphone iphone1 = this;
                Iphone iphone2 = (Iphone) obj;
                if (iphone1.number == iphone2.number && iphone1.brand.equals(iphone2.brand) && iphone1.name.equals(iphone2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
