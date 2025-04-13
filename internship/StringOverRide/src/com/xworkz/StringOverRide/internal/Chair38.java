package com.xworkz.StringOverRide.internal;

public class Chair38 {
    private int number;
    private String name;
    private String brand;
    public Chair38(int number,String name,String brnad) {
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
        return 877;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chair38) {
                System.out.println("ref is beer, will compare...");
                Chair38 chair1 = this;
                Chair38 chair2 = (Chair38) obj;
                if (chair1.number == chair2.number && chair1.brand.equals(chair2.brand) && chair1.name.equals(chair2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

    
}
