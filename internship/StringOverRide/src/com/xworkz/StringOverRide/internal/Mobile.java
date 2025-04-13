package com.xworkz.StringOverRide.internal;

public class Mobile {
    private int number;
    private String name;
    private String brand;
    public Mobile(int number,String name,String brnad) {
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
        return 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mobile) {
                System.out.println("ref is beer, will compare...");
                Mobile mobile1 = this;
                Mobile mobile2 = (Mobile) obj;
                if (mobile1.number == mobile2.number && mobile1.brand.equals(mobile2.brand)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
