package com.xworkz.StringOverRide.internal;

public class Photo {
    private int number;
    private String name;
    private String brand;
    public Photo(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Photo) {
                System.out.println("ref is beer, will compare...");
                Photo keyChain1 = this;
                Photo keyChain2 = (Photo) obj;
                if (keyChain1.number == keyChain2.number && keyChain1.brand.equals(keyChain2.brand) ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }


}
