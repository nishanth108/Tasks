package com.xworkz.StringOverRide.internal;

public class chottu {
    private int number;
    private String name;
    private String brand;
    public chottu(int number,String name,String brnad) {
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
        return 106;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof chottu) {
                System.out.println("ref is beer, will compare...");
                chottu chottu1 = this;
                chottu chottu2 = (chottu) obj;
                if (chottu1.number == chottu2.number && chottu1.brand.equals(chottu2.brand) && chottu1.name.equals(chottu2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
