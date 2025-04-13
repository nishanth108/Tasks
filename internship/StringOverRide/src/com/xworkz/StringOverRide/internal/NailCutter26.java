package com.xworkz.StringOverRide.internal;

public class NailCutter26 {
    private int number;
    private String name;
    private String brand;
    public NailCutter26(int number,String name,String brnad) {
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
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof NailCutter26) {
                System.out.println("ref is beer, will compare...");
                NailCutter26 nailCutter = this;
                NailCutter26 nailCutter1 = (NailCutter26) obj;
                if (nailCutter.number == nailCutter1.number && nailCutter.brand.equals(nailCutter1.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
