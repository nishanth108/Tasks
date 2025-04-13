package com.xworkz.StringOverRide.internal;

public class Chain {
    private int number;
    private String name;
    private String brand;
    public Chain(int number,String name,String brnad) {
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
        return 102;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chain) {
                System.out.println("ref is beer, will compare...");
                Chain chain1 = this;
                Chain chain2 = (Chain) obj;
                if (chain1.number == chain2.number && chain1.brand.equals(chain2.brand) && chain1.name.equals(chain2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
