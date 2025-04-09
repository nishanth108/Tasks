package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Camera;
import com.xworkz.inheritence.inner.Dslr;

public class DslrRunner {
    public void info(Camera camera) {
        if (camera!=null) {
            camera.name();
            camera.price();
            camera.quality();
            camera.warranty();

            if (camera instanceof Dslr) {
                Dslr dslr = (Dslr)camera;
                dslr.pixel();
            }
        }
    }
}
