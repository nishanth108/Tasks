package com.xworkz.StringOverRide.internal;

public class Brazil62 {
    private int number;
    private String name;
    private String brand;
    public Brazil62(int number,String name,String brnad) {
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
        return 1008;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Brazil62) {
                System.out.println("ref is beer, will compare...");
                Brazil62 brazil642 = this;
                Brazil62 aries2 = (Brazil62) obj;
                if (brazil642.number == aries2.number && brazil642.brand.equals(aries2.brand) && brazil642.name.equals(aries2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
