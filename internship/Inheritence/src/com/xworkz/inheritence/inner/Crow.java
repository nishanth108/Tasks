package com.xworkz.inheritence.inner;

public class Crow extends Bird{
    @Override
    public void sound() {
        System.out.println("Crow Making sound");
    }
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
    @Override
    public void jump() {
        System.out.println("Crow Jumping  ");
    }
    @Override
    public void eat() {
        System.out.println("Crow Eating  ");
    }

    public void play() {
        System.out.println("Crow is playing  ");
    }


}
