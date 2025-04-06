package com.xworkz.inheritence.inner;

public class Mouse extends Rodent{
    @Override
    public void color() {
        System.out.println("the color of the Rodent is depends ");
    }
    @Override
    public void size() {
        System.out.println("Its of small size");
    }
    @Override
    public void run() {
        System.out.println("its runs at moderate speed");
    }
    @Override
    public void eat() {
        System.out.println("it eats grasses and fruits ");
    }
}
