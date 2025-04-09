package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Laptop;
import com.xworkz.inheritence.inner.Computer;
import com.xworkz.inheritence.inner.Laptop;

public class LaptopRunner {
    public void info(Computer computer) {
        if (computer!=null) {
            computer.name();
            computer.quality();
            computer.price();
            computer.warranty();

            if (computer instanceof Laptop) {
                Laptop dslr = (Laptop)computer;
                dslr.quality();
            }
        }
    }
}
