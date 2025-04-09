package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Bird;
import com.xworkz.inheritence.inner.Crow;
import com.xworkz.inheritence.inner.Vehicle;

public class CrowRunner {
    public void info(Bird bird) {
        if (bird!=null) {
            bird.fly();
            bird.sound();
            bird.sound();
            bird.eat();

            if (bird instanceof Crow) {
                Crow birdsr = (Crow)bird;
                birdsr.play();
            }
        }
    }
}
