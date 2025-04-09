package com.xworkz.inheritence.inner;

public class Shoe extends Brand{


public  Shoe() {
        System.out.println("======================= PUMA ===============================");
    }

    @Override
    public void brandLogo() {
        System.out.println("The Show Logo Is atached to the shoe");
    }
   @Override
   public void category() {
        System.out.println("Shoes for males and female");
    }
    @Override
    public void color() {
        System.out.println("Shoe color is white");
    }
    public void name() {
        System.out.println("Shoe name is nike");
    }


}
