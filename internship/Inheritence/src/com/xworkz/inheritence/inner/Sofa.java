package com.xworkz.inheritence.inner;

public class Sofa extends Plastic{

    public void qualitys() {
        System.out.println("Good quality of Devices");
    }
    @Override

    public void quality() {
        System.out.println("its of good quality");
    }

    @Override
    public void type() {
        System.out.println("Its is recyclable");

    }

   @Override
   public  void color() {
        System.out.println("color of green");
    }

   @Override
   public void weight() {
        System.out.println("This Can Take More Weight");
    }



}
