package com.xworkz.StringOverRide.internal;

public class Fire {
    private int number;
    private String name;
    private String brand;
    public Fire(int number,String name,String brnad) {
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
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Fire) {
                System.out.println("ref is beer, will compare...");
                Fire fire1 = this;
                Fire fire2 = (Fire) obj;
                if (fire1.number == fire2.number && fire1.brand.equals(fire2.brand) && fire1.name.equals(fire2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
