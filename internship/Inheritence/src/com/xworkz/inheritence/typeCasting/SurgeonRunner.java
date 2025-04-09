package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Corparation;
import com.xworkz.inheritence.inner.Doctor;
import com.xworkz.inheritence.inner.Submarine;
import com.xworkz.inheritence.inner.Surgeon;

public class SurgeonRunner {
    public void info(Doctor doctor) {
        if (doctor!=null) {
            doctor.position();
            doctor.licence();
            doctor.work();
            doctor.name();

            if (doctor instanceof Surgeon) {
                Surgeon surgeon = (Surgeon)doctor;
                surgeon.quality();
            }
        }
    }
}
