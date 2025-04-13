package com.xworkz.StringOverRide.internal;

public class Cheater29 {
    private int number;
    private String name;
    private String brand;
    public Cheater29(int number,String name,String brnad) {
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
        return 29;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Cheater29) {
                System.out.println("ref is beer, will compare...");
                Cheater29 cheater1 = this;
                Cheater29 cheater2 = (Cheater29) obj;
                if (cheater1.number == cheater2.number && cheater1.brand.equals(cheater2.brand) && cheater1.name.equals(cheater2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
