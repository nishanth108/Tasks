package com.xworkz.inheritence.inner;

public class Table extends Wood{
    @Override
    public void quality() {
        System.out.println("Its of Good Quality");
    }
    @Override
    public void size() {
        System.out.println("Its of Big size");
    }
    @Override
    public void type() {
        System.out.println("Its of Good type");
    }
    @Override
    public void durability() {
        System.out.println("Its of Good Durability");
    }
}
