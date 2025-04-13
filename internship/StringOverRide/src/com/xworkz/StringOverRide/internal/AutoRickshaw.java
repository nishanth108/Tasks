package com.xworkz.StringOverRide.internal;

public class AutoRickshaw {
    private int number;
    private String name;
    private String brand;
    public AutoRickshaw(int number,String name,String brnad) {
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
        return 6833;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof AutoRickshaw) {
                System.out.println("ref is beer, will compare...");
                AutoRickshaw autoRickshaw1 = this;
                AutoRickshaw autoRickshaw2 = (AutoRickshaw) obj;
                if (autoRickshaw1.number == autoRickshaw2.number && autoRickshaw1.brand.equals(autoRickshaw2.brand) && autoRickshaw1.name.equals(autoRickshaw2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
