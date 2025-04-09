package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Football;
import com.xworkz.inheritence.inner.FreightTrain45;
import com.xworkz.inheritence.inner.Train45;

public class FrightTrainRunner {
    public void info(Train45 train45) {
        if (train45!=null) {
            train45.durability();
            train45.size();
            train45.speed();
            train45.space();


            if (train45 instanceof FreightTrain45) {
                FreightTrain45 state = (FreightTrain45)train45;
                state.quality();
            }
        }
    }
}
