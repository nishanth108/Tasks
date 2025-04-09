package com.xworkz.inheritence.inner;

public class Corparation extends Organization{
    @Override
    public void jobs() {
        System.out.println("There are lots of jobs in Corparation");
    }
    @Override
    public void salary() {
        System.out.println("the salary is 100k in Corparation");
    }
    @Override

    public void pepole() {
        System.out.println("Corparation are of 400 pepole");
    }
    @Override
    public void established() {
        System.out.println("Corparation is established in 1975");
    }

    public void quality() {
        System.out.println("Good quality of corporation is good");
    }
}
