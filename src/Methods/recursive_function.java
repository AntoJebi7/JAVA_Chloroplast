package Methods;

public class recursive_function {
    static int fibonacci(int n) {
        if (n <= 1) return n; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6)); // Output: 8
    }
}
