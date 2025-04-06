package com.xworkz.inheritence.inner;

public class MountainBike extends Bicycle{
    @Override
    public void speed() {
        System.out.println("MountainBike of 200km/h speed");
    }
    @Override
    public void size() {
        System.out.println("MountainBike of Big size");
    }
    @Override
    public void space() {
        System.out.println("MountainBike comes with a big space");
    }
    @Override
    public void durability() {
        System.out.println("MountainBike of Good Durability");
    }
}
