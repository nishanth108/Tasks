package com.xworkz.inheritence.inner;

public class State extends Country{

    @Override

    public void tax() {
        System.out.println("State tax ");
    }

    @Override
    public void pm() {
        System.out.println("Same pm");
    }

    @Override
    public void democracy() {
        System.out.println("Same democracy");
    }

   @Override
   public void parliment() {
        System.out.println("inside the parliment");
    }
    public void quality() {
        System.out.println("Good quality of living ");
    }


}
