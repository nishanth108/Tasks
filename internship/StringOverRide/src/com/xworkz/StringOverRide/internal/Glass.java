package com.xworkz.StringOverRide.internal;

public class Glass {
    private int number;
    private String name;
    private String brand;
    public Glass(int number,String name,String brnad) {
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
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Glass) {
                System.out.println("ref is beer, will compare...");
                Glass glass = this;
                Glass glass1 = (Glass) obj;
                if (glass.number == glass1.number && glass.brand.equals(glass1.brand) && glass.name.equals(glass1.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
