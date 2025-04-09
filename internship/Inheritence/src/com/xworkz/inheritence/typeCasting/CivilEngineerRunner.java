package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Child;
import com.xworkz.inheritence.inner.CivilEngineer;
import com.xworkz.inheritence.inner.Engineer;

public class CivilEngineerRunner {
    public void info(Engineer engineer) {
        if (engineer!=null) {
            engineer.title();
            engineer.name();
            engineer.salary();
            engineer.work();

            if (engineer instanceof CivilEngineer) {
                CivilEngineer civilEngineer = (CivilEngineer)engineer;
                civilEngineer.college();
            }
        }
    }
}
