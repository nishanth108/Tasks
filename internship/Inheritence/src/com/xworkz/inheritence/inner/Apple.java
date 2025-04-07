package com.xworkz.inheritence.inner;

public class Apple extends Fruit{

        @Override
        public void color() {
            System.out.println("the color of Apple is Red");
        }

        @Override
        public void size() {
            System.out.println("Its of medium size");
        }

        @Override
        public void taste() {
            System.out.println("its Very Tasty");
        }

        @Override
        public void price() {
            System.out.println("it cost 150rs per kg");
        }

        public void makeJuice() {
            System.out.println("Making Juice out of apple");
        }

}
