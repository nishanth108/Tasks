package com.xworkz.StringOverRide.internal;

public class Button {
    private int number;
    private String name;
    private String brand;
    public Button(int number,String name,String brnad) {
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
        return 678;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Button) {
                System.out.println("ref is beer, will compare...");
                Button button = this;
                Button button2 = (Button) obj;
                if (button.number == button2.number && button.brand.equals(button2.brand) && button.name.equals(button2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
