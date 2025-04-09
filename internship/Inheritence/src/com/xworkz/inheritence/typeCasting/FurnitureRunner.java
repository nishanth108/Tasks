package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Football;
import com.xworkz.inheritence.inner.Furniture13;
import com.xworkz.inheritence.inner.Wood;

public class FurnitureRunner {
    public void info(Wood wood) {
        if (wood!=null) {
            wood.durability();
            wood.size();
            wood.quality();
            wood.type();


            if (wood instanceof Furniture13) {
                Furniture13 state = (Furniture13)wood;
                state.quality();
            }
        }
    }
}
