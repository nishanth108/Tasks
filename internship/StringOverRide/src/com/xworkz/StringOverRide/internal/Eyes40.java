package com.xworkz.StringOverRide.internal;

public class Eyes40 {
    private int number;
    private String name;
    private String brand;
    public Eyes40(int number,String name,String brnad) {
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
        return 53;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Eyes40) {
                System.out.println("ref is beer, will compare...");
                Eyes40 eye401 = this;
                Eyes40 eye402 = (Eyes40) obj;
                if (eye401.number == eye402.number && eye401.brand.equals(eye402.brand) && eye401.name.equals(eye402.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
