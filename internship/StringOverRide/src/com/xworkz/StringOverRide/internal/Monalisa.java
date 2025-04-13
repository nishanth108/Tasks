package com.xworkz.StringOverRide.internal;

public class Monalisa {
    private int number;
    private String name;
    private String brand;
    public Monalisa(int number,String name,String brnad) {
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
        return 70;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Monalisa) {
                System.out.println("ref is beer, will compare...");
                Monalisa monalisa = this;
                Monalisa monalisa1 = (Monalisa) obj;
                if (monalisa.number == monalisa1.number && monalisa.brand.equals(monalisa1.brand)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
