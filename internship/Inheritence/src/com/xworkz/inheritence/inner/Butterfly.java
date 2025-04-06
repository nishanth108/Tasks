package com.xworkz.inheritence.inner;

public class Butterfly extends Insect{

    @Override
    public void color() {
        System.out.println("the color of the Butterfly is balck ");
    }
    @Override
    public void size() {
        System.out.println("Butterfly of small size");
    }
    @Override
    public void fly() {
        System.out.println("Butterfly flys at moderate speed");
    }
    @Override
    public void eat() {
        System.out.println("Butterfly eats micro organism and fruits ");
    }
}
