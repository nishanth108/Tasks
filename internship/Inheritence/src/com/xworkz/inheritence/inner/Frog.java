package com.xworkz.inheritence.inner;

public class Frog extends Amphibian{

    @Override
    public void color() {
        System.out.println("the color of Frog is red ");
    }
    @Override
    public void size() {
        System.out.println("Frog of medium size");
    }
    @Override
    public void run() {
        System.out.println("Frog runs at moderate speed");
    }
    @Override
    public void eat() {
        System.out.println("Frog eats other insects ");
    }
}
