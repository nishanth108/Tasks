package com.xworkz.StringOverRide.internal;

public class Clone78 {
    private int number;
    private String name;
    private String brand;
    public Clone78(int number,String name,String brnad) {
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
        return 105;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Clone78) {
                System.out.println("ref is beer, will compare...");
                Clone78 aries1 = this;
                Clone78 aries2 = (Clone78) obj;
                if (aries1.number == aries2.number && aries1.brand.equals(aries2.brand) && aries1.name.equals(aries2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
