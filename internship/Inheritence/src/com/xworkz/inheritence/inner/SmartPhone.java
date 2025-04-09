package com.xworkz.inheritence.inner;

public class SmartPhone extends ElectronicDevice{

    @Override
    public void name() {
        System.out.println("This is SmartPhone");
    }

    @Override
    public void warranty() {
        System.out.println("1 years of warrenty on mobile");
    }
    @Override
    public void price() {
        System.out.println("This is Mobile phone so price ranges from 12k - 60k rs");
    }
    @Override
    public void quality() {
        System.out.println("Good quality of Mobiles");
    }
    public void camera() {
        System.out.println("Given the Camera");
    }


}
