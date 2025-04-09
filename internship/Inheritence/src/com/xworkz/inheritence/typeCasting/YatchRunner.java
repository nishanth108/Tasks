package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Boat;
import com.xworkz.inheritence.inner.Vehicle;
import com.xworkz.inheritence.inner.Yacht;

public class YatchRunner {
    public void info(Boat boat) {
        if (boat!=null) {
            boat.space();
            boat.size();
            boat.durability();
            boat.speed();

            if (boat instanceof Yacht) {
                Yacht boat1 = (Yacht)boat;
                boat1.price();
            }
        }
    }
}
