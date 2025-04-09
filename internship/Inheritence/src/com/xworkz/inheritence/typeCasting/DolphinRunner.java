package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Dolphin;
import com.xworkz.inheritence.inner.MarineMammal;
import com.xworkz.inheritence.inner.State;

public class DolphinRunner {

    public void info(MarineMammal marineMammal) {
        if (marineMammal!=null) {
            marineMammal.skill();
            marineMammal.eat();
            marineMammal.color();
            marineMammal.swim();

            if (marineMammal instanceof Dolphin) {
                Dolphin state = (Dolphin)marineMammal;
                state.quality();
            }
        }
    }
}
