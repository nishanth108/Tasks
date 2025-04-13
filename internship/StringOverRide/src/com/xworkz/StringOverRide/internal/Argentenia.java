package com.xworkz.StringOverRide.internal;

public class Argentenia {
    private int number;
    private String name;
    private String brand;
    public Argentenia(int number,String name,String brnad) {
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
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null) {
            System.out.println("The reference is not null");
            if(obj instanceof Argentenia) {
                Argentenia argentenia1 = this;
                Argentenia argentenia2 = (Argentenia) obj;
                if(argentenia1.brand.equals(argentenia2.brand) && argentenia1.name.equals(argentenia2.name) && argentenia1.number == argentenia2.number) {
                    return true;
                }

            }
        }
        return false;
    }
}
