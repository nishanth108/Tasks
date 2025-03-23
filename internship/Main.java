
class ByteExample {
    byte a, b, c, d, e;
    void display() {
        a = 10; b = 20; c = 30; d = 40; e = 50;
        System.out.println("Initial byte values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 60; b = 70; c = 80; d = 90; e = 100;
        System.out.println("Reinitialized byte values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class ShortExample {
    short a, b, c, d, e;
    void display() {
        a = 1000; b = 2000; c = 3000; d = 4000; e = 5000;
        System.out.println("Initial short values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 6000; b = 7000; c = 8000; d = 9000; e = 10000;
        System.out.println("Reinitialized short values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class IntExample {
    int a, b, c, d, e;
    void display() {
        a = 10000; b = 20000; c = 30000; d = 40000; e = 50000;
        System.out.println("Initial int values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 60000; b = 70000; c = 80000; d = 90000; e = 100000;
        System.out.println("Reinitialized int values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class LongExample {
    long a, b, c, d, e;
    void display() {
        a = 100000L; b = 200000L; c = 300000L; d = 400000L; e = 500000L;
        System.out.println("Initial long values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 600000L; b = 700000L; c = 800000L; d = 900000L; e = 1000000L;
        System.out.println("Reinitialized long values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class FloatExample {
    float a, b, c, d, e;
    void display() {
        a = 1.1f; b = 2.2f; c = 3.3f; d = 4.4f; e = 5.5f;
        System.out.println("Initial float values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 6.6f; b = 7.7f; c = 8.8f; d = 9.9f; e = 10.1f;
        System.out.println("Reinitialized float values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class DoubleExample {
    double a, b, c, d, e;
    void display() {
        a = 1.11; b = 2.22; c = 3.33; d = 4.44; e = 5.55;
        System.out.println("Initial double values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 6.66; b = 7.77; c = 8.88; d = 9.99; e = 10.10;
        System.out.println("Reinitialized double values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class CharExample {
    char a, b, c, d, e;
    void display() {
        a = 'A'; b = 'B'; c = 'C'; d = 'D'; e = 'E';
        System.out.println("Initial char values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = 'F'; b = 'G'; c = 'H'; d = 'I'; e = 'J';
        System.out.println("Reinitialized char values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


class BooleanExample {
    boolean a, b, c, d, e;
    void display() {
        a = true; b = false; c = true; d = false; e = true;
        System.out.println("Initial boolean values: " + a + " " + b + " " + c + " " + d + " " + e);
        a = false; b = true; c = false; d = true; e = false;
        System.out.println("Reinitialized boolean values: " + a + " " + b + " " + c + " " + d + " " + e);
    }
}


public class Main {
    public static void main(String[] args) {
       ByteExample byteExample= new ByteExample();
	   byteExample.display();
        new ShortExample().display();
        new IntExample().display();
        new LongExample().display();
        new FloatExample().display();
        new DoubleExample().display();
        new CharExample().display();
        new BooleanExample().display();
    }
}
