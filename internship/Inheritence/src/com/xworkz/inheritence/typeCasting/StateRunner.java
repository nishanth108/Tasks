package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Corparation;
import com.xworkz.inheritence.inner.Country;
import com.xworkz.inheritence.inner.State;

public class StateRunner {
    public void info(Country country) {
        if (country!=null) {
            country.parliment();
            country.tax();
            country.democracy();
            country.pm();

            if (country instanceof State) {
                State state = (State)country;
                state.quality();
            }
        }
    }
}
