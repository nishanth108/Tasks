package com.xworkz.StringOverRide.internal;

public class ChatGpt {
    private int number;
    private String name;
    private String brand;
    public ChatGpt(int number,String name,String brnad) {
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
        return 36;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof ChatGpt) {
                System.out.println("ref is beer, will compare...");
                ChatGpt aries1 = this;
                ChatGpt aries2 = (ChatGpt) obj;
                if (aries1.number == aries2.number && aries1.brand.equals(aries2.brand) && aries1.name.equals(aries2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
