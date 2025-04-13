package com.xworkz.StringOverRide.internal;

public class ZebraCrossing {
    private int number;
    private String name;
    private String brand;
    public ZebraCrossing(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }

    public static class Bi {
        private int number;
        private String name;
        private String brand;
        public Bi(int number,String name,String brnad) {
            this.number = number;
            this.name = name;
            this.brand = brnad;
        }

        @Override
        public String toString() {
            return   "The Passed value number,  name , brand";
        }

    }

    @Override
    public int hashCode() {
        System.out.println("The original hashCode :"+super.hashCode());
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof ZebraCrossing) {
                System.out.println("ref is beer, will compare...");
                ZebraCrossing keyChain1 = this;
                ZebraCrossing keyChain2 = (ZebraCrossing) obj;
                if (keyChain1.number == keyChain2.number && keyChain1.brand.equals(keyChain2.brand) && keyChain1.name.equals(keyChain2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
