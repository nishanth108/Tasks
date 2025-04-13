package com.xworkz.StringOverRide.internal;

public class Camera {
    private int number;
    private String name;
    private String brand;
    public Camera(int number,String name,String brnad) {
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
        return 1028;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Camera) {
                System.out.println("ref is beer, will compare...");
                Camera camera1 = this;
                Camera camera2 = (Camera) obj;
                if (camera1.number == camera2.number && camera1.brand.equals(camera2.brand) && camera1.name.equals(camera2.name)) {
                    System.out.println("both beers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
