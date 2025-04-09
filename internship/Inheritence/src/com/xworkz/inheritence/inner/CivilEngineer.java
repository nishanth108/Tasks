package com.xworkz.inheritence.inner;

public class CivilEngineer extends Engineer{

    @Override
    public void name() {
        System.out.println("The name of the person is VARUN");
    }

    @Override
    public void work() {
        System.out.println("The Person is working");
    }
    @Override
    public void title() {
        System.out.println("The Person is civilEngineering");
    }

    @Override
    public void salary() {
        System.out.println("The Salary is 1 lakhs");
    }

    public void college() {
        System.out.println("Nitte");
    }
}
