package com.xworkz.StringOverRide.internal;

public class Gtr {
    private int number;
    private String name;
    private String brand;
    public Gtr(int number,String name,String brnad) {
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
        return 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Gtr) {
                System.out.println("ref is beer, will compare...");
                Gtr gtr1 = this;
                Gtr gtr2 = (Gtr) obj;
                if (gtr1.number == gtr2.number && gtr1.brand.equals(gtr2.brand) && gtr1.name.equals(gtr2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
