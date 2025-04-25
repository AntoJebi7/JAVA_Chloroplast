package Section_3_OOPs.Polymorphism_OOPS;
// compile time polymorphism - method overloading

class Calculator {

    // Method to add two integers

    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the first add() method (with two integers)
        System.out.println("Sum of two integers: " + calc.add(10, 20));

        // Calls the second add() method (with three integers)
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        // Calls the third add() method (with two doubles)
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));
    }
}
