package com.xworkz.StringOverRide.internal;

public class Instagram {
    private int number;
    private String name;
    private String brand;
    public Instagram(int number,String name,String brnad) {
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
        return 59;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Instagram) {
                System.out.println("ref is beer, will compare...");
                Instagram instagram1 = this;
                Instagram instagram2 = (Instagram) obj;
                if (instagram1.number == instagram2.number && instagram1.brand.equals(instagram2.brand) && instagram1.name.equals(instagram2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
