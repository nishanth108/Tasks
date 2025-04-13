package com.xworkz.StringOverRide.internal;

public class Charger33 {
    private int number;
    private String name;
    private String brand;
    public Charger33(int number,String name,String brnad) {
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
        return 8277;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!= null ) {
            System.out.println("The reference is not null ");
            if(obj instanceof Charger33 ) {
                Charger33 charger331 = this;
                Charger33 charger332 = (Charger33) obj;
            }
        }
        return false;
    }
}
