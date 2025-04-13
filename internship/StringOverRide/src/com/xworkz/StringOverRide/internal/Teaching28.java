package com.xworkz.StringOverRide.internal;

public class Teaching28 {
    private int number;
    private String name;
    private String brand;
    public Teaching28(int number,String name,String brnad) {
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
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Teaching28) {
                System.out.println("ref is beer, will compare...");
                Teaching28 keyChain1 = this;
                Teaching28 keyChain2 = (Teaching28) obj;
                if (keyChain1.number == keyChain2.number ) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
