package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Artist;
import com.xworkz.inheritence.inner.Painter;

public class LaserPrinterRunner {

        public void info(Artist artist) {
            if (artist!=null) {
                artist.method();
                artist.draw();
                artist.signature();
                artist.name();

                if (artist instanceof Painter) {
                    Painter painter = (Painter) artist;
                    painter.salary();
                }
            }
        }
}
