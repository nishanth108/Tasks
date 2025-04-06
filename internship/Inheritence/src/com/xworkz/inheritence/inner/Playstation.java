package com.xworkz.inheritence.inner;

public class Playstation extends GamingConsole{
    @Override
    public void name() {
        System.out.println("This is an Playstation Device");
    }

    @Override
    public void warranty() {
        System.out.println("1 years of warrenty");
    }
    @Override
    public void price() {
        System.out.println("This is an Plastation Device so pricr ranges from 40k - 60k rs");
    }@Override

    public void quality() {
        System.out.println("Good quality of Devices");
    }
}
