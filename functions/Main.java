// Base class
class Number {
    int num;

    // Constructor to initialize the number
    public Number(int num) {
        this.num = num;
    }

    // Method to calculate square
    public int calculateSquare() {
        return num * num;
    }
}

// Derived class inheriting from Number
class SquareNumber extends Number {
    // Constructor to initialize the number using the base class constructor
    public SquareNumber(int num) {
        super(num);
    }

    // Method to display the square of the number
    public void displaySquare() {
        System.out.println("Square of " + num + " is: " + calculateSquare());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of SquareNumber
        SquareNumber squareNumber = new SquareNumber(5);

        // Display the square of the number
        squareNumber.displaySquare();
    }
}
