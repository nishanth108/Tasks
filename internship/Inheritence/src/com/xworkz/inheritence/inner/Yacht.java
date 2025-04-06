package com.xworkz.inheritence.inner;

public class Yacht extends Boat{

    @Override
    public void speed() {
        System.out.println("Yacht of 200km/h speed");
    }

    @Override
    public void size() {
        System.out.println("Yacht of Big size");
    }

    @Override
    public void space() {
        System.out.println("Yatch comes with a big space");
    }

    @Override
    public void durability() {
        System.out.println("Yacht of Good Durability");
    }

}
