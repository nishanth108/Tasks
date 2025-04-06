package com.xworkz.inheritence.inner;

public class Dolphin extends MarineMammal{
    @Override
    public void color() {
        System.out.println("the color of the dolphin is grey ");
    }
   @Override
   public void skill() {
        System.out.println("Its Can jump in the water");
    }
    @Override
    public void swim() {
        System.out.println("its swims at fast");
    }
    @Override
    public void eat() {
        System.out.println("it eats fishes and fruits ");
    }

}
