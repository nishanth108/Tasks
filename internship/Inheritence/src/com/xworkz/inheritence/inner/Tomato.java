package com.xworkz.inheritence.inner;

public class Tomato extends Fruit{
    @Override
    public void color() {
        System.out.println("the color of the tommato is red");
    }
    @Override
    public void size() {
        System.out.println("Its of small size");
    }
    @Override
    public void taste() {
        System.out.println("its very tasty");
    }
    @Override
    public void price() {
        System.out.println("it cost 50rs per kg");
    }
}
