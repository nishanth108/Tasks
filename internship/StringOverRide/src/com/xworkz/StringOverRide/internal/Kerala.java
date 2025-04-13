package com.xworkz.StringOverRide.internal;

public class Kerala {
    private int number;
    private String name;
    private String brand;
    public Kerala(int number,String name,String brnad) {
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
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Kerala) {
                System.out.println("ref is beer, will compare...");
                Kerala kerala1 = this;
                Kerala kerala2 = (Kerala) obj;
                if (kerala1.number == kerala2.number && kerala1.brand.equals(kerala2.brand) && kerala1.name.equals(kerala2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
