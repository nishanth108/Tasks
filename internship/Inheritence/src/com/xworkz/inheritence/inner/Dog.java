package com.xworkz.inheritence.inner;

public class Dog extends Animal{
    @Override
    public void bark() {
        System.out.println("Dog is Barking ");
    }
    @Override
    public void run() {
        System.out.println("Dog is Running  ");
    }
    @Override
    public void jump() {
        System.out.println("Dog is Juming  ");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating the food  ");
    }
}
