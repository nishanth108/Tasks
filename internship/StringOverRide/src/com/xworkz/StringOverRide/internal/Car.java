package com.xworkz.StringOverRide.internal;

public class Car {
    private int number;
    private String name;
    private String brand;
    public Car(int number,String name,String brnad) {
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
        return 106;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Car) {
                System.out.println("ref is beer, will compare...");
                Car car1 = this;
                Car car2 = (Car) obj;
                if (car1.number == car2.number && car1.brand.equals(car2.brand) && car1.name.equals(car2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
