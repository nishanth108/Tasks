package com.xworkz.StringOverRide.internal;

public class Carrom45 {
    private int number;
    private String name;
    private String brand;
    public Carrom45(int number,String name,String brnad) {
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
        return 10236;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Carrom45) {
                System.out.println("ref is beer, will compare...");
                Carrom45 carrom451 = this;
                Carrom45 carrom452 = (Carrom45) obj;
                if (carrom451.number == carrom452.number && carrom451.brand.equals(carrom452.brand) && carrom451.name.equals(carrom452.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
