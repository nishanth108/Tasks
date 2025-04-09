package com.xworkz.inheritence.typeCasting;

import com.xworkz.inheritence.inner.Bike;
import com.xworkz.inheritence.inner.Brand;
import com.xworkz.inheritence.inner.Shoe;
import com.xworkz.inheritence.inner.Vehicle;

public class ShoeRunner {
    public void info(Brand brand) {
        if (brand!=null) {
            brand.brandName();
            brand.brandLogo();
            brand.color();
            brand.category();

            if (brand instanceof Shoe) {
                Shoe shoe = (Shoe)brand;
                shoe.name();
            }
        }
    }
}
