public class abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}

class Audi extends car {

    void start() {
        System.out.println("Audi is starting");
    }

}

class BMW extends car {

    void start() {
        System.out.println("BmW is starting");
    }

}

abstract class car { // we do not make a object of class as it is a concept.
    // objects will be made of children of the parent class.
    int price;

    abstract void start();
    // System.out.println("Car is starting"); --> there is no need to do
    // implementation of abstract method.

}