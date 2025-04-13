package com.xworkz.StringOverRide.internal;

public class Market {
    private int number;
    private String name;
    private String brand;
    public Market(int number,String name,String brnad) {
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
        return 68;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Market) {
                System.out.println("ref is beer, will compare...");
                Market market1 = this;
                Market market2 = (Market) obj;
                if (market1.number == market2.number && market1.brand.equals(market2.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
