package Concepts;

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        // 1️⃣ Bitwise AND (&)
        System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 (1)

        // 2️⃣ Bitwise OR (|)
        System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 (7)

        // 3️⃣ Bitwise XOR (^)
        System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 (6)

        // 4️⃣ Bitwise NOT (~)
        System.out.println("~a = " + (~a));        // ~0101 = 1010 (in 32-bit: -6)

        // 5️⃣ Left Shift (<<)
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 (10)

        // 6️⃣ Right Shift (>>)
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)

        // 7️⃣ Unsigned Right Shift (>>>)
        int negative = -8; // Binary: 11111111 11111111 11111111 11111000
        System.out.println("negative >>> 1 = " + (negative >>> 1));
    }
}
