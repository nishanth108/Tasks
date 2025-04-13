package com.xworkz.StringOverRide.Equal;

public class Tshirt {
    private String brand;
    private String color;
    private int price;

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setColor(String color)
    {
        this.brand = brand;
    }

    public void setPrice(int price)
    {
        this.brand = brand;
    }




    @Override
    public String toString() {

        return "Tshirt{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("THe object is equal to the reference");
            if(obj instanceof Tshirt) {
                Tshirt tshirt = this;
                Tshirt tshirt2 = (Tshirt) obj;
                if( tshirt.brand.equals(tshirt2.brand) && tshirt.price == tshirt2.price ) {
                    System.out.println("They are same ");
                    return true;
                }

            }
        }
        return false;
    }
}
