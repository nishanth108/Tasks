package com.xworkz.inheritence.inner;

public class Shoe extends Brand{

        public Shoe() {
            super();
            System.out.println("Iam in shoe class");
        }
        public void infos() {
            brandName();
            brandLogo();
            category();
            color();
        }
}
