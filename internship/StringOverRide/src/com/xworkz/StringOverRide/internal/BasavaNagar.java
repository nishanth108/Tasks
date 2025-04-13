package com.xworkz.StringOverRide.internal;

public class BasavaNagar {
    private int number;
    private String name;
    private String brand;
    public BasavaNagar(int number,String name,String brnad) {
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
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof BasavaNagar) {
                System.out.println("ref is beer, will compare...");
                BasavaNagar basavanagar1 = this;
                BasavaNagar basavanagar2 = (BasavaNagar) obj;
                if (basavanagar1.number == basavanagar2.number && basavanagar1.brand.equals(basavanagar2.brand) && basavanagar1.name.equals(basavanagar2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
