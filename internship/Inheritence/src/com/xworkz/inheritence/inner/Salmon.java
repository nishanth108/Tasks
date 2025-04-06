package com.xworkz.inheritence.inner;

public class Salmon extends Fish{

    @Override
    public void color() {
        System.out.println("the color of the fish is depends on the season");
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
        System.out.println("it cost 150rs ");
    }


}
