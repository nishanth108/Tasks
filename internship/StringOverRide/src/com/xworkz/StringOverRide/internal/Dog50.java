package com.xworkz.StringOverRide.internal;

public class Dog50 {
    private int number;
    private String name;
    private String brand;
    public Dog50(int number,String name,String brnad) {
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
        return 50;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Dog50) {
                System.out.println("ref is beer, will compare...");
                Dog50 dog1 = this;
                Dog50 dog2 = (Dog50) obj;
                if (dog1.number == dog2.number && dog1.brand.equals(dog2.brand) && dog1.name.equals(dog2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
