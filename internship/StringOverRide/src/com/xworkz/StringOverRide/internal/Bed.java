package com.xworkz.StringOverRide.internal;

public class Bed {
    private int number;
    private String name;
    private String brand;
    public Bed(int number,String name,String brnad) {
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
        return 38;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bed) {
                System.out.println("ref is beer, will compare...");
                Bed bed1 = this;
                Bed bed2 = (Bed) obj;
                if (bed1.number == bed2.number && bed1.brand.equals(bed2.brand) && bed1.name.equals(bed2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
