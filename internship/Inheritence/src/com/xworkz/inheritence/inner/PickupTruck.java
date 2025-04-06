package com.xworkz.inheritence.inner;

public class PickupTruck extends Truck {
    @Override
    public void speed() {
        System.out.println("Its of 200km/h speed");
    }
    @Override
    public void size() {
        System.out.println("Its of Big size");
    }
    @Override
    public void space() {
        System.out.println("It comes with a big space");
    }
    @Override
    public void durability() {
        System.out.println("Its of Good Durability");
    }
}
