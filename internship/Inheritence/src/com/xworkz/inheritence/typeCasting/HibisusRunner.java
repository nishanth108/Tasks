package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Flower;
import com.xworkz.inheritence.inner.Hibiscus;
import com.xworkz.inheritence.inner.State;

public class HibisusRunner {
    public void info(Flower flower) {
        if (flower!=null) {
            flower.name();
            flower.price();
            flower.quality();
            flower.color();


            if (flower instanceof Hibiscus) {
                Hibiscus state = (Hibiscus)flower;
                state.quality();
            }
        }
    }
}
