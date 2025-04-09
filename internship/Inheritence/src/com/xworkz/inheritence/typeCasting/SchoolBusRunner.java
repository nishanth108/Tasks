package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Bus47;
import com.xworkz.inheritence.inner.SchoolBus47;

public class SchoolBusRunner {
    public void info(Bus47 bus) {
        if (bus!=null) {
            bus.speed();
            bus.durability();
            bus.space();
            bus.size();

            if (bus instanceof SchoolBus47) {
                SchoolBus47 schoolBus47 = (SchoolBus47)bus;
                schoolBus47.color();
            }
        }
    }
}
