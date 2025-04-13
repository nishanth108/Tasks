package com.xworkz.StringOverRide.internal;

public class Csk {
    private int number;
    private String name;
    private String brand;
    public Csk(int number,String name,String brnad) {
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
        return 898;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Csk) {
                System.out.println("ref is beer, will compare...");
                Csk csk1 = this;
                Csk csk2 = (Csk) obj;
                if (csk1.number == csk2.number && csk1.brand.equals(csk2.brand) && csk1.name.equals(csk2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
