package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Amphibian;
import com.xworkz.inheritence.inner.Frog;

public class FrogRunner2 {
    public void info(Amphibian amphibian) {
        if (amphibian!=null) {
            amphibian.size();
            amphibian.eat();
            amphibian.color();
            amphibian.run();

            if (amphibian instanceof Frog) {
                Frog frog = (Frog)amphibian;
                frog.sound();
            }
        }

    }
}
