package com.xworkz.StringOverRide.internal;

public class Pain21 {
    private int number;
    private String name;
    private String brand;
    public Pain21(int number,String name,String brnad) {
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
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pain21) {
                System.out.println("ref is beer, will compare...");
                Pain21 pain = this;
                Pain21 pain1 = (Pain21) obj;
                if (pain.number == pain1.number && pain.brand.equals(pain1.brand)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
