package com.xworkz.inheritence.inner;

public class Lpg extends Fluid{

    @Override
    public void stedy() {
        System.out.println("This is relatively Stedy");
    }

    @Override
    public void surfaceTension() {
        System.out.println("It has good surface tension");
    }

    @Override
    public void vapourPressure() {
        System.out.println("The vapour pressure is high");
    }

    @Override
    public void capilary() {
        System.out.println("it has a high capilary");
    }
}
