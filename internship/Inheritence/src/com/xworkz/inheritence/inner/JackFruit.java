package com.xworkz.inheritence.inner;

public class JackFruit extends Fruit{
    @Override
    public void color() {
        System.out.println("the color of the fruit is yellow");
    }
    @Override
    public void size() {
        System.out.println("Its of medium size");
    }
    @Override
    public void taste() {
        System.out.println("its very tasty");
    }
    @Override
    public void price() {
        System.out.println("it cost 5rs per kg");
    }
}
