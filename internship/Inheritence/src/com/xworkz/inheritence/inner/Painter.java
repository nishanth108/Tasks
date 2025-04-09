package com.xworkz.inheritence.inner;

public class Painter extends Artist {
    @Override
    public void draw() {
        System.out.println("Drawing");
    }
    @Override
    public void name() {
        System.out.println("The name of the Ravi");
    }
    @Override
    public void method() {
        System.out.println("pens are used");
    }
    @Override
    public void signature() {
        System.out.println("doing signature");
    }
    public void salary() {
        System.out.println("The salary is 900");
    }

}
