package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Apple;
import com.xworkz.inheritence.inner.Fruit;

public class AppleRunner {
    public void info(Fruit fruit) {
        if (fruit!=null) {
            fruit.color();
            fruit.size();
            fruit.price();
            fruit.taste();

            if (fruit instanceof Apple) {
                Apple apple = (Apple) fruit;
                apple.makeJuice();
            }
        }
    }
}
