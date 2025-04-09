package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Corparation;
import com.xworkz.inheritence.inner.Organization;

public class CoorparationRunner {
    public void info(Organization organization) {
        if (organization!=null) {
            organization.established();
            organization.jobs();
            organization.salary();
            organization.pepole();

            if (organization instanceof Corparation ) {
                Corparation dslr = (Corparation)organization;
                dslr.quality();
            }
        }
    }
}
