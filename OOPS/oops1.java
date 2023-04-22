class oops1 {
    public static void main(String[] args) {
        Person p1 = new Person(); // p1 = object
        p1.age = 24;
        p1.name = "Vedant";
        Person p2 = new Person(36, "Gaurav"); // p2 = object *after new Person() --> constructor

        // p2.age = 31;
        // p2.name = "Mohit";
        // if we now use this it will overwrite values given in parameters.

        // System.out.println(p1.age + " " + p1.name);
        // System.out.println(p2.age + " " + p2.name);
        // p1.eat();
        // p2.walk();
        // p2.walk(1000);
        // System.out.println(Person.count);
        // Developer d1 = new Developer(20, "Aditi");
        // d1.walk();
        encapsulation obj = new encapsulation();
        // encapsulation --> function is called from another class as it is public.
        obj.doWork();
    }
}

// Inheritence --> a child class is made and it will have all properties of the
// parent class.
class Developer extends Person {
    public Developer(int age, String name) {
        super(age, name);
    }

    void walk() {
        System.out.println("Developer " + name + " is walking.");
    }
}

class Person {
    String name;
    int age;
    static int count;

    public Person() { // constructor used to create objects.
        // counting number of persons created.
        count++;
        System.out.println("creating an object"); // when we wrote [Person p2 = new Person();] constructor was called .
                                                  // (2 person created --> 2 times called)
    }

    public Person(int age, String name) {
        // this(); // Person() will be called
        this.name = name; // name of this function is initialized
        this.age = age;
    }

    void walk() {
        System.out.println(name + " is walking ");
    }

    // polymorphism --> walk function called2 times , 1 with argument 1 without
    void walk(int steps) {
        System.out.println(name + " is walking " + steps);
    }

    void eat() {
        System.out.println(name + " is eating ");
    }
}