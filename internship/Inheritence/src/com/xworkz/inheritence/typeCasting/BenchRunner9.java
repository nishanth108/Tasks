package com.xworkz.inheritence.typeCasting;


import com.xworkz.inheritence.inner.Bench12;
import com.xworkz.inheritence.inner.Wood;

public class BenchRunner9 {
    public void info(Wood wood) {
        if (wood!=null) {
            wood.size();
            wood.durability();
            wood.quality();
            wood.type();

            if (wood instanceof Bench12) {
                Bench12 bench12 = (Bench12) wood;
                bench12.rate();
            }
        }
    }
}
