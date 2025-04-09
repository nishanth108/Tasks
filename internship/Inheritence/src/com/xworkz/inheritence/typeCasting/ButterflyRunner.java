package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Butterfly;
import com.xworkz.inheritence.inner.Insect;
import com.xworkz.inheritence.inner.Vehicle;

public class ButterflyRunner {
    public void info(Insect insect) {
        if (insect!=null) {
            insect.fly();
            insect.eat();
            insect.color();
            insect.size();

            if (insect instanceof Butterfly) {
                Butterfly butterfly = (Butterfly)insect;
                butterfly.forming();
            }
        }
    }
}
