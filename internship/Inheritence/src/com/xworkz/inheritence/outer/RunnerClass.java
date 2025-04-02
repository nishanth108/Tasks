package com.xworkz.inheritence.outer;

import com.xworkz.inheritence.inner.*;

public class RunnerClass {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.color();
        vehicle.model();
        vehicle.name();
        vehicle.speed();

        System.out.println("Sub Class Car into picture");
        Car car=new Car();
        car.info();

        System.out.println("==========================  The reference type is parent ================================");
        Vehicle vehicle1=new Car();
        vehicle1.color();

//    Brand and Shoe class , Shoe Inherit Brnad(Shoe is a Brand)
        Brand brand=new Brand();
        System.out.println("Using Parent ref");
        brand.brandLogo();
        brand.brandName();
        brand.color();
        brand.category();

        System.out.println("Using Child as reference");
        Shoe shoe=new Shoe();
        shoe.infos();

        System.out.println("==========================  Country and state class================================");
        Country country=new Country();
        System.out.println("Using Parent ref");
        country.tax();
        country.democracy();
        country.pm();
        country.parliment();

        System.out.println("Using Child as reference");
        State state=new State();
        state.info();

        Country country1=new State();
        System.out.println("Using Parent as type");
        country.tax();
        country.democracy();
        country.pm();
        country.parliment();


        System.out.println("==========================  Plastic and Sofa  class================================");
        Plastic plastic=new Plastic();
        System.out.println("Using Parent ref");
        plastic.type();
        plastic.quality();
        plastic.weight();
        plastic.color();

        System.out.println("Using Child as reference");
        Sofa sofa=new Sofa();
        sofa.info();

        Plastic plastic1=new Sofa();
        System.out.println("Using Parent as type");
        plastic1.type();
        plastic1.quality();
        plastic1.weight();
        plastic1.color();


        System.out.println("========================== Parent  and  Child  class================================");
        Parent parent=new Parent();
        System.out.println("Using Parent ref");
        parent.bloodGroup();
        parent.skinColor();
        parent.hobbies();
        parent.lastName();

        System.out.println("Using Child as reference");
        Child child=new Child();
        child.info();

        Parent parent1=new Child();
        System.out.println("Using Parent as type");
        parent1.bloodGroup();
        parent1.skinColor();
        parent1.hobbies();
        parent1.lastName();

        System.out.println("========================== Sports  and  Football  class================================");
        Sports sports=new Sports();
        System.out.println("Using Parent ref");
        sports.win();
        sports.lose();
        sports.manOfMatch();
        sports.budget();

        System.out.println("Using Child as reference");
        Football football=new Football();
        football.info();

        Sports sports1=new Football();
        System.out.println("Using Parent as type");
        sports1.win();
        sports1.lose();
        sports1.manOfMatch();
        sports1.budget();


        System.out.println("========================== Fluid  and  Lpg  class================================");
        Fluid fluid=new Fluid();
        System.out.println("Using Parent ref");
        fluid.capilary();
        fluid.surfaceTension();
        fluid.vapourPressure();
        fluid.stedy();

        System.out.println("Using Child as reference");
        Lpg lpg=new Lpg();
        lpg.info();

        Fluid fluid1=new Lpg();
        System.out.println("Using Parent as type");
        fluid1.stedy();
        fluid1.vapourPressure();
        fluid1.surfaceTension();
        fluid1.capilary();

        System.out.println("========================== Machine  and  Robot  class================================");
        Machine machine=new Machine();
        System.out.println("Using Parent ref");
        machine.useBackup();
        machine.off();
        machine.on();
        machine.work();

        System.out.println("Using Child as reference");
        Robot robot=new Robot();
        robot.info();

        Machine machine1=new Robot();
        System.out.println("Using Parent as type");
        machine1.useBackup();
        machine1.on();
        machine1.off();
        machine1.work();







    }
}
