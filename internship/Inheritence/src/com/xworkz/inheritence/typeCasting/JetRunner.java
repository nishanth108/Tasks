package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Aircraft;
import com.xworkz.inheritence.inner.Jet;

public class JetRunner {
    public void info(Aircraft aircraft) {

        if(aircraft!=null) {
          aircraft.size();
          aircraft.space();
          aircraft.speed();
          aircraft.durability();
        }

        if(aircraft instanceof Jet) {
            Jet jet =(Jet) aircraft;
            jet.owner();
        }
    }
}
