package com.xworkz.inheritence.inner;

public class LaserPrinter extends Printer{
    public void qualitys() {
        System.out.println("Good quality of Devices");
    }
    @Override
    public void name() {
        System.out.println("This is an Electronic Device");
    }
    @Override

    public void warranty() {
        System.out.println("2 years of warrenty");
    }
    @Override
    public void price() {
        System.out.println("This is an Electronic Device so pricr ranges from 120 - 6000 rs");
    }
    @Override
    public void quality() {
        System.out.println("Good quality of Devices");
    }

}
