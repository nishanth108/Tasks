package com.xworkz.StringOverRide.internal;

public class FaceBook {
    private int number;
    private String name;
    private String brand;
    public FaceBook(int number,String name,String brnad) {
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
        return 54;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof FaceBook) {
                System.out.println("ref is beer, will compare...");
                FaceBook facebook1 = this;
                FaceBook facebook2 = (FaceBook) obj;
                if (facebook1.number == facebook2.number && facebook1.brand.equals(facebook2.brand) && facebook1.name.equals(facebook2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
