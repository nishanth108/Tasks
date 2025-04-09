package com.xworkz.inheritence.inner;

public class Spider extends Arachnid{
    @Override
    public void color() {
        System.out.println("the color of the Spider is brown ");
    }
    public void size() {
        System.out.println("Its of small size");
    }
    @Override
    public void run() {
        System.out.println("its runs at moderate speed");
    }
    @Override
    public void eat() {
        System.out.println("it eats other insects ");
    }

    public void skill() {
        System.out.println("Spider Have Web");
    }

}
