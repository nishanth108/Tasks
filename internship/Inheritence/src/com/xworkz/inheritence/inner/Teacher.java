package com.xworkz.inheritence.inner;

public class Teacher extends Person{
    @Override
    public void name() {
        System.out.println("The name of the person is jibli");
    }

    @Override
    public void walk() {
        System.out.println("The Person is walking");
    }
    @Override
    public void run() {
        System.out.println("The Person is Running");
    }
    @Override

    public void dancing() {
        System.out.println("The Dancing Person is Dancing");
    }

}
