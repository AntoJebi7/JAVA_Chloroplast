package OOPs.MethodOverLoading;

public class Main {
    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double numbers
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main calc = new Main();

        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
    }
}
