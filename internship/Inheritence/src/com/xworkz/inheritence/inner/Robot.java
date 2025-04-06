package com.xworkz.inheritence.inner;

public class Robot extends Machine{

    @Override
    public void on() {
        System.out.println("Turn ON");
    }
    @Override
    public void off() {
        System.out.println("Turn off");
    }
    @Override
    public void useBackup() {
        System.out.println("Turn off backup electric source");
    }
    @Override
    public void work() {
        System.out.println("Working on things");
    }
}
