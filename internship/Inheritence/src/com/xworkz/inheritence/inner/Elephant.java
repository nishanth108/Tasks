package com.xworkz.inheritence.inner;

public class Elephant extends Mammal{


    @Override
    public void color() {
        System.out.println("the color of the species is depends ");
    }
    @Override
    public void size() {
        System.out.println("Its of Big size");
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
