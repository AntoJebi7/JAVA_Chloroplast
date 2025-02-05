package Concepts;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // 1️⃣ Logical AND (&&)
        System.out.println("Logical AND (&&):");
        System.out.println("true && false = " + (a && b));  // false
        System.out.println("true && true = " + (a && true));  // true

        // 2️⃣ Logical OR (||)
        System.out.println("\nLogical OR (||):");
        System.out.println("true || false = " + (a || b));  // true
        System.out.println("false || false = " + (b || false));  // false

        // 3️⃣ Logical NOT (!)
        System.out.println("\nLogical NOT (!):");
        System.out.println("!true = " + (!a));  // false
        System.out.println("!false = " + (!b));  // true

        // 4️⃣ Bitwise AND (&) vs Logical AND (&&)
        System.out.println("\nBitwise AND (&) vs Logical AND (&&):");
        System.out.println("true & false = " + (a & b));   // false (bitwise AND)
        System.out.println("true && false = " + (a && b)); // false (logical AND)

        // 5️⃣ Bitwise OR (|) vs Logical OR (||)
        System.out.println("\nBitwise OR (|) vs Logical OR (||):");
        System.out.println("true | false = " + (a | b));   // true (bitwise OR)
        System.out.println("true || false = " + (a || b)); // true (logical OR)

        // 6️⃣ Short-circuit behavior
        System.out.println("\nShort-circuit Example:");
        int x = 5;
        if (x > 0 || (++x > 10)) {  // Short-circuit: (++x) is not evaluated
            System.out.println("x after OR short-circuit: " + x); // x is still 5
        }

        if (x > 0 & (++x > 10)) {   // Bitwise AND: (++x) is evaluated
            System.out.println("This won't print");
        }
        System.out.println("x after Bitwise AND: " + x); // x is now 6
    }
}
