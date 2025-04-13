package com.xworkz.StringOverRide.internal;

public class Cheeta {
    private int number;
    private String name;
    private String brand;
    public Cheeta(int number,String name,String brnad) {
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
        return 26;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Cheeta) {
                System.out.println("ref is beer, will compare...");
                Cheeta cheeta1 = this;
                Cheeta cheeta2 = (Cheeta) obj;
                if (cheeta1.number == cheeta2.number && cheeta1.brand.equals(cheeta2.brand) && cheeta1.name.equals(cheeta2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
