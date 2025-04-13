package com.xworkz.StringOverRide.internal;

public class Bus {
    private int number;
    private String name;
    private String brand;
    public Bus(int number,String name,String brnad) {
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
            if (obj instanceof Bus) {
                System.out.println("ref is beer, will compare...");
                Bus bus1 = this;
                Bus bus2 = (Bus) obj;
                if (bus1.number == bus2.number && bus1.brand.equals(bus2.brand) && bus1.name.equals(bus2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
