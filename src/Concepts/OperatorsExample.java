package Concepts;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));

        // Relational
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b? " + (a == b));

        // Logical
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("AND: " + (condition1 && condition2));
        System.out.println("OR: " + (condition1 || condition2));
    }
}
