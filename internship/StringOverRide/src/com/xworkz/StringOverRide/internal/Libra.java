package com.xworkz.StringOverRide.internal;

public class Libra {
    private int number;
    private String name;
    private String brand;
    public Libra(int number,String name,String brnad) {
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
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Libra) {
                System.out.println("ref is beer, will compare...");
                Libra libra1 = this;
                Libra libra2 = (Libra) obj;
                if (libra1.number == libra2.number && libra1.brand.equals(libra2.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
