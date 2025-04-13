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

    @Override
    public int hashCode() {
        System.out.println("The original hashCode :"+super.hashCode());
        return 68;
    }

        @Override
        public boolean equals(Object obj) {
            if(obj!=null)
            {
                System.out.println("ref is not null");
                if(obj instanceof Android)
                {
                    System.out.println("ref is beer, will compare...");
                    Android beer1=this;
                    Android beer2=(Android) obj;
                    if(beer1.number == beer2.number && beer1.brand.equals(beer2.brand) && beer1.name.equals(beer2.name))
                    {
                        System.out.println("both beers are same");
                        return true;
                    }
                }
            }
            return false;

    }
}

