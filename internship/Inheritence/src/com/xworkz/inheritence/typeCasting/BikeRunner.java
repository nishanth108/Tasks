package com.xworkz.inheritence.typeCasting;


import com.xworkz.inheritence.inner.Vehicle;
import com.xworkz.inheritence.inner.Bike;

public class BikeRunner {

        public void info(Vehicle vehicle) {
            if (vehicle!=null) {
                vehicle.model();
                vehicle.name();
                vehicle.color();
                vehicle.speed();

                if (vehicle instanceof Bike) {
                    Bike bike = (Bike)vehicle;
                    bike.milege();
                }
            }
        }
}
