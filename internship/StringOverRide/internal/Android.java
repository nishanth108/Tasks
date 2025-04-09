package com.xworkz.StringOverRide.internal;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Android {
    private int number;
    private String name;
    private String brand;
    public Android(int number,String name,String brnad) {
        this.number = number;
        this.name = name;
        this.brand = brnad;
    }

    @Override
    public String toString() {
     return   "The Passed value number,  name , brand";
    }


}

