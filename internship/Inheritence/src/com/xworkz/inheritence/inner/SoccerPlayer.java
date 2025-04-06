package com.xworkz.inheritence.inner;

public class SoccerPlayer extends Athlete{
    @Override
    public void name() {
        System.out.println("The name of the person is nishanth");
    }
    @Override
    public void physique() {
        System.out.println("The Person is well fit ");
    }
    @Override
    public void position() {
        System.out.println("Playing as defender");
    }
    @Override
    public void salary() {
        System.out.println("He is an enterprenur with football as a passion");
    }

}
