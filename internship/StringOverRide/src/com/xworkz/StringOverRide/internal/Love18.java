package com.xworkz.StringOverRide.internal;

public class Love18 {
    private int number;
    private String name;
    private String brand;
    public Love18(int number,String name,String brnad) {
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
        return 67;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Love18) {
                System.out.println("ref is beer, will compare...");
                Love18 love1 = this;
                Love18 love2 = (Love18) obj;
                if (love1.number == love2.number && love1.brand.equals(love2.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
