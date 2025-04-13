package com.xworkz.StringOverRide.internal;

public class FilterCoffie {
    private int number;
    private String name;
    private String brand;
    public FilterCoffie(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
        return   "The Passed value number,  name , brand";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof FilterCoffie) {
                System.out.println("ref is beer, will compare...");
                FilterCoffie filterCoffe1 = this;
                FilterCoffie filterCoffe2 = (FilterCoffie) obj;
                if (filterCoffe1.number == filterCoffe2.number && filterCoffe1.brand.equals(filterCoffe2.brand) && filterCoffe1.name.equals(filterCoffe2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
