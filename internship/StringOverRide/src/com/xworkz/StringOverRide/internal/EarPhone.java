package com.xworkz.StringOverRide.internal;

public class EarPhone {
    private int number;
    private String name;
    private String brand;
    public EarPhone(int number,String name,String brnad) {
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
        return 52;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof EarPhone) {
                System.out.println("ref is beer, will compare...");
                EarPhone earphone1 = this;
                EarPhone earphone2 = (EarPhone) obj;
                if (earphone1.number == earphone2.number && earphone1.brand.equals(earphone2.brand) && earphone1.name.equals(earphone2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
