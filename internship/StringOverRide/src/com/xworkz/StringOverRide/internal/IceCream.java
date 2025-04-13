package com.xworkz.StringOverRide.internal;

public class IceCream {
    private int number;
    private String name;
    private String brand;
    public IceCream(int number,String name,String brnad) {
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
        return 58;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof IceCream) {
                System.out.println("ref is beer, will compare...");
                IceCream iceCream1 = this;
                IceCream IceCream2 = (IceCream) obj;
                if (iceCream1.number == IceCream2.number && iceCream1.brand.equals(IceCream2.brand) && iceCream1.name.equals(IceCream2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
