package com.xworkz.StringOverRide.external;


import com.xworkz.StringOverRide.internal.*;


public class EqualRunner {
    public static void main(String[] args) {
        Android android1 = new Android(10,"nick","nike");
        Android android2 = new Android(11,"neymar","puma");
        Android android3 = new Android(13,"messi","adidas");

        boolean same = android1.equals(android2);
        boolean same1 = android2.equals(android1);
        boolean same3 = android1.equals(android3);
        System.out.println("android 1 and android 2  :"+ same+" android 1 and android 2  :"+"android 1 and android 2  :"+same1+"android 1 and android 2  :"+same3);


        Argentenia argen = new Argentenia(10,"nick","nike");
        Argentenia argen2 = new Argentenia(11,"neymar","puma");
        Argentenia argen3 = new Argentenia(13,"messi","adidas");

        System.out.println("Is the reference same of different");
        boolean a = argen.equals(argen2);
        boolean a1 = argen2.equals(argen);
        boolean a3 = argen.equals(argen3);
        System.out.println("argentenia 1 and argentenia 2  :"+ a+" argentenia 1 and argentenia 2  :"+"argentenia 1 and argentenia 2  :"+a1+"argentenia 1 and argentenia 2  :"+a3);


        Aries aries = new Aries(10,"nick","nike");
        Aries aries2 = new Aries(11,"neymar","puma");
        Aries aries3 = new Aries(13,"messi","adidas");

        System.out.println("Is the reference same of different");
        boolean b1 = aries.equals(aries2);
        boolean b21 = aries2.equals(aries);
        boolean b3 = aries.equals(aries3);
        System.out.println("aries 1 and ariestenia 2  :"+ b1+" aries 1 and ariestenia 2  :"+"aries 1 and aries 2  :"+b21+"arges 1 and aries 2  :"+b3);

        AutoRickshaw aurorikshaew = new AutoRickshaw(10,"nick","nike");
        AutoRickshaw aurorikshaew2 = new AutoRickshaw(11,"neymar","puma");
        AutoRickshaw aurorikshaew3 = new AutoRickshaw(13,"messi","adidas");

        System.out.println("Is the reference same of different");
        boolean c1 = aurorikshaew.equals(aurorikshaew2);
        boolean c21 = aurorikshaew2.equals(aurorikshaew);
        boolean c3 = aries.equals(aries3);
        System.out.println("autorikshaw 1 and autorikshaw 2  :"+ c1+" autorikshaw 1 and autorikshaw 2  :"+"autorikshaw 1 and autorikshaw 2  :"+c21+"autorikshaw 1 and autorikshaw 2  :"+b3);

        Bag bag = new Bag(10,"nick","nike");
        Bag bag2 = new Bag(11,"neymar","puma");
        Bag bag3 = new Bag(13,"messi","adidas");

        System.out.println("Is the reference same of different");
        boolean d1 = bag.equals(bag2);
        boolean d21 = bag2.equals(bag);
        boolean d3 = bag3.equals(bag3);
        System.out.println("bag 1 and bag 2  :"+ c1+" bag 1 and bag 2  :"+"bag 1 and bag 2  :"+c21+"bag 1 and bag 2  :"+b3);

        BasavaNagar basavanagar = new BasavaNagar(10,"nick","nike");
        BasavaNagar basavanagar2 = new BasavaNagar(11,"neymar","puma");
        BasavaNagar basavanagar3 = new BasavaNagar(13,"messi","adidas");

        System.out.println("Is the reference same of different");
        boolean d12 = basavanagar.equals(basavanagar2);
        boolean d212 = basavanagar2.equals(basavanagar);
        boolean d32 = basavanagar3.equals(basavanagar3);
        System.out.println("basavanagar 1 and basavanagar 2  :"+ d12+" basavanagar 1 and basavanagar 2  :"+"basavanagar 1 and basavanagar 2  :"+d212+"basavanagar 1 and basavanagar 2  :"+d32);

        Bed bed = new Bed(10,"nick","nike");
        Bed bed2 = new Bed(11,"neymar","puma");
        Bed bed3 = new Bed(13,"messi","adidas");

        boolean e = bed.equals(bed2);
        boolean e1 = bed2.equals(bed);
        boolean e3 = bed.equals(bed3);
        System.out.println("android 1 and android 2  :"+ e+" android 1 and android 2  :"+"android 1 and android 2  :"+e1+"android 1 and android 2  :"+e3);

        Brain64 brain = new Brain64(10,"nick","nike");
        Brain64 brain2 = new Brain64(11,"neymar","puma");
        Brain64 brain3 = new Brain64(13,"messi","adidas");

        boolean f = brain.equals(brain2);
        boolean f1 = brain2.equals(brain);
        boolean f3 = getAndroid1(brain).equals(brain3);
        System.out.println("android 1 and android 2  :"+ f+" android 1 and android 2  :"+"android 1 and android 2  :"+f1+"android 1 and android 2  :"+f3);

        Brazil62 brazil = new Brazil62(10,"nick","nike");
        Brazil62 brazil1 = new Brazil62(11,"neymar","puma");
        Brazil62 brazil2 = new Brazil62(13,"messi","adidas");

        boolean g = brazil.equals(brazil1);
        boolean g1 = brazil1.equals(brazil);
        boolean g3 = brazil.equals(brazil2);
        System.out.println("android 1 and android 2  :"+ g+" android 1 and android 2  :"+"android 1 and android 2  :"+g1+"android 1 and android 2  :"+g3);

        Bus bus = new Bus(10,"nick","nike");
        Bus bus1 = new Bus(11,"neymar","puma");
        Bus bus2 = new Bus(13,"messi","adidas");

        boolean buses = bus.equals(bus1);
        boolean buses1 = bus1.equals(bus);
        boolean buses3 = bus.equals(bus2);
        System.out.println("android 1 and android 2  :"+ buses+" android 1 and android 2  :"+"android 1 and android 2  :"+buses1+"android 1 and android 2  :"+buses3);

        Button button = new Button(10,"nick","nike");
        Button button1 = new Button(11,"neymar","puma");
        Button button2 = new Button(13,"messi","adidas");

        boolean buttons = button.equals(button1);
        boolean buttons1 = button1.equals(button);
        boolean buttons3 = button.equals(button2);
        System.out.println("android 1 and android 2  :"+ buttons+" android 1 and android 2  :"+"android 1 and android 2  :"+buttons1+"android 1 and android 2  :"+buttons3);

        Camera camera = new Camera(10,"nick","nike");
        Camera camera1 = new Camera(11,"neymar","puma");
        Camera camera2 = new Camera(13,"messi","adidas");

        boolean cameras = camera.equals(camera1);
        boolean cameras1 = camera1.equals(camera);
        boolean cameras3 = camera.equals(camera2);
        System.out.println("android 1 and android 2  :"+ same+" android 1 and android 2  :"+"android 1 and android 2  :"+same1+"android 1 and android 2  :"+same3);

        Car car = new Car(10,"nick","nike");
        Car car1 = new Car(11,"neymar","puma");
        Car car2 = new Car(13,"messi","adidas");

        boolean cars = car.equals(car1);
        boolean cars1 = car1.equals(car2);
        boolean cars3 = car.equals(car1);
        System.out.println("android 1 and android 2  :"+ cars+" android 1 and android 2  :"+"android 1 and android 2  :"+cars1+"android 1 and android 2  :"+cars3);

        Car41 Car41 = new Car41(10,"nick","nike");
        Car41 car412 = new Car41(11,"neymar","puma");
        Car41 car413 = new Car41(13,"messi","adidas");

        boolean cf1 = Car41.equals(car412);
        boolean cf2 = car412.equals(Car41);
        boolean cf3 = Car41.equals(car413);
        System.out.println("android 1 and android 2  :"+ cf1+" android 1 and android 2  :"+"android 1 and android 2  :"+cf2+"android 1 and android 2  :"+cf3);

        Carrom45 carrom = new Carrom45(10,"nick","nike");
        Carrom45 carrom1 = new Carrom45(11,"neymar","puma");
        Carrom45 carrom3 = new Carrom45(13,"messi","adidas");

        boolean sam = carrom.equals(carrom1);
        boolean sam1 = carrom1.equals(carrom);
        boolean sam3 = carrom.equals(carrom3);
        System.out.println("android 1 and android 2  :"+ sam+" android 1 and android 2  :"+"android 1 and android 2  :"+sam1+"android 1 and android 2  :"+sam3);

        Chain chain = new Chain(10,"nick","nike");
        Chain chain1 = new Chain(11,"neymar","puma");
        Chain chain3 = new Chain(13,"messi","adidas");

        boolean h = chain.equals(chain1);
        boolean h1 = chain1.equals(chain);
        boolean h3 = chain.equals(chain3);
        System.out.println("android 1 and android 2  :"+ h+" android 1 and android 2  :"+"android 1 and android 2  :"+h1+"android 1 and android 2  :"+h3);

        Chair38 chair = new Chair38(10,"nick","nike");
        Chair38 xhair1 = new Chair38(11,"neymar","puma");
        Chair38 chair2 = new Chair38(13,"messi","adidas");

        boolean chair1 = chair.equals(xhair1);
        boolean chair11 = xhair1.equals(chair);
        boolean chair13 = chair.equals(chair2);
        System.out.println("android 1 and android 2  :"+ chair1+" android 1 and android 2  :"+"android 1 and android 2  :"+chair11+"android 1 and android 2  :"+chair13);

        Chakka chakka = new Chakka(10,"nick","nike");
        Chakka chakka11 = new Chakka(11,"neymar","puma");
        Chakka chakkas = new Chakka(13,"messi","adidas");

        boolean cja = chakka.equals(chakka);
        boolean cja1 = chakka11.equals(chakkas);
        boolean cja3 = chakka.equals(chakkas);
        System.out.println("android 1 and android 2  :"+ cja+" android 1 and android 2  :"+"android 1 and android 2  :"+cja1+"android 1 and android 2  :"+cja3);

        Charger33 charger = new Charger33(10,"nick","nike");
        Charger33 charger1 = new Charger33(11,"neymar","puma");
        Charger33 charger2 = new Charger33(13,"messi","adidas");

        boolean chargers = charger.equals(charger1);
        boolean chargers1 = charger1.equals(charger);
        boolean chargers3 = charger.equals(charger2);
        System.out.println("android 1 and android 2  :"+ chargers+" android 1 and android 2  :"+"android 1 and android 2  :"+chargers1+"android 1 and android 2  :"+chargers3);

        ChatGpt chatgpt = new ChatGpt(10,"nick","nike");
        ChatGpt chatgpt1 = new ChatGpt(11,"neymar","puma");
        ChatGpt chatgpt2 = new ChatGpt(13,"messi","adidas");

        boolean chaat = chatgpt.equals(chatgpt1);
        boolean chaat1 = chatgpt1.equals(chatgpt);
        boolean chaat3 = chatgpt.equals(chatgpt2);
        System.out.println("android 1 and android 2  :"+ chaat+" android 1 and android 2  :"+"android 1 and android 2  :"+chaat1+"android 1 and android 2  :"+chaat3);

        Cheater29 cheater12 = new Cheater29(10,"nick","nike");
        Cheater29 cheater123 = new Cheater29(11,"neymar","puma");
        Cheater29 cheater = new Cheater29(13,"messi","adidas");

        boolean chear = cheater12.equals(cheater123);
        boolean chear1 = cheater123.equals(cheater12);
        boolean chear3 = cheater12.equals(cheater);
        System.out.println("android 1 and android 2  :"+ chear+" android 1 and android 2  :"+"android 1 and android 2  :"+chear1+"android 1 and android 2  :"+chear3);

        Cheeta cheeta = new Cheeta(10,"nick","nike");
        Cheeta cherta2 = new Cheeta(11,"neymar","puma");
        Cheeta cheeta1 = new Cheeta(13,"messi","adidas");

        boolean chettaa = cheeta.equals(cherta2);
        boolean chettaa1 = cherta2.equals(cheeta);
        boolean chettaa3 = cheeta.equals(cheeta1);
        System.out.println("android 1 and android 2  :"+ chettaa+" android 1 and android 2  :"+"android 1 and android 2  :"+chettaa1+"android 1 and android 2  :"+chettaa3);

        chottu chottu1 = new chottu(10,"nick","nike");
        chottu chottu2 = new chottu(11,"neymar","puma");
        chottu chottu3 = new chottu(13,"messi","adidas");

        boolean a45 = chottu1.equals(chottu2);
        boolean a451 = chottu2.equals(chottu3);
        boolean a453 = chottu1.equals(chottu3);
        System.out.println("android 1 and android 2  :"+ a45+" android 1 and android 2  :"+"android 1 and android 2  :"+a451+"android 1 and android 2  :"+a453);

        Clone78 clone = new Clone78(10,"nick","nike");
        Clone78 clone1 = new Clone78(11,"neymar","puma");
        Clone78 clone2 = new Clone78(13,"messi","adidas");

        boolean clones = clone.equals(clone1);
        boolean clones1 = clone1.equals(clone);
        boolean clones3 = clone.equals(clone2);
        System.out.println("android 1 and android 2  :"+ clones+" android 1 and android 2  :"+"android 1 and android 2  :"+clones1+"android 1 and android 2  :"+clones3);

        Coat coat = new Coat(10,"nick","nike");
        Coat coat1 = new Coat(11,"neymar","puma");
        Coat coat2 = new Coat(13,"messi","adidas");

        boolean coaters = coat.equals(coat1);
        boolean coaters1 = coat1.equals(coat);
        boolean coaters3 = coat.equals(coat2);
        System.out.println("android 1 and android 2  :"+ coaters+" android 1 and android 2  :"+"android 1 and android 2  :"+coaters1+"android 1 and android 2  :"+coaters3);

        Csk csk = new Csk(10,"nick","nike");
        Csk csk2 = new Csk(11,"neymar","puma");
        Csk csk3 = new Csk(13,"messi","adidas");

        boolean csks = csk.equals(csk2);
        boolean csks1 = csk2.equals(csk);
        boolean csks3 = csk.equals(csk3);
        System.out.println("android 1 and android 2  :"+ csks+" android 1 and android 2  :"+"android 1 and android 2  :"+csks1+"android 1 and android 2  :"+csks3);

        Dog50 dog50 = new Dog50(10,"nick","nike");
        Dog50 dog501 = new Dog50(11,"neymar","puma");
        Dog50 dog502 = new Dog50(13,"messi","adidas");

        boolean dogs = dog50.equals(dog501);
        boolean dogs1 = dog501.equals(dog50);
        boolean dogs3 = dog50.equals(dog502);
        System.out.println("android 1 and android 2  :"+ dogs+" android 1 and android 2  :"+"android 1 and android 2  :"+dogs1+"android 1 and android 2  :"+dogs3);

        Earings Earing = new Earings(10,"nick","nike");
        Earings earings = new Earings(11,"neymar","puma");
        Earings earings1 = new Earings(13,"messi","adidas");

        boolean earings2 = Earing.equals(earings);
        boolean earings21 = earings.equals(Earing);
        boolean earings23 = Earing.equals(earings21);
        System.out.println("android 1 and android 2  :"+ earings2+" android 1 and android 2  :"+"android 1 and android 2  :"+earings21+"android 1 and android 2  :"+earings23);

        EarPhone earphone = new EarPhone(10,"nick","nike");
        EarPhone earphone1 = new EarPhone(11,"neymar","puma");
        EarPhone earphone2 = new EarPhone(13,"messi","adidas");

        boolean earphones2 = earphone.equals(earphone1);
        boolean earphones21 = earphone1.equals(earphone);
        boolean earphones23 = earphone.equals(earphone2);
        System.out.println("android 1 and android 2  :"+ earphones2+" android 1 and android 2  :"+"android 1 and android 2  :"+earphones21+"android 1 and android 2  :"+earphones23);

        Eyes40 eyes = new Eyes40(10,"nick","nike");
        Eyes40 eyea1 = new Eyes40(11,"neymar","puma");
        Eyes40 eyes2 = new Eyes40(13,"messi","adidas");

        boolean eyse2 = eyes.equals(eyea1);
        boolean eyse21 = eyea1.equals(eyes);
        boolean eyse23 = eyes.equals(eyes2);
        System.out.println("android 1 and android 2  :"+ same+" android 1 and android 2  :"+"android 1 and android 2  :"+same1+"android 1 and android 2  :"+same3);

        FaceBook facebook = new FaceBook(10,"nick","nike");
        FaceBook facebook1 = new FaceBook(11,"neymar","puma");
        FaceBook facebook2 = new FaceBook(13,"messi","adidas");

        boolean facebook23 = facebook.equals(facebook1);
        boolean facebook231 = facebook1.equals(facebook);
        boolean facebook233 = facebook.equals(facebook2);
        System.out.println("android 1 and android 2  :"+ same+" android 1 and android 2  :"+"android 1 and android 2  :"+same1+"android 1 and android 2  :"+same3);

        FilterCoffie filterCoffe = new FilterCoffie(10,"nick","nike");
        FilterCoffie filterCoffew = new FilterCoffie(11,"neymar","puma");
        FilterCoffie filterCoffie3 = new FilterCoffie(13,"messi","adidas");

        boolean filtercoffiew = filterCoffe.equals(filterCoffew);
        boolean filtercoffiew1 = filterCoffew.equals(filterCoffe);
        boolean filtercoffiew3 = filterCoffe.equals(android3);
        System.out.println("android 1 and android 2  :"+ filtercoffiew+" android 1 and android 2  :"+"android 1 and android 2  :"+filtercoffiew1+"android 1 and android 2  :"+filtercoffiew3);

        Fire fire = new Fire(10,"nick","nike");
        Fire fires = new Fire(11,"neymar","puma");
        Fire firea4 = new Fire(13,"messi","adidas");

        boolean fire59 = fire.equals(fires);
        boolean fire591 = fires.equals(fire);
        boolean fire593 = fire.equals(firea4);
        System.out.println("android 1 and android 2  :"+ fire59+" android 1 and android 2  :"+"android 1 and android 2  :"+fire591+"android 1 and android 2  :"+fire593);

        Glass glass = new Glass(10,"nick","nike");
        Glass glass1 = new Glass(11,"neymar","puma");
        Glass glass2 = new Glass(13,"messi","adidas");

        boolean glass4 = glass.equals(glass1);
        boolean glass41 = glass1.equals(glass);
        boolean glass43 = glass.equals(glass2);
        System.out.println("android 1 and android 2  :"+ glass4+" android 1 and android 2  :"+"android 1 and android 2  :"+glass41+"android 1 and android 2  :"+glass43);

        Kind30 kind = new Kind30(10,"nick","nike");
        Kind30 kind2 = new Kind30(11,"neymar","puma");
        Kind30 kind3 = new Kind30(13,"messi","adidas");

        boolean kinds = kind.equals(kind2);
        boolean kinds1 = kind2.equals(kind);
        boolean kinds3 = kind.equals(kind3);
        System.out.println("android 1 and android 2  :"+ kinds+" android 1 and android 2  :"+"android 1 and android 2  :"+kinds1+"android 1 and android 2  :"+kinds3);

        Laptop laptop = new Laptop(10,"nick","nike");
        Laptop laptop2 = new Laptop(11,"neymar","puma");
        Laptop laptop3 = new Laptop(13,"messi","adidas");

        boolean laptops = laptop.equals(laptop2);
        boolean laptops1 = laptop2.equals(laptop);
        boolean laptops3 = laptop.equals(laptop3);
        System.out.println("android 1 and android 2  :"+ laptops+" android 1 and android 2  :"+"android 1 and android 2  :"+laptops1+"android 1 and android 2  :"+laptops3);

        Libra libras = new Libra(10,"nick","nike");
        Libra librass = new Libra(11,"neymar","puma");
        Libra librasss = new Libra(13,"messi","adidas");

        boolean lib = libras.equals(librass);
        boolean lib1 = librass.equals(libras);
        boolean lib3 = libras.equals(android3);
        System.out.println("android 1 and android 2  :"+ lib+" android 1 and android 2  :"+"android 1 and android 2  :"+lib1+"android 1 and android 2  :"+lib3);

        Kind30 kind34 = new Kind30(10,"nick","nike");
        Kind30 kind30 = new Kind30(11,"neymar","puma");
        Kind30 kind301 = new Kind30(13,"messi","adidas");

        boolean kin = kind3.equals(android2);
        boolean kin1 = android2.equals(kind3);
        boolean kin3 = kind3.equals(android3);
        System.out.println("android 1 and android 2  :"+ kin+" android 1 and android 2  :"+"android 1 and android 2  :"+kin1+"android 1 and android 2  :"+kin3);

        Mobile mobile = new Mobile(10,"nick","nike");
        Mobile mobile1 = new Mobile(11,"neymar","puma");
        Mobile mobile3 = new Mobile(13,"messi","adidas");

        boolean mobiles = mobile.equals(mobile1);
        boolean mobiles1 = mobile1.equals(mobile);
        boolean mobiles3 = mobile.equals(mobile3);
        System.out.println("android 1 and android 2  :"+ mobiles+" android 1 and android 2  :"+"android 1 and android 2  :"+mobiles1+"android 1 and android 2  :"+mobiles3);

        Gtr gtrs = new Gtr(10,"nick","nike");
        Gtr gtr = new Gtr(11,"neymar","puma");
        Gtr gt = new Gtr(13,"messi","adidas");

        boolean gte = gtrs.equals(android2);
        boolean gte1 = android2.equals(gtrs);
        boolean gte3 = gtrs.equals(gt);
        System.out.println("android 1 and android 2  :"+ gte+" android 1 and android 2  :"+"android 1 and android 2  :"+gte1+"android 1 and android 2  :"+gte3);

        IceCream iceCream = new IceCream(10,"nick","nike");
        IceCream iceCream1 = new IceCream(11,"neymar","puma");
        IceCream iceCream2 = new IceCream(13,"messi","adidas");

        boolean iceCream3 = iceCream.equals(iceCream1);
        boolean iceCream31 = iceCream1.equals(iceCream);
        boolean iceCream33 = iceCream.equals(iceCream2);
        System.out.println("android 1 and android 2  :"+ same+" android 1 and android 2  :"+"android 1 and android 2  :"+same1+"android 1 and android 2  :"+same3);

        Instagram instagram = new Instagram(10,"nick","nike");
        Instagram instagram1 = new Instagram(11,"neymar","puma");
        Instagram instagram2 = new Instagram(13,"messi","adidas");

        boolean insta3 = instagram.equals(instagram1);
        boolean insta31 = instagram1.equals(instagram);
        boolean insta33 = instagram.equals(instagram2);
        System.out.println("android 1 and android 2  :"+ insta3+" android 1 and android 2  :"+"android 1 and android 2  :"+insta31+"android 1 and android 2  :"+insta33);

        Iphone insta = new Iphone(10,"nick","nike");
        Iphone iphone = new Iphone(11,"neymar","puma");
        Iphone iphonea = new Iphone(13,"messi","adidas");

        boolean iphones = insta.equals(iphone);
        boolean iphones1 = iphone.equals(insta);
        boolean iphones3 = insta.equals(iphonea);
        System.out.println("android 1 and android 2  :"+ iphones+" android 1 and android 2  :"+"android 1 and android 2  :"+iphones1+"android 1 and android 2  :"+iphones3);

        Kerala kerala = new Kerala(10,"nick","nike");
        Kerala keralas = new Kerala(11,"neymar","puma");
        Kerala keralass = new Kerala(13,"messi","adidas");

        boolean keralamallu = kerala.equals(keralas);
        boolean keralamallu1 = keralas.equals(kerala);
        boolean keralamallu3 = kerala.equals(keralass);
        System.out.println("android 1 and android 2  :"+ keralamallu+" android 1 and android 2  :"+"android 1 and android 2  :"+keralamallu1+"android 1 and android 2  :"+keralamallu3);

        Key27 key = new Key27(10,"nick","nike");
        Key27 key23 = new Key27(11,"neymar","puma");
        Key27 keys = new Key27(13,"messi","adidas");

        boolean keysa = key.equals(key23);
        boolean keysa1 = key23.equals(key);
        boolean keysa3 = key.equals(key);
        System.out.println("android 1 and android 2  :"+ keysa+" android 1 and android 2  :"+"android 1 and android 2  :"+keysa1+"android 1 and android 2  :"+keysa3);


        Monalisa monalisa = new Monalisa(21,"ramu","jonsy");
        Monalisa monalisa2= new Monalisa(30,"chommu","dinga");
        Monalisa monalisa3= new Monalisa(19,"tummy","rumu");


        boolean monu = monalisa.equals(monalisa2);
        boolean monu2 = monalisa2.equals(monalisa3);
        boolean monu3 = monalisa3.equals(monalisa);

        NailCutter26 nailCutter = new NailCutter26(21,"ramu","jonsy");
        NailCutter26 nailCutter2= new NailCutter26(30,"chommu","dinga");
        NailCutter26 nailCutter3= new NailCutter26(19,"tummy","rumu");

        boolean nailCutters = nailCutter.equals(nailCutter2);
        boolean nailCutters2 = nailCutter2.equals(nailCutter3);
        boolean nailCutters3 = nailCutter3.equals(monalisa);

        Pain21 pains = new Pain21(21,"ramu","jonsy");
        Pain21 pains2= new Pain21(30,"chommu","dinga");
        Pain21 pains3= new Pain21(19,"tummy","rumu");

        boolean painsd = pains.equals(pains2);
        boolean painsd2 = pains2.equals(pains3);
        boolean painsd3 = pains3.equals(pains);

        Pant pant = new Pant(21,"ramu","jonsy");
        Pant pant2= new Pant(30,"chommu","dinga");
        Pant pant3= new Pant(19,"tummy","rumu");

        boolean pants = pant.equals(pant2);
        boolean pants2 = pant2.equals(pant3);
        boolean pants3 = pant3.equals(pant);







    }

    private static Brain64 getAndroid1(Brain64 android1) {
        return android1;
    }
}
