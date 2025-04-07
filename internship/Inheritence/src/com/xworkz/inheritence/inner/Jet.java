package com.xworkz.inheritence.inner;

public class Jet extends Aircraft {
    @Override
    public void speed() {
        System.out.println("jet  of 300km/h speed");
    }
    @Override
    public void size() {
        System.out.println("jet of Big size");
    }
    @Override
    public void space() {
        System.out.println("It comes with a small space");
    }
    @Override
    public void durability() {
        System.out.println("Jet has  of Good Durability");
    }

    public void owner(){
        System.out.println("Nishanth is the owner");

    }

}
