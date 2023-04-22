public class interfaces implements car, person {
    public static void main(String[] args) {
        interfaces transformer = new interfaces();
        transformer.start();
        transformer.walk();
    }

    public void start() {
        System.out.println("My car is starting");
    }

    public void walk() {
        System.out.println("My person is walking");
    }
}

interface car {
    void start();
}

interface person {
    void walk();
}