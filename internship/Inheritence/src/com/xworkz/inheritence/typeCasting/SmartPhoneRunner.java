package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Country;
import com.xworkz.inheritence.inner.ElectronicDevice;
import com.xworkz.inheritence.inner.SmartPhone;
import com.xworkz.inheritence.inner.State;

public class SmartPhoneRunner {
    public void info(ElectronicDevice elctronicDevice) {
        if (elctronicDevice!=null) {
            elctronicDevice.quality();
            elctronicDevice.price();
            elctronicDevice.name();
            elctronicDevice.warranty();

            if (elctronicDevice instanceof SmartPhone) {
                SmartPhone state = (SmartPhone)elctronicDevice;
                state.quality();
            }
        }
    }
}
