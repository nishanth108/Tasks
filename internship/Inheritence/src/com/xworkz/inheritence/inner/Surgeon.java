package com.xworkz.inheritence.inner;

public class Surgeon extends Doctor{
    @Override
    public void name() {
        System.out.println("The name of the person is Ramu");
    }

    @Override
    public void licence() {
        System.out.println("The Licence  is Valid");
    }
    @Override
    public void work() {
        System.out.println("Doing opration Work");
    }


    @Override
    public void position() {
        System.out.println("The Position is a Surgeon");
    }
    public void quality() {
        System.out.println("Good quality of time for Surgery is high ");
    }
}
