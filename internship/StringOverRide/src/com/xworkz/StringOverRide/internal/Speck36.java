package com.xworkz.StringOverRide.internal;

public class Speck36 {
    private int number;
    private String name;
    private String brand;
    public Speck36(int number,String name,String brnad) {
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
        return 79;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Speck36) {
                System.out.println("ref is beer, will compare...");
                Speck36 keyChain1 = this;
                Speck36 keyChain2 = (Speck36) obj;
                if (keyChain1.number == keyChain2.number && keyChain1.brand.equals(keyChain2.brand)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
