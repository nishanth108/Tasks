package com.xworkz.StringOverRide.internal;

public class LIlly {
    private int number;
    private String name;
    private String brand;
    public LIlly(int number,String name,String brnad) {
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
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LIlly) {
                System.out.println("ref is beer, will compare...");
                LIlly lilly1 = this;
                LIlly lilly2 = (LIlly) obj;
                if (lilly1.number == lilly2.number && lilly1.brand.equals(lilly2.brand)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
