package com.xworkz.StringOverRide.internal;

public class Brain64 {
    private int number;
    private String name;
    private String brand;
    public Brain64(int number,String name,String brnad) {
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
        return 888;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Brain64) {
                System.out.println("ref is beer, will compare...");
                Brain64 brain641 = this;
                Brain64 brain642 = (Brain64) obj;
                if (brain641.number == brain642.number && brain641.brand.equals(brain642.brand) && brain641.name.equals(brain642.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
