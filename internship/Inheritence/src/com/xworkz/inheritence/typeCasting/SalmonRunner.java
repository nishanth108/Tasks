package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Country;
import com.xworkz.inheritence.inner.Fish;
import com.xworkz.inheritence.inner.Salmon;
import com.xworkz.inheritence.inner.State;

public class SalmonRunner {
    public void info(Fish fish) {
        if (fish!=null) {
            fish.price();
            fish.size();
            fish.color();
            fish.taste();

            if (fish instanceof Salmon) {
                Salmon state = (Salmon)fish;
                state.quality();
            }
        }
    }
}
