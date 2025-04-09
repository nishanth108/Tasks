package com.xworkz.inheritence.outer;

import com.xworkz.inheritence.inner.*;
import com.xworkz.inheritence.typeCasting.*;


public class RunnerClass {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.color();
        vehicle.model();
        vehicle.name();
        vehicle.speed();



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

//        =========================== For ShoeRunner ====================
        ShoeRunner shoeRunner = new ShoeRunner();
        shoeRunner.info(brand);





        System.out.println("==========================  Country and state class================================");
        Country country=new Country();
        System.out.println("Using Parent ref");
        country.tax();
        country.democracy();
        country.pm();
        country.parliment();


        StateRunner stateRunner = new StateRunner();
        stateRunner.info(country);

        Country country1=new State();
        System.out.println("Using Parent as type");
        country1.tax();
        country1.democracy();
        country1.pm();
        country1.parliment();


        System.out.println("==========================  Plastic and Sofa  class================================");
        Plastic plastic=new Plastic();
        System.out.println("Using Parent ref");
        plastic.type();
        plastic.quality();
        plastic.weight();
        plastic.color();



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


        ChildRunner childRunner = new ChildRunner();
        childRunner.info(parent);


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



        Sports sports1=new Football();
        System.out.println("Using Parent as type");
        sports1.win();
        sports1.lose();
        sports1.manOfMatch();
        sports1.budget();

        footballRunner footballRunner = new footballRunner();
        footballRunner.info(sports);



        System.out.println("========================== Fluid  and  Lpg  class================================");
        Fluid fluid=new Fluid();
        System.out.println("Using Parent ref");
        fluid.capilary();
        fluid.surfaceTension();
        fluid.vapourPressure();
        fluid.stedy();



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



        Machine machine1=new Robot();
        System.out.println("Using Parent as type");
        machine1.useBackup();
        machine1.on();
        machine1.off();
        machine1.work();

        System.out.println("========================== Wood  and  chair class================================");
        Wood wood=new Wood();
        System.out.println("Using Parent ref");
        wood.durability();
       wood.size();
       wood.quality();
       wood.type();


        FurnitureRunner furnitureRunner = new FurnitureRunner();
        furnitureRunner.info(wood);

        Wood wood1=new Chair();
        System.out.println("Using Parent as type");
        wood1.size();
        wood1.quality();
        wood1.durability();
        wood1.type();

        System.out.println("========================== Wood  and  Table class================================");

        System.out.println("Using Parent ref");
        wood.durability();
        wood.size();
        wood.quality();
        wood.type();


        Wood wood2=new Table();
        System.out.println("Using Parent as type");
        wood2.durability();
        wood2.size();
        wood2.quality();
        wood2.type();

        System.out.println("========================== Wood  and  Pot class================================");

        System.out.println("Using Parent ref");
        wood.durability();
        wood.size();
        wood.quality();
        wood.type();



        Wood wood3=new Pot();
        System.out.println("Using Parent as type");
        wood3.durability();
        wood3.size();
        wood3.quality();
        wood3.type();


        System.out.println("========================== Wood  and  Bench12 class================================");

        System.out.println("Using Parent ref");
        wood.durability();
        wood.size();
        wood.quality();
        wood.type();



        Wood wood5=new Pot();
        System.out.println("Using Parent as type");
        wood5.durability();
        wood5.size();
        wood5.quality();
        wood5.type();

        System.out.println("========================== Wood  and  Bench12 class================================");

        System.out.println("Using Parent ref");
        Organization organization = new Organization();
        organization.jobs();
        organization.salary();
        organization.pepole();
        organization. established();



        Organization organization1= new Organization();
        System.out.println("Using Parent as type");
        organization1.jobs();
        organization1.salary();
        organization1.pepole();
        organization1. established();


        System.out.println("========================== Organizatoion  and  Goverment (16) class================================");

        System.out.println("Using Parent ref");
//        Organization organization = new Organization();
        organization.jobs();
        organization.salary();
        organization.pepole();
        organization. established();


        Organization organization2= new Goverment();
        System.out.println("Using Parent as type");
        organization2.jobs();
        organization2.salary();
        organization2.pepole();
        organization2. established();

//        GovermentRunner govermentRunner = new GovermentRunner();


        System.out.println("========================== Organizatoion  and  Coorperation (17) class================================");

        System.out.println("Using Parent ref");
//        Organization organization = new Organization();
        organization.jobs();
        organization.salary();
        organization.pepole();
        organization. established();

        CoorparationRunner coorparationRunner = new CoorparationRunner();
        coorparationRunner.info(organization);


        Organization organization3= new Goverment();
        System.out.println("Using Parent as type");
        organization3.jobs();
        organization3.salary();
        organization3.pepole();
        organization3. established();

        System.out.println("========================== Fruit  and  Apple(18) class================================");

        System.out.println("Using Parent ref");
        Fruit fruit = new Fruit();


        fruit.size();
        fruit.taste();
        fruit.color();
        fruit.price();

        AppleRunner appleRunner =new AppleRunner();
        appleRunner.info(fruit);



        Fruit fruit1= new Apple();
        System.out.println("Using Parent as type");
        fruit1.size();
        fruit1.taste();
        fruit1.color();
        fruit1.price();


        System.out.println("========================== Fruit  and  Musumbi(19) class================================");

        System.out.println("Using Parent ref");
//        Fruit fruit = new Fruit();


        fruit.size();
        fruit.taste();
        fruit.color();
        fruit.price();




        Fruit fruit2= new Musumbi();
        System.out.println("Using Parent as type");
        fruit2.size();
        fruit2.taste();
        fruit2.color();
        fruit2.price();

        System.out.println("========================== Fruit  and  Banana (20) class================================");

        System.out.println("Using Parent ref");
//        Fruit fruit = new Fruit();


        fruit.size();
        fruit.taste();
        fruit.color();
        fruit.price();


        Fruit fruit3= new Banana();
        System.out.println("Using Parent as type");
        fruit3.size();
        fruit3.taste();
        fruit3.color();
        fruit3.price();

        System.out.println("========================== Fruit  and  jakcFruit (21) class================================");

        System.out.println("Using Parent ref");
//        Fruit fruit = new Fruit();


        fruit.size();
        fruit.taste();
        fruit.color();
        fruit.price();




        Fruit fruit4= new JackFruit();
        System.out.println("Using Parent as type");
        fruit4.size();
        fruit4.taste();
        fruit4.color();
        fruit4.price();

        System.out.println("========================== Fruit  and  jakcFruit (22) class================================");

        System.out.println("Using Parent ref");
//        Fruit fruit = new Fruit();


        fruit.size();
        fruit.taste();
        fruit.color();
        fruit.price();


        Fruit fruit5= new Tomato();
        System.out.println("Using Parent as type");
        fruit5.size();
        fruit5.taste();
        fruit5.color();
        fruit5.price();

        System.out.println("========================== Flower  and  Rose (23) class================================");

        System.out.println("Using Parent ref");
        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower1= new Rose();
        System.out.println("Using Parent as type");
        flower1.color();
        flower1.price();
        flower1.quality();
        flower1.name();

        System.out.println("========================== Flower  and  Lily24 (24) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower2= new Rose();
        System.out.println("Using Parent as type");
        flower2.color();
        flower2.price();
        flower2.quality();
        flower2.name();

        System.out.println("========================== Flower  and  Lotus (25) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower3= new Lotus25();
        System.out.println("Using Parent as type");
        flower3.color();
        flower3.price();
        flower3.quality();
        flower3.name();

        System.out.println("========================== Flower  and  SunFlower26 (26) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();



        Flower flower4= new SunFlower26();
        System.out.println("Using Parent as type");
        flower4.color();
        flower4.price();
        flower4.quality();
        flower4.name();

        System.out.println("========================== Flower  and  MarryGold (27) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower5= new MarryGold27();
        System.out.println("Using Parent as type");
        flower5.color();
        flower5.price();
        flower5.quality();
        flower5.name();

        System.out.println("========================== Flower  and  Hibiscud (28) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower6= new Hibiscus();
        System.out.println("Using Parent as type");
        flower6.color();
        flower6.price();
        flower6.quality();
        flower6.name();

        HibisusRunner hibisusRunner = new HibisusRunner();
        hibisusRunner.info(flower);


        System.out.println("========================== Flower  and  Tulasi (29) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();



        Flower flower7= new Tulasi29();
        System.out.println("Using Parent as type");
        flower7.color();
        flower7.price();
        flower7.quality();
        flower7.name();

        System.out.println("========================== Flower  and  Jasmin (29) class================================");

        System.out.println("Using Parent ref");
//        Flower flower = new Flower();


        flower.color();
        flower.price();
        flower.quality();
        flower.name();




        Flower flower8= new Jasmin30();
        System.out.println("Using Parent as type");
        flower8.color();
        flower8.price();
        flower8.quality();
        flower8.name();

        System.out.println("========================== Animal  and  Dog (30) class================================");

        System.out.println("Using Parent ref");
        Animal animal = new Animal();


        animal.eat();
        animal.bark();
        animal.jump();
        animal.run();

        DogRunner3 dogRunner3 = new DogRunner3();
        dogRunner3.info(animal);



        Animal animal1= new Dog();
        System.out.println("Using Parent as type");
        animal1.eat();
        animal1.bark();
        animal1.jump();
        animal1.run();

        System.out.println("========================== Bird  and  Sparow (31) class================================");

        System.out.println("Using Parent ref");
        Bird bird = new Bird();


        bird.eat();
        bird.sound();
        bird.jump();
        bird.fly();

        CrowRunner crowRunner = new CrowRunner();
        crowRunner.info(bird);

        Bird bird1= new Crow();
        System.out.println("Using Parent as type");
        bird1.eat();
        bird1.sound();
        bird1.jump();
        bird1.fly();

        System.out.println("========================== Fish  and  Salmon (32) class================================");

        System.out.println("Using Parent ref");
        Fish fish = new Fish();


        fish.color();
        fish.size();
        fish.taste();
        fish.price();




        Fish fish1= new Salmon();
        System.out.println("Using Parent as type");
        fish1.color();
        fish1.size();
        fish1.taste();
        fish1.price();


        System.out.println("========================== Reptile  and  Lizard (33) class================================");

        System.out.println("Using Parent ref");
        Reptile reptile = new Reptile();


        reptile.color();
        reptile.size();
        reptile.run();
        reptile.eat();



        Reptile reptile1= new Lizard();
        System.out.println("Using Parent as type");
        reptile1.color();
        reptile1.size();
        reptile1.run();
        reptile1.eat();


        System.out.println("========================== Fish  and  Salmon (34) class================================");

        System.out.println("Using Parent ref");
        Mammal mammal= new Mammal();


        mammal.color();
        mammal.size();
        mammal.eat();
        mammal.run();


        Mammal mammal1= new Elephant();
        System.out.println("Using Parent as type");
        mammal1.color();
        mammal1.size();
        mammal1.eat();
        mammal1.run();

        System.out.println("========================== Fish  and  Salmon (35) class================================");

        System.out.println("Using Parent ref");
        Amphibian amphibian= new Amphibian();


        amphibian.color();
        amphibian.size();
        amphibian.eat();
        amphibian.run();

        FrogRunner2 frogRunner2 = new FrogRunner2();
        frogRunner2.info(amphibian);

        Amphibian amphibian1= new Frog();
        System.out.println("Using Parent as type");
        amphibian1.color();
        amphibian1.size();
        amphibian1.eat();
        amphibian1.run();



        System.out.println("========================== Fish  and  Salmon (36) class================================");

        System.out.println("Using Parent ref");
        Insect insect= new Insect();


        insect.color();
        insect.size();
        insect.eat();
        insect.fly();

        ButterflyRunner butterflyRunner = new ButterflyRunner();
        butterflyRunner.info(insect);


        Insect insect1= new Butterfly();
        System.out.println("Using Parent as type");
        insect1.color();
        insect1.size();
        insect1.eat();
        insect1.fly();

        System.out.println("========================== Fish  and  Salmon (37) class================================");

        System.out.println("Using Parent ref");
        Arachnid arachnid= new Arachnid();

        SpiderRunner5 spiderRunner5 = new SpiderRunner5();
        spiderRunner5.info(arachnid);

        arachnid.color();
        arachnid.size();
        arachnid.eat();
        arachnid.run();


        Arachnid arachnid1= new Spider();
        System.out.println("Using Parent as type");
        arachnid1.color();
        arachnid1.size();
        arachnid1.eat();
        arachnid1.run();

        System.out.println("========================== Rodent  and  Mouse (38) class================================");

        System.out.println("Using Parent ref");
        Rodent rodent= new Rodent();


        rodent.color();
        rodent.size();
        rodent.eat();
        rodent.run();




        Rodent rodent1= new Mouse();
        System.out.println("Using Parent as type");
        rodent1.color();
        rodent1.size();
        rodent1.eat();
        rodent1.run();


        System.out.println("========================== Maraine  and  Dolphin (39) class================================");

        System.out.println("Using Parent ref");
        MarineMammal marineMammal= new MarineMammal();


        marineMammal.color();
        marineMammal.skill();
        marineMammal.eat();
        marineMammal.swim();




        MarineMammal marineMammal1= new Dolphin();
        System.out.println("Using Parent as type");
        marineMammal1.color();
        marineMammal1.skill();
        marineMammal1.eat();
        marineMammal1.swim();

        DolphinRunner dolphinRunner = new DolphinRunner();
        dolphinRunner.info(marineMammal1);

        System.out.println("========================== Vechicle  and  Bike (40) class================================");

        System.out.println("Using Parent ref");
//        MarineMammal marineMammal= new MarineMammal();


        vehicle.color();
        vehicle.speed();
        vehicle.model();
        vehicle.name();




        Vehicle vehicle2= new Bike();
        System.out.println("Using Parent as type");
        vehicle2.color();
        vehicle2.speed();
        vehicle2.model();
        vehicle2.name();

        BikeRunner bikeRunner = new BikeRunner();
        bikeRunner.info(vehicle2);

        System.out.println("========================== Wood  and  Stick (41) class================================");

        System.out.println("Using Parent ref");
//        MarineMammal marineMammal= new MarineMammal();


        wood.quality();
        wood.size();
        wood.type();
        wood.durability();



        Wood wood4= new Stick();
        System.out.println("Using Parent as type");
        wood4.quality();
        wood4.size();
        wood4.type();
        wood4.durability();

        System.out.println("========================== Boat  and  Yatch (42) class================================");

        System.out.println("Using Parent ref");
        Boat boat= new Boat();


        boat.space();
        boat.size();
        boat.space();
        boat.durability();

        YatchRunner yatchRunner = new YatchRunner();
        yatchRunner.info(boat);




        Boat boat1= new Yacht();
        System.out.println("Using Parent as type");
        boat1.speed();
        boat1.size();
        boat1.space();
        boat1.durability();

        System.out.println("========================== Aircraft  and  Jet (43) class================================");

        System.out.println("Using Parent ref");
        Aircraft aircraft=new Aircraft();


        aircraft.space();
        aircraft.speed();
        aircraft.size();
        aircraft.durability();

        JetRunner jet=new JetRunner();
        jet.info(aircraft);




        Aircraft aircraft1= new Jet();
        System.out.println("Using Parent as type");
        aircraft1.speed();
        aircraft1.size();
        aircraft1.space();
        aircraft1.durability();

        System.out.println("========================== Bicycle    and  MountainBike (44) class================================");

        System.out.println("Using Parent ref");
        Bicycle bicycle=new Bicycle();


        bicycle.speed();
        bicycle.size();
        bicycle.space();
        bicycle.durability();



        Bicycle bicycle1= new MountainBike();
        System.out.println("Using Parent as type");
        bicycle1.speed();
        bicycle1.size();
        bicycle1.space();
        bicycle1.durability();


        System.out.println("========================== Train    and  FreightTrain (45) class================================");

        System.out.println("Using Parent ref");
        Train45 train45=new Train45();


        train45.speed();
        train45.size();
        train45.space();
        train45.durability();


        FrightTrainRunner frightTrainRunner = new FrightTrainRunner();
        frightTrainRunner.info(train45);



        Train45 train451= new FreightTrain45();
        System.out.println("Using Parent as type");
        train451.speed();
        train451.size();
        train451.space();
        train451.durability();


        System.out.println("========================== MotorCycle    and  SportsBike (46) class================================");

        System.out.println("Using Parent ref");
        Motorcycle motorcycle=new Motorcycle();


        motorcycle.speed();
        motorcycle.size();
        motorcycle.space();
        motorcycle.durability();


        System.out.println("Using Child as reference");
        SportsBike sportsBike =new SportsBike();
        sportsBike.info();

        Motorcycle motorcycle1= new SportsBike();
        System.out.println("Using Parent as type");
        motorcycle1.speed();
        motorcycle1.size();
        motorcycle1.space();
        motorcycle1.durability();

        System.out.println("========================== Bus    and SchoolBus ( 47) class================================");

        System.out.println("Using Parent ref");
        Bus47 bus47=new Bus47();


        bus47.speed();
        bus47.size();
        bus47.space();
        bus47.durability();

        SchoolBusRunner schoolBusRunner = new SchoolBusRunner();
        schoolBusRunner.info(bus47);

        Bus47 bus471= new SchoolBus47();
        System.out.println("Using Parent as type");
        bus471.speed();
        bus471.size();
        bus471.space();
        bus471.durability();


        System.out.println("========================== Truck  and PickupTruck ( 48) class================================");

        System.out.println("Using Parent ref");
        Truck truck=new Truck();


        truck.speed();
        truck.size();
        truck.space();
        truck.durability();




        Truck truck1= new PickupTruck();
        System.out.println("Using Parent as type");
        truck1.speed();
        truck1.size();
        truck1.space();
        truck1.durability();


        System.out.println("========================== Submarine  and MilitarySubmarine ( 49) class================================");

        System.out.println("Using Parent ref");
        Submarine submarine=new Submarine();


        submarine.speed();
        submarine.size();
        submarine.space();
        submarine.durability();




        Submarine submarine1= new MilitarySubmarine();
        System.out.println("Using Parent as type");
        submarine1.speed();
        submarine1.size();
        submarine1.space();
        submarine1.durability();

        System.out.println("========================== Helicopter  and Rescue Helicopter ( 50) class================================");

        System.out.println("Using Parent ref");
        Helicopter helicopter=new Helicopter();


        helicopter.speed();
        helicopter.size();
        helicopter.space();
        helicopter.durability();


//        RunnereHelicopterRunner runnereHelicopterRunner = new RunnereHelicopterRunner();
//        runnereHelicopterRunner.info();


        Helicopter helicopter1= new RescueHelicopter();
        System.out.println("Using Parent as type");
        helicopter1.speed();
        helicopter1.size();
        helicopter1.space();
        helicopter1.durability();



        System.out.println("========================== Electronic Device  and SmartPhone ( 51) class================================");

        System.out.println("Using Parent ref");
        ElectronicDevice electronicDevice=new ElectronicDevice();


        electronicDevice.name();
        electronicDevice.warranty();
        electronicDevice.price();
        electronicDevice.quality();




        ElectronicDevice electronicDevice1= new SmartPhone();
        System.out.println("Using Parent as type");
        electronicDevice1.name();
        electronicDevice1.warranty();
        electronicDevice1.price();
        electronicDevice1.quality();

        SmartPhoneRunner smartPhoneRunner= new SmartPhoneRunner();
        smartPhoneRunner.info(electronicDevice);

        System.out.println("========================== Electronic Device  and SmartPhone ( 52) class================================");

        System.out.println("Using Parent ref");
        Computer computer=new Computer();


        computer.name();
        computer.warranty();
        computer.price();
        computer.quality();




        Computer computer1= new Laptop();
        System.out.println("Using Parent as type");
        computer1.name();
        computer1.warranty();
        computer1.price();
        computer1.quality();

        LaptopRunner laptopRunner = new LaptopRunner();
        laptopRunner.info(computer1);

        System.out.println("========================== Camera Device  and Dslr ( 53) class================================");

        System.out.println("Using Parent ref");
        Camera camera=new Camera();


        camera.name();
        camera.warranty();
        camera.price();
        camera.quality();


        DslrRunner dslrRunner = new DslrRunner();
        dslrRunner.info(camera);

        Camera camera1= new Dslr();
        System.out.println("Using Parent as type");
        camera1.name();
        camera1.warranty();
        camera1.price();
        camera1.quality();


        System.out.println("========================== Audio Device  and Speaker ( 54) class================================");

        System.out.println("Using Parent ref");
        AudioDevice audioDevice=new AudioDevice();


        audioDevice.name();
        audioDevice.warranty();
        audioDevice.price();
        audioDevice.quality();

        SpeakerRunner8 speakerRunner8 = new SpeakerRunner8();
        speakerRunner8.info(audioDevice);

        AudioDevice audioDevice1= new Speaker();
        System.out.println("Using Parent as type");
        audioDevice1.name();
        audioDevice1.warranty();
        audioDevice1.price();
        audioDevice1.quality();

        System.out.println("========================== Audio Device  and Speaker ( 55) class================================");

        System.out.println("Using Parent ref");
        HomeAppliance homeAppliance=new HomeAppliance();


        homeAppliance.name();
        homeAppliance.warranty();
        homeAppliance.price();
        homeAppliance.quality();




        HomeAppliance homeAppliance1= new Refrigerator();
        System.out.println("Using Parent as type");
        homeAppliance1.name();
        homeAppliance1.warranty();
        homeAppliance1.price();
        homeAppliance1.quality();
//
//        RefrigeratorRunner refrigeratorRunner = new RefrigeratorRunner();
//        refrigeratorRunner.info();

        System.out.println("========================== Television   and SmartTV ( 56) class================================");

        System.out.println("Using Parent ref");
        Television television=new Television();


        television.name();
        television.warranty();
        television.price();
        television.quality();




        Television television1= new SmartTv();
        System.out.println("Using Parent as type");
        television1.name();
        television1.warranty();
        television1.price();
        television1.quality();


        System.out.println("========================== GamingConsole   and PlayStation ( 57) class================================");

        System.out.println("Using Parent ref");
        GamingConsole gamingConsole =new GamingConsole();

        gamingConsole.name();
        gamingConsole.warranty();
        gamingConsole.price();
        gamingConsole.quality();




        GamingConsole gamingConsole1= new Playstation();
        System.out.println("Using Parent as type");
        gamingConsole1.name();
        gamingConsole1.warranty();
        gamingConsole1.price();
        gamingConsole1.quality();





        System.out.println("========================== Wearable   and Smartwatch ( 58) class================================");

        System.out.println("Using Parent ref");
        WearableTech wearableTech =new WearableTech();

        wearableTech.name();
        wearableTech.warranty();
        wearableTech.price();
        wearableTech.quality();


        System.out.println("Using Child as reference");
        SmartWatch  smartWatch=new SmartWatch();
        smartWatch.info();

        WearableTech wearableTech1= new SmartWatch();
        System.out.println("Using Parent as type");
        wearableTech1.name();
        wearableTech1.warranty();
        wearableTech1.price();
        wearableTech1.quality();


        System.out.println("========================== KitchenAppliance   and Microwave ( 59) class================================");

        System.out.println("Using Parent ref");
        KitchenAppliance kitchenAppliance =new KitchenAppliance();

        kitchenAppliance.name();
        kitchenAppliance.warranty();
        kitchenAppliance.price();
        kitchenAppliance.quality();




        KitchenAppliance kitchenAppliance1= new Microwave();
        System.out.println("Using Parent as type");
        kitchenAppliance1.name();
        kitchenAppliance1.warranty();
        kitchenAppliance1.price();
        kitchenAppliance1.quality();

        System.out.println("========================== Printer   and LaserPrinter ( 60) class================================");

        System.out.println("Using Parent ref");
        Printer printer =new Printer();

        printer.name();
        printer.warranty();
        printer.price();
        printer.quality();




        Printer printer1= new LaserPrinter();
        System.out.println("Using Parent as type");
        printer1.name();
        printer1.warranty();
        printer1.price();
        printer1.quality();

        System.out.println("========================== Person   and Teacher ( 61) class================================");

        System.out.println("Using Parent ref");
        Person person =new Person();

        person.name();
        person.walk();
        person.run();
        person.dancing();




        Person person1= new Teacher();
        System.out.println("Using Parent as type");
        person1.name();
        person1.walk();
        person1.run();
        person1.dancing();


        System.out.println("========================== Doctor   and Surgeon ( 62) class================================");

        System.out.println("Using Parent ref");
        Doctor doctor =new Doctor();

        doctor.name();
        doctor.licence();
        doctor.work();
        doctor.position();


        SurgeonRunner surgeonRunner = new SurgeonRunner();
        surgeonRunner.info(doctor);



        Doctor doctor1= new Surgeon();
        System.out.println("Using Parent as type");
        doctor1.name();
        doctor1.licence();
        doctor1.work();
        doctor1.position();

        System.out.println("========================== Artist   and Painter ( 63) class================================");

        System.out.println("Using Parent ref");
        Artist artist =new Artist();

        artist.name();
        artist.draw();
        artist.method();
        artist.signature();

        PainterRunner painter1 = new PainterRunner();
        painter1.info(artist);


        Artist artist1= new Painter();
        System.out.println("Using Parent as type");
        artist1.name();
        artist1.draw();
        artist1.method();
        artist1.signature();

        System.out.println("========================== Engineer   and CivilEngineer ( 64) class================================");

        System.out.println("Using Parent ref");
        Engineer engineer =new Engineer();

        engineer.name();
        engineer.work();
        engineer.title();
        engineer.salary();

        CivilEngineerRunner civilEngineer = new CivilEngineerRunner();
        civilEngineer.info(engineer);

        Engineer engineer1 = new CivilEngineer();
        System.out.println("Using Parent as type");
        engineer1.name();
        engineer1.work();
        engineer1.title();
        engineer1.salary();



        System.out.println("========================== Athlete   and SoccerPlayer ( 65) class================================");

        System.out.println("Using Parent ref");
        Athlete athlete =new Athlete();

        athlete.name();
        athlete.physique();
        athlete.position();
        athlete.salary();

        SocerRunner7 socerRunner7 = new SocerRunner7();
        socerRunner7.info(athlete);






        Athlete athlete1 = new SoccerPlayer();
        System.out.println("Using Parent as type");
        athlete1.name();
        athlete1.position();
        athlete1.physique();
        athlete1.salary();


        System.out.println("================================= END OF THE PROGRAMM ==================================");






    }
}
