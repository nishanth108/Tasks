package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Football;
import com.xworkz.inheritence.inner.Sports;
import com.xworkz.inheritence.inner.Hibiscus;

public class footballRunner {
    public void info(Sports sports) {
        if (sports!=null) {
            sports.budget();
            sports.lose();
            sports.win();
            sports.manOfMatch();


            if (sports instanceof Football) {
                Football state = (Football)sports;
                state.quality();
            }
        }
    }
}
